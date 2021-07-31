package com.dio.ControleAcesso.model.repository;

import com.dio.ControleAcesso.model.entity.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {


}
