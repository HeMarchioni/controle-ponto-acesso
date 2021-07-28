package com.dio.ControleAcesso.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BancoHoras {


    @Data
    @Embeddable
    public  class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;


    }
    @EmbeddedId
    private BancoHorasId bancoHorasId;

    private LocalDateTime dataTrabalhada;

    private BigDecimal quantidadeHoras;

    private BigDecimal saldoHoras;

}
