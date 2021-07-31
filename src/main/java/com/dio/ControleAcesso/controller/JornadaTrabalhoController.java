package com.dio.ControleAcesso.controller;


import com.dio.ControleAcesso.model.entity.JornadaTrabalho;
import com.dio.ControleAcesso.model.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {     // -> ResponseEntity (garante a mensagem de retorno em caso de erro ex: 404
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada")));
    }


    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }


    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteJornadaById(@PathVariable("idJornada") Long idJornada) {     // -> ResponseEntity (garante a mensagem de retorno em caso de erro ex: 404
        try {
            jornadaService.deleteJornadaById(idJornada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("id não Existe no banco  id:"+idJornada);
        }

        return ResponseEntity.status(HttpStatus.OK).body("Id Deletado com Sucesso  Id:"+idJornada);
    }




}
