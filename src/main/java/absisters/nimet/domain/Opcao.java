package absisters.nimet.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "opcoes")
@Data
public class Opcao {

    @Id
    private String opcaoId;

    private String questaoId;
    private String opcao;
    private Boolean correta;

    public Opcao() {
        // TODO Auto-generated constructor stub
    }

    public String getOpcaoId() {
        return opcaoId;
    }

    public void setOpcaoId(String opcaoId) {
        this.opcaoId = opcaoId;
    }

    public String getQuestaoId() {
        return questaoId;
    }

    public void setQuestaoId(String questaoId) {
        this.questaoId = questaoId;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public Boolean getCorreta() {
        return correta;
    }

    public void setCorreta(Boolean correta) {
        this.correta = correta;
    }
}
