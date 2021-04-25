package com.decj.asistencia.empresa.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.decj.asistencia.empresa.dto.EmpresaDTO;
import com.decj.asistencia.empresa.entities.EmpresaEntity;
import com.decj.asistencia.maestras.dto.MaestrasDTO;
import com.decj.asistencia.maestras.entities.RegimenIvaEntity;
import com.decj.asistencia.maestras.entities.TipoContribuyenteEntity;

@Mapper
public interface EmpresaMapper {
	
	 EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class );
	 
	 @Mapping(source="value", target="id")
	 RegimenIvaEntity maestraDTOtoRegimenIvaEntity(MaestrasDTO regimenIvaDTO);
	 
	 @Mapping(source="value", target="id")
     TipoContribuyenteEntity maestraDTOtoTipoContribuyenteEntity(MaestrasDTO tipoContribuyenteDTO);     
	 
	 @Mapping(target = "ubicacion.ciudad.codigoCiudad", source = "ubicacion.codigoCiudad")
	 @Mapping(target = "ubicacion.empresa", ignore = true )
	 EmpresaEntity empresaDTOtoEmpresaEntity(EmpresaDTO empresaDto);
	 
	 
	 @Mapping(source="id", target="value")
     MaestrasDTO regimenIvaEntityToMaestraDTO(RegimenIvaEntity regimenIvaDTO);
	 
	 @Mapping(source="id", target="value")
     MaestrasDTO tipoContribuyenteToMaestraDTO(TipoContribuyenteEntity tipoContribuyenteEntity);	 
	 
	 @Mapping(target = "ubicacion.codigoCiudad", source = "ubicacion.ciudad.codigoCiudad")
	 EmpresaDTO empresaEntityToEmpresaDTO(EmpresaEntity EmpresaEntity);
	 
	 @Mapping(target = "ubicacion.ciudad.codigoCiudad", source = "ubicacion.codigoCiudad")
	 @Mapping(target = "ubicacion.empresa", ignore = true )
	 void updateEmpresaEntityFromDto(EmpresaDTO dto, @MappingTarget EmpresaEntity entity);
	 
	 List<EmpresaDTO> map(List<EmpresaEntity> empresaEntity);

}
