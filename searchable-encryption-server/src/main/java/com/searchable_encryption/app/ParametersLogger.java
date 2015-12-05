package com.searchable_encryption.app;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ParametersLogger {

    @Around("@annotation(loggable)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint, Loggable loggable) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Map<String, Object> inputParametersMap = this.buildInputParametersMap(proceedingJoinPoint);
        Logger logger = Logger.getLogger(proceedingJoinPoint.getTarget().getClass().getName());

        logger.log(Level.INFO, "Entering method " + methodName + " with parameters: " + inputParametersMap.toString());

        try {
            Object output = proceedingJoinPoint.proceed();

            logger.log(Level.INFO, "Exiting method " + methodName + " with response: " + output.toString());

            return output;
        } catch (Throwable exception) {
            Logger.getLogger(ParametersLogger.class.getName()).log(Level.SEVERE, "An exception has been thrown inside method " + methodName, exception);

            throw exception;
        }
    }

    private Map<String, Object> buildInputParametersMap(ProceedingJoinPoint proceedingJoinPoint) {
        Map<String, Object> inputParametersMap = new HashMap<>();

        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();

        String[] parameterNames = signature.getParameterNames();

        for (int i = 0; i < parameterNames.length; i++) {
            inputParametersMap.put(parameterNames[i], proceedingJoinPoint.getArgs()[i]);
        }

        return inputParametersMap;
    }
}
