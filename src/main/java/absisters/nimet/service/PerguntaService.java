package absisters.nimet.service;

import absisters.nimet.domain.Curso;
import absisters.nimet.domain.Pergunta;
import absisters.nimet.domain.Usuario;
import absisters.nimet.dto.Mapper.PerguntaMapper;
import absisters.nimet.dto.Request.PerguntaPostRequest;
import absisters.nimet.dto.Response.PerguntaResponse;
import absisters.nimet.exception.ObjetoNaoExiste;
import absisters.nimet.repository.PerguntaRepository;
import absisters.nimet.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PerguntaService {
    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private PerguntaMapper perguntaMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    private static Logger logger = LogManager.getLogger();

    public PerguntaResponse create(String usuarioId, PerguntaPostRequest request) {
        Usuario usuario = usuarioRepository.findByUsuarioId(usuarioId);

        if(usuario == null){
            throw new ObjetoNaoExiste("Usuário", "id", usuarioId);
        }

        Pergunta pergunta = perguntaRepository.save(
                new Pergunta(usuario.getCurso(), usuario, request.titulo(), request.detalhes(), request.tags()));
        logger.info("Usuário com id " + usuario.getUsuarioId() + " criou a adicionou a pergunta com id " + pergunta.getPerguntaId());

        return perguntaMapper.to(pergunta);
    }

    public List<PerguntaResponse> getPerguntasDoCurso(Curso curso) {
        List<Pergunta> perguntas = perguntaRepository.findAllByCurso(curso);
        logger.info("Usuário solicitou as perguntas do curso " + curso);

        return perguntaMapper.to(perguntas);
    }
}