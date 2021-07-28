package com.dio.ControleAcesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Localidade {

    @Id
    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;


}
