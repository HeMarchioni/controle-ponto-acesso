package com.dio.ControleAcesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;

    @ManyToOne
    private TipoData tipoData;

    private String descricao;

    private LocalDateTime dataEspecial;
}
