package com.decj.asistencia.maestras.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.decj.asistencia.maestras.dto.MaestrasDTO;
import com.decj.asistencia.maestras.entities.RegimenIvaEntity;
import com.decj.asistencia.maestras.entities.TipoContribuyenteEntity;


@Mapper
public interface MaestrasMapper {

    
    MaestrasMapper INSTANCE = Mappers.getMapper(MaestrasMapper.class);
    
    @Mapping(target = "value", source = "id")
    MaestrasDTO regimenIvaToMaestraDTO(RegimenIvaEntity regimenIvaEntity);
    List<MaestrasDTO> map(List<RegimenIvaEntity> regimenIvaEntity);
    
    
    @Mapping(target = "value", source = "id")
    MaestrasDTO tipoContribuyenteToMaestraDTO(TipoContribuyenteEntity tipoContribuyenteEntity);
    List<MaestrasDTO> mapTipoContribuyente(List<TipoContribuyenteEntity> tipoContribuyenteEntity);
}
