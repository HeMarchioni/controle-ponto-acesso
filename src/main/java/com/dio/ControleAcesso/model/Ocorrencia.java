package com.dio.ControleAcesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Ocorrencia {

    @Id
    private long id;

    private String nome;

    private String descricao;
}
