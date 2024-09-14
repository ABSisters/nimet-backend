package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "quiz")
@Data
public class Quiz {

    @Id
    private String quizId;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    private Integer acertos;
    private Integer erros;
    private LocalDateTime dataCriado;

    public Quiz(Usuario usuario, Curso curso, Nivel nivel, Integer acertos, Integer erros){
        this.quizId = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.curso = curso;
        this.nivel = nivel;
        this.acertos = acertos;
        this.erros = erros;
        this.dataCriado = LocalDateTime.now();
    }

    public Quiz() {
        // TODO Auto-generated constructor stub
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Integer getAcertos() {
        return acertos;
    }

    public void setAcertos(Integer acertos) {
        this.acertos = acertos;
    }

    public Integer getErros() {
        return erros;
    }

    public void setErros(Integer erros) {
        this.erros = erros;
    }

    public LocalDateTime getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(LocalDateTime dataCriado) {
        this.dataCriado = dataCriado;
    }
}
