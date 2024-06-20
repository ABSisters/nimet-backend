package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "perguntas")
@Data
public class Pergunta {
    @Id
    private String perguntaId;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @ManyToOne
    private Usuario usuario;

    private String titulo;
    private String detalhes;
    private List<Tags> tags;
    private Boolean status;
    private LocalDateTime dataCriado;

    public Pergunta(Curso curso, Usuario usuario, String titulo, String detalhes, List<Tags> tags) {
        this.perguntaId = UUID.randomUUID().toString();
        this.curso = curso;
        this.usuario = usuario;
        this.titulo = titulo;
        this.detalhes = detalhes;
        this.tags = tags;
        this.status = true;
        this.dataCriado = LocalDateTime.now();
    }

    public Pergunta() {
        // TODO Auto-generated constructor stub
    }

    public String getPerguntaId() {
        return perguntaId;
    }

    public void setPerguntaId(String perguntaId) {
        this.perguntaId = perguntaId;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(LocalDateTime dataCriado) {
        this.dataCriado = dataCriado;
    }
}
