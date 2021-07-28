package com.dio.ControleAcesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TipoData {
    @Id
    private long id;
    private String descricao;
}
