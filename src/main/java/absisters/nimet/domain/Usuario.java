package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {
    @Id
    private String usuarioId;

    private String nome;
    private String username;
    private String email;
    private Boolean emailValido;
    private LocalDate dataNascimento;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    private LocalDateTime dataCriado;

    public Usuario(String nome, String username, String email, LocalDate dataNascimento, String senha, Curso curso){
        this.usuarioId = UUID.randomUUID().toString();
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.emailValido = false;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.curso = curso;
        this.tipoUsuario = TipoUsuario.ESTUDANTE;
        this.dataCriado = LocalDateTime.now();
    }


    public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEmailValido() {
		return emailValido;
	}

	public void setEmailValido(Boolean emailValido) {
		this.emailValido = emailValido;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public LocalDateTime getDataCriado() {
		return dataCriado;
	}

	public void setDataCriado(LocalDateTime dataCriado) {
		this.dataCriado = dataCriado;
	}
}

