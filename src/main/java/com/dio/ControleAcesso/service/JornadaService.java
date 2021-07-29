package com.dio.ControleAcesso.service;

import com.dio.ControleAcesso.model.JornadaTrabalho;
import com.dio.ControleAcesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {

    final JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
       return jornadaRepository.save(jornadaTrabalho);
    }

}
