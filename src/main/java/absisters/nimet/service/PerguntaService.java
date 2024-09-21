package absisters.nimet.service;

import java.util.List;

import absisters.nimet.domain.*;
import absisters.nimet.repository.RespostaRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import absisters.nimet.dto.Mapper.PerguntaMapper;
import absisters.nimet.dto.Request.PerguntaPostRequest;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.exception.AcessoNegado;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PerguntaService {
    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private PerguntaMapper perguntaMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RespostaRepository respostaRepository;

    private static Logger logger = LogManager.getLogger();

    public PerguntaResponse create(PerguntaPostRequest request) {
        Usuario usuario = usuarioRepository.findByUsuarioId(request.usuarioId());

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", request.usuarioId());
        }

        Pergunta pergunta = perguntaRepository.save(
                new Pergunta(usuario.getCurso(), usuario, request.titulo(), request.detalhes(), request.tags()));
        logger.info("Usuário com id " + usuario.getUsuarioId() + " criou a adicionou a pergunta com id " + pergunta.getPerguntaId());

        return perguntaMapper.to(pergunta);
    }

    public List<PerguntaResponse> getPerguntasDoUsuario(String usuarioId) {
        Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
        }

        List<Pergunta> perguntas = perguntaRepository.findAllByUsuario(usuario);
        logger.info("Usuário com id " + usuario.getUsuarioId() + " solicitou as suas perguntas");

        return perguntaMapper.to(perguntas);
    }

    public List<PerguntaResponse> getPerguntasDoCurso(Curso curso) {
        List<Pergunta> perguntas = perguntaRepository.findAllByCurso(curso);
        logger.info("Usuário solicitou as perguntas do curso " + curso);

        return perguntaMapper.to(perguntas);
    }

    public PerguntaResponse getPergunta(String perguntaId) {
        Pergunta pergunta = perguntaRepository.findByPerguntaId(perguntaId);

        if(pergunta == null){
            throw new ObjetoNaoExiste("Pergunta", "id", perguntaId);
        }

        logger.info("Usuário solicitou uma pergunta com id " + perguntaId);

        return perguntaMapper.to(pergunta);
    }
    
   public List<PerguntaResponse> getPerguntaByTag(Tags tags) {
       List<Pergunta> perguntas = perguntaRepository.findAllByTags(tags);
         
       if (perguntas.isEmpty()) {
           logger.info("Nenhuma pergunta encontrada para a tag: " + tags);
       } else {
           logger.info("Usuário solicitou perguntas com a tag: " + tags);
       }

       return perguntaMapper.to(perguntas);
   }

   public void delete(String perguntaId, String usuarioId) {
        Pergunta pergunta = perguntaRepository.findByPerguntaId(perguntaId);

        if(pergunta == null){
            throw new ObjetoNaoExiste("Pergunta", "id", perguntaId);
        }

        if (!pergunta.getUsuario().getUsuarioId().equals(usuarioId)) {
            throw new AcessoNegado("Usuário não tem permissão para deletar esta pergunta.");
        }

        List<Resposta> respostas = respostaRepository.findAllByPergunta(pergunta);
       if(!respostas.isEmpty()){
           respostaRepository.deleteAll(respostas);
       }
            
        perguntaRepository.deleteById(perguntaId);
        logger.info("Usuário deletou a pergunta com id " + perguntaId);
   }
    
   public PerguntaResponse fecharPergunta(String perguntaId, String usuarioId) {
       Pergunta pergunta = perguntaRepository.findByPerguntaId(perguntaId);

       if (pergunta == null) {
           throw new ObjetoNaoExiste("Pergunta", "id", perguntaId);
       }

       if (!pergunta.getUsuario().getUsuarioId().equals(usuarioId)) {
           throw new AcessoNegado("Usuário não tem permissão para fechar esta pergunta.");
       }

       pergunta.setStatus(false);
       perguntaRepository.save(pergunta);
       logger.info("Usuário com id " + usuarioId + " fechou a pergunta com id " + perguntaId);

       return perguntaMapper.to(pergunta);
   }
}