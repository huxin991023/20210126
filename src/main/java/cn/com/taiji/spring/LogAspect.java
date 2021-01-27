package cn.com.taiji.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component

public class LogAspect {

    @Pointcut("execution(* cn.com.taiji.spring.UserService.*(..))")
    public void pointCut(){

    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("aspectj before");
        joinPoint.proceed(joinPoint.getArgs());
    }
}
