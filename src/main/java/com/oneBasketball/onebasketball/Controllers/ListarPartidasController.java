package com.oneBasketball.onebasketball.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneBasketball.onebasketball.Models.ListarPartidas;

@RestController
@RequestMapping("/partidas")
public class ListarPartidasController {
    
    @GetMapping("/listar")
    public ResponseEntity<List<ListarPartidas>> listarPartidas() {
        List<ListarPartidas> partidas = new ArrayList<>();
        
        partidas.add(new ListarPartidas(445566L, "LAL", "MIL", 105, 98));
        partidas.add(new ListarPartidas(778899L, "GSW", "LAL", 112, 118));
        partidas.add(new ListarPartidas(112233L, "NYK", "BOS", 96, 89));
            
        return new ResponseEntity<>(partidas, HttpStatus.OK);
    }
    
}
