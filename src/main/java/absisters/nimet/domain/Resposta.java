package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "respostas")
@Data
public class Resposta {
    @Id
    private String respostaId;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;

    private String resposta;
    private LocalDateTime dataCriado;

    public Resposta(Usuario usuario, Pergunta pergunta, String resposta) {
        this.respostaId = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.dataCriado = LocalDateTime.now();
    }

    public Resposta() {
        // TODO Auto-generated constructor stub
    }

    public String getRespostaId() {
        return respostaId;
    }

    public void setRespostaId(String respostaId) {
        this.respostaId = respostaId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public LocalDateTime getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(LocalDateTime dataCriado) {
        this.dataCriado = dataCriado;
    }
}
