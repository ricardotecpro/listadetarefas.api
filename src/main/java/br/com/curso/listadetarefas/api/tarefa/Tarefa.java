// caminho do pacote
package br.com.curso.listadetarefas.api.tarefa;


// fazem os imports das bibliotecas
import jakarta.persistence.*;
import lombok.Data;

// @ são as annotations do Spring
@Data
@Entity
@Table(name = "tb_tarefas")

public class Tarefa {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private boolean concluida;    

}
