package com.oneBasketball.onebasketball.Controllers;

import com.oneBasketball.onebasketball.Models.CadastroDePartidas;
import com.oneBasketball.onebasketball.Repositories.CadastroDePartidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidas")
public class CadastroDePartidasController {

    @Autowired
    private CadastroDePartidasRepository cadastroDePartidasRepository;

    // CREATE
    @PostMapping
    public ResponseEntity<CadastroDePartidas> create(@RequestBody CadastroDePartidas cadastroDePartidas) {
        try {
            CadastroDePartidas newCadastroDePartidas = cadastroDePartidasRepository.save(cadastroDePartidas);
            return new ResponseEntity<>(newCadastroDePartidas, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // READ
    @GetMapping("/{id}")
    public ResponseEntity<CadastroDePartidas> getById(@PathVariable("id") long id) {
        Optional<CadastroDePartidas> cadastroDePartidasData = cadastroDePartidasRepository.findById(id);
        if (cadastroDePartidasData.isPresent()) {
            return new ResponseEntity<>(cadastroDePartidasData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<CadastroDePartidas>> getAll() {
        List<CadastroDePartidas> cadastroDePartidasList = cadastroDePartidasRepository.findAll();
        if (cadastroDePartidasList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(cadastroDePartidasList, HttpStatus.OK);
        }
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<CadastroDePartidas> update(@PathVariable("id") long id, @RequestBody CadastroDePartidas cadastroDePartidas) {
        Optional<CadastroDePartidas> cadastroDePartidasData = cadastroDePartidasRepository.findById(id);
        if (cadastroDePartidasData.isPresent()) {
            CadastroDePartidas _cadastroDePartidas = cadastroDePartidasData.get();
            _cadastroDePartidas.setPontuacao_equipe1(cadastroDePartidas.getPontuacao_equipe1());
            _cadastroDePartidas.setPontuacao_equipe2(cadastroDePartidas.getPontuacao_equipe2());
            _cadastroDePartidas.setData(cadastroDePartidas.getData());
            _cadastroDePartidas.setEquipe1_id(cadastroDePartidas.getEquipe1_id());
            _cadastroDePartidas.setEquipe2_id(cadastroDePartidas.getEquipe2_id());
            _cadastroDePartidas.setTresPontos_equipe1(cadastroDePartidas.getTresPontos_equipe1());
            _cadastroDePartidas.setTresPontos_equipe2(cadastroDePartidas.getTresPontos_equipe2());
            _cadastroDePartidas.setDoisPontos_equipe1(cadastroDePartidas.getDoisPontos_equipe1());
            _cadastroDePartidas.setDoisPontos_equipe2(cadastroDePartidas.getDoisPontos_equipe2());
           
