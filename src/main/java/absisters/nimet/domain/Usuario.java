package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Usuario {
    @Id
    private String usuarioId;

    private String nome;
    private String username;
    private String email;
    private boolean emailValido;
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
	
	public String setUsuarioId() {
		return this.usuarioId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String setNome() {
		return this.nome;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String setUserName() {
		return this.username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String setEmail() {
		return this.email;
	}
	
	public boolean getEmailValido() {
		return emailValido;
	}
	
	public boolean setEmailValido(boolean b) {
		return this.emailValido;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public LocalDate setDataNascimento() {
		return this.dataNascimento;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String setSenha() {
		return this.senha;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Curso setCurso() {
		return this.curso;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
	public TipoUsuario setTipoUsuario() {
		return this.tipoUsuario;
	}
	
	public LocalDateTime getDataCriado() {
		return dataCriado;
	}

	public LocalDateTime setDataCriado() {
		return this.dataCriado;
	}
}

