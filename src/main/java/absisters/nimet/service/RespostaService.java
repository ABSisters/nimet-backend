package absisters.nimet.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Mapper.RespostaMapper;
import absisters.nimet.dto.Request.RespostaPostRequest;
import absisters.nimet.dto.Response.RespostaResponse;
import absisters.nimet.exception.AcessoNegado;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.exception.PerguntaFechada;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.RespostaRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RespostaService {
    @Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private RespostaMapper respostaMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerguntaRepository perguntaRepository;

    private static Logger logger = LogManager.getLogger();

    public RespostaResponse create(RespostaPostRequest request) {
        Usuario usuario = usuarioRepository.findByUsuarioId(request.usuarioId());
        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", request.usuarioId());
        }

        Pergunta pergunta = perguntaRepository.findByPerguntaId(request.perguntaId());
        if(pergunta == null){
            throw new ObjetoNaoExiste("Pergunta", "id", request.perguntaId());
        }
        if(pergunta.getStatus() == false){
            throw new PerguntaFechada(request.perguntaId());
        }

        Resposta resposta = respostaRepository.save(
                new Resposta(usuario, pergunta, request.resposta()));
        logger.info("Usuário com id " + usuario.getUsuarioId() + " adicionou a resposta com id " + resposta.getRespostaId() + " para a pergunta com id " + pergunta.getPerguntaId());

        return respostaMapper.to(resposta);
    }

    public List<RespostaResponse> getRespostasDoUsuario(String usuarioId) {
        Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
        }

        List<Resposta> respostas = respostaRepository.findAllByUsuario(usuario);
        logger.info("Usuário com id " + usuario.getUsuarioId() + " solicitou as suas respostas");

        return respostaMapper.to(respostas);
    }

    public List<RespostaResponse> getRespostasDeUmaPergunta(String perguntaId) {
        Pergunta pergunta = perguntaRepository.findByPerguntaId(perguntaId);

        if(pergunta == null){
            throw new ObjetoNaoExiste("Pergunta", "id", perguntaId);
        }

        List<Resposta> respostas = respostaRepository.findAllByPergunta(pergunta);

        logger.info("Usuário solicitou as respostas da pergunta " + pergunta.getPerguntaId());

        return respostaMapper.to(respostas);
    }
    
    public void deleteResposta(String respostaId, String usuarioId) {
        Resposta resposta = respostaRepository.findByRespostaId(respostaId);

        if (resposta == null) {
            throw new ObjetoNaoExiste("Resposta", "id", respostaId);
        }

        // Verifica se o usuário é o criador da resposta
        if (!resposta.getUsuario().getUsuarioId().equals(usuarioId)) {
            throw new AcessoNegado("Usuário não tem permissão para deletar esta resposta.");
        }

        respostaRepository.deleteById(respostaId);
        logger.info("Usuário com id " + usuarioId + " deletou a resposta com id " + respostaId);
    }
}