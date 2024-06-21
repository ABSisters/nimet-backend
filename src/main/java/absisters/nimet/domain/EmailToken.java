package absisters.nimet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emailtoken")
@Data
public class EmailToken {
    @Id
    private String tokenId;

    @OneToOne
    private Usuario usuario;

    private Integer token;
    private LocalDateTime dataExpirado;
    private LocalDateTime dataCriado;

    public EmailToken(Usuario usuario, Integer token) {
        this.tokenId = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.token = token;
        this.dataExpirado = LocalDateTime.now().plusDays(1);
        this.dataCriado = LocalDateTime.now();
    }


    public EmailToken() {
        // TODO Auto-generated constructor stub
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public LocalDateTime getDataExpirado() {
        return dataExpirado;
    }

    public void setDataExpirado(LocalDateTime dataExpirado) {
        this.dataExpirado = dataExpirado;
    }

    public LocalDateTime getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(LocalDateTime dataCriado) {
        this.dataCriado = dataCriado;
    }
}
