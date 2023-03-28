package com.oneBasketball.onebasketball.Controllers;

import com.oneBasketball.onebasketball.Models.CadastroDeEquipe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipe")
public class CadastroDeEquipeController {

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarEquipe(@RequestBody CadastroDeEquipe equipe) {
        return new ResponseEntity<>("Equipe cadastrada com sucesso!", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroDeEquipe> buscarEquipePorId(@PathVariable int id) {
        CadastroDeEquipe equipe = new CadastroDeEquipe(); 
        return new ResponseEntity<>(equipe, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEquipe(@PathVariable int id, @RequestBody CadastroDeEquipe equipeAtualizada) {
        return new ResponseEntity<>("Equipe atualizada com sucesso!", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEquipe(@PathVariable int id) {
        return new ResponseEntity<>("Equipe deletada com sucesso!", HttpStatus.OK);
    }
}