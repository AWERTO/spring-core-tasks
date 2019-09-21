package com.mazuryk.spring.core.aop.basic;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorLoggingAspect {

    private Logger logger = Logger.getLogger(CalculatorConfiguration.class.getName());

    //@Before("execution(* ArithmeticCalculator.multiplication(..))")
    public void logBefore(){
        logger.info("Before multiplication method");
    }

    //@After("execution(* ArithmeticCalculator.addition(..))")
    public void logAfter(){
        logger.info("Logger after addition");
    }

    //@AfterReturning(pointcut = "execution(* ArithmeticCalculator.substraction(..)))", returning = "result")
    public void logAfterRunning(Object result){
        logger.info("After Running method");
        logger.info("Division result is " + result);
    }

    //@AfterThrowing(pointcut = "execution(* ArithmeticCalculator.division(..))", throwing = "ex")
    public void lofAfterThrowing(IOException ex){
        logger.info("AfterThrowing division method");
        logger.info("Exception message " + ex.getMessage());
    }

    //@Before("execution(* ArithmeticCalculator.multiplication(..))")
    public void joinPointInfo(JoinPoint joinPoint){
        logger.info("JoinPointInfo advice");
        logger.info("Kind " + joinPoint.getKind());
        logger.info("Method signature: " + joinPoint.getSignature().getName());
        logger.info("Declaring type name: " + joinPoint.getSignature().getDeclaringTypeName());
        logger.info("Method arguments: " + joinPoint.getArgs());
        logger.info("Target object: " + joinPoint.getTarget());
        logger.info("This object: " + joinPoint.getThis());
    }

    @Around("execution(* ArithmeticCalculator.multiplication(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        logger.info("Around advice.");
        logger.info("Method arguments: " + Arrays.toString(proceedingJoinPoint.getArgs()));
        Object result;
        try {
            result = proceedingJoinPoint.proceed(new Object[]{5.8,3.2 });
            return result;
        }
        catch (Throwable th){
            throw th;
        }
    }
}
