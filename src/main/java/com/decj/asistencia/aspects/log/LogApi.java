package com.decj.asistencia.aspects.log;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogApi {
    
    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void allApiRequest() {
        //aspect
    }
    
    @Before("allApiRequest()")
    public void apiRequestLog(JoinPoint jp) {
        LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info("---------------------------------");
        StringBuilder log = new StringBuilder(jp.getSignature().getName());
        
        for(Object arg : jp.getArgs()) {
            log.append("\n ARG: " + arg);
        }
        
        LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info(log);
    }
}