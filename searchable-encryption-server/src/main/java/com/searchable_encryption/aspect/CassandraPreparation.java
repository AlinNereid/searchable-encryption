package com.searchable_encryption.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alexandru on 12/1/2015.
 */
@Aspect
public class CassandraPreparation {

    private static Logger logger = LoggerFactory.getLogger(CassandraPreparation.class);


    @Pointcut("execution(* com.searchable_encryption.repository.CassandraRepository.mockMethod(..))")
    public void serviceMethods(JoinPoint joinPoint) {
        System.out.println("method----------------------");
    }


    @Before("serviceMethods()")
    public void beforeMethod(){
        System.out.println("before----------------------");
        logger.info("before method");
    }

    @Around("serviceMethods()")
    public Object aroundMethod(JoinPoint joinpoint){
        try {
            logger.info("around method");
            return joinpoint.getArgs();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);

        }
    }

    @After("serviceMethods()")
    public void afterMethod() {
        System.out.println("after-------------------");
        logger.info("after method");
    }
}
