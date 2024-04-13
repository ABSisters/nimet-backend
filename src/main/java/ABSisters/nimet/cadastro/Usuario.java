package ABSisters.nimet.cadastro;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    private UUID usuarioId;

    private String nome;
    private String username;
    private String email;
    private boolean emailValido;
    private Date dataNascimento;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    public Usuario(String nome, String username, String email, Date dataNascimento, String senha, Curso curso){
        this.usuarioId = UUID.randomUUID();
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.emailValido = false;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.curso = curso;
        this.tipoUsuario = TipoUsuario.ESTUDANTE;
    }
}
