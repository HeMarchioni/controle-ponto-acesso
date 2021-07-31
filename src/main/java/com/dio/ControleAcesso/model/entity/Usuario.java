package com.dio.ControleAcesso.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Audited
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;

    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;

    private BigDecimal tolerancia;

    private LocalDateTime iniciojornada;

    private LocalDateTime finaljornada;


}
