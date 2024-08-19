package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "questoes")
@Data
public class Questao {

    @Id
    private String questaoId;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    private String questao;

    @OneToMany
    @Column(name = "opcoes")
    @JoinColumn(name = "questaoId")
//    @JoinTable(name = "opcoes", joinColumns = @JoinColumn(name = "questaoId"))
    private List<Opcao> opcoes;

    public Questao() {
        // TODO Auto-generated constructor stub
    }

    public String getQuestaoId() {
        return questaoId;
    }

    public void setQuestaoId(String questaoId) {
        this.questaoId = questaoId;
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

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public List<Opcao> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<Opcao> opcoes) {
        this.opcoes = opcoes;
    }
}
