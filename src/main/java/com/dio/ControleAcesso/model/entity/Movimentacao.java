package com.dio.ControleAcesso.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movimentacao {

        @Data
        @Embeddable    //-> necessário anotação para chave composta
        public class  MovimentacaoId implements Serializable{   //--> usado para chave primaria composta
                private long idMovimento;
                private long idUsuario;

        }


        @EmbeddedId //-> necessário anotação para chave composta
        private MovimentacaoId id;

        private LocalDateTime dataEntrada;

        private LocalDateTime dataSaida;

        private BigDecimal periodo;

        @ManyToOne
        private Ocorrencia ocorrencia;

        @ManyToOne
        private Calendario calendario;
}
