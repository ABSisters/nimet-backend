package absisters.nimet.service;

import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Resposta;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.RespostaMapper;
import absisters.nimet.dto.RespostaPostRequest;
import absisters.nimet.dto.RespostaResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.exception.PerguntaFechada;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.RespostaRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public RespostaResponse create(String usuarioId, String perguntaId, RespostaPostRequest request) {
        Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);
        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
        }

        Pergunta pergunta = perguntaRepository.findByPerguntaId(perguntaId);
        if(pergunta == null){
            throw new ObjetoNaoExiste("Pergunta", "id", perguntaId);
        }
        if(pergunta.getStatus() == false){
            throw new PerguntaFechada(perguntaId);
        }

        Resposta resposta = respostaRepository.save(
                new Resposta(usuario, pergunta, request.resposta()));
        logger.info("Usuário com id " + usuario.getUsuarioId() + " adicionou a resposta com id " + resposta.getRespostaId() + " para a pergunta com id " + pergunta.getPerguntaId());

        return respostaMapper.to(resposta);
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
}
