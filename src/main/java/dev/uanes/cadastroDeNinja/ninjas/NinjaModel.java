package dev.uanes.cadastroDeNinja.ninjas;

import dev.uanes.cadastroDeNinja.missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - Um Ninja tem uma única missão!
    @ManyToOne
    @JoinColumn(name = "missao_id") // Foreing Key - Chave estrangeira, uma tabela dentro de uma tabela
    private MissaoModel missao;

}
