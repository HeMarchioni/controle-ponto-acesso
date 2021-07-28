package com.dio.ControleAcesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Empresa {

    @Id
    private long id;

    private String descricao;

    private String cnpj;

    private String endeerco;

    private String bairo;

    private String cidade;

    private String estado;

    private String telefone;


}
