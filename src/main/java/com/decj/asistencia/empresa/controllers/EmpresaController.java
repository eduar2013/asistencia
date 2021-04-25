package com.decj.asistencia.empresa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decj.asistencia.empresa.dto.EmpresaDTO;
import com.decj.asistencia.empresa.services.EmpresaServices;
import com.decj.asistencia.exceptions.EmpresaNotFoundException;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/asistencia/v1/empresa")
public class EmpresaController {
    
    @Autowired
    EmpresaServices empresaServices;
 
    @GetMapping("/{id}")
    public ResponseEntity<EmpresaDTO> getEmpresa(@Valid @PathVariable long id) throws EmpresaNotFoundException {
        return new ResponseEntity<>(empresaServices.getEmpresa(id),HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<EmpresaDTO>> getEmpresas() {
        return new ResponseEntity<>(empresaServices.getEmpresas(),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<EmpresaDTO> saveEmpresa(@Valid @RequestBody EmpresaDTO empresa) {
        return new ResponseEntity<>(empresaServices.saveEmpresa(empresa),HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<EmpresaDTO> updateEmpresa(@Valid @RequestBody EmpresaDTO empresa, @PathVariable long id) throws EmpresaNotFoundException {
        empresa.setId(id);
        return new ResponseEntity<>(empresaServices.updateEmpresa(empresa,id),HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmpresa(@PathVariable long id) {
        empresaServices.deleteEmpresa(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
