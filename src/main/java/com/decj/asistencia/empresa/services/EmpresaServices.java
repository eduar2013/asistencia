package com.decj.asistencia.empresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decj.asistencia.empresa.dto.EmpresaDTO;
import com.decj.asistencia.empresa.entities.EmpresaEntity;
import com.decj.asistencia.empresa.entities.UbicacionEntity;
import com.decj.asistencia.empresa.mappers.EmpresaMapper;
import com.decj.asistencia.empresa.repositories.IEmpresaRepository;
import com.decj.asistencia.exceptions.EmpresaNotFoundException;

@Service
public class EmpresaServices {
	
	@Autowired
	IEmpresaRepository empresaRepository;
	
	private EmpresaEntity getEmpresaFromDTO(EmpresaDTO empresaDTO) {
		EmpresaEntity empresaEntity = EmpresaMapper.INSTANCE.empresaDTOtoEmpresaEntity(empresaDTO);
		UbicacionEntity ubicacion = empresaEntity.getUbicacion();
		ubicacion.setEmpresa(empresaEntity);
		return empresaEntity;
	}
	
	public EmpresaDTO saveEmpresa(EmpresaDTO empresaDTO) {		
		EmpresaEntity empresaEntity = getEmpresaFromDTO(empresaDTO);
		empresaEntity = empresaRepository.save(empresaEntity);	
		return EmpresaMapper.INSTANCE.empresaEntityToEmpresaDTO(empresaEntity);
	}
	
	public EmpresaDTO updateEmpresa(EmpresaDTO empresaDTO, long id) throws EmpresaNotFoundException {
		EmpresaEntity empresaEntity = (empresaRepository.findById(id)).orElseThrow(EmpresaNotFoundException::new);
		
		
		EmpresaMapper.INSTANCE.updateEmpresaEntityFromDto(empresaDTO,empresaEntity);
		empresaEntity = empresaRepository.save(empresaEntity);
		return EmpresaMapper.INSTANCE.empresaEntityToEmpresaDTO(empresaEntity);
	}
	
	public void deleteEmpresa(long id){
		Optional<EmpresaEntity> empresaOptional = (empresaRepository.findById(id));
		empresaOptional.ifPresent(empresa -> empresaRepository.delete(empresa));
	}
	
	public EmpresaDTO  getEmpresa(long id) throws EmpresaNotFoundException {
	    EmpresaEntity empresaEntity = (empresaRepository.findById(id)).orElseThrow(EmpresaNotFoundException::new);	    
	    return EmpresaMapper.INSTANCE.empresaEntityToEmpresaDTO(empresaEntity);
	}
	
	public List<EmpresaDTO> getEmpresas(){
	    return EmpresaMapper.INSTANCE.map(empresaRepository.findAll());
	}
	
	
}
