package com.decj.asistencia.maestras.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decj.asistencia.maestras.dto.MaestrasDTO;
import com.decj.asistencia.maestras.mappers.MaestrasMapper;
import com.decj.asistencia.maestras.respository.IRegimenIvaRespository;
import com.decj.asistencia.maestras.respository.ITipoContribuyenteRepository;

@Service
public class MaestrasService {
    
    @Autowired
    IRegimenIvaRespository regimenIvaRepository;
    
    @Autowired
    ITipoContribuyenteRepository tipoContribuyenteRepository;
    
    public List<MaestrasDTO> getMaestraRegimenIva(){
        return MaestrasMapper.INSTANCE.map(regimenIvaRepository.findAll());
    }
    
    public List<MaestrasDTO> getMaestraTipoContribuyente(){
        return MaestrasMapper.INSTANCE.mapTipoContribuyente(tipoContribuyenteRepository.findAll());
    }
}
