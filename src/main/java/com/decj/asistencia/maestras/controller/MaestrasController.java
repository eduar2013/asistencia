package com.decj.asistencia.maestras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decj.asistencia.maestras.dto.MaestrasDTO;
import com.decj.asistencia.maestras.services.MaestrasService;

@RestController
@RequestMapping("/asistencia/v1/maestras")
public class MaestrasController {
    
    @Autowired
    MaestrasService maestrasServices;
    
    @GetMapping("/regimenIva")
    public ResponseEntity<List<MaestrasDTO>> getRegimenIva(){
        return new ResponseEntity<>(maestrasServices.getMaestraRegimenIva(),HttpStatus.OK);
    }
    
    @GetMapping("/tipoContribuyente")
    public ResponseEntity<List<MaestrasDTO>> getTipoContribuyente(){
        return new ResponseEntity<>(maestrasServices.getMaestraTipoContribuyente(),HttpStatus.OK);
    }
    

}
