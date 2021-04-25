package com.decj.asistencia.exceptions;

import javassist.NotFoundException;

public class EmpresaNotFoundException extends NotFoundException{
    
    private static final long serialVersionUID = 1L;
    public static final String DESCRIPTION = "EMPRESA NOT FOUND (404)";
    
    private static final String NO_EXISTE_EMPRESA = "Empresa no existe";
    
    
    public EmpresaNotFoundException() {
        super(NO_EXISTE_EMPRESA);
    }

}
