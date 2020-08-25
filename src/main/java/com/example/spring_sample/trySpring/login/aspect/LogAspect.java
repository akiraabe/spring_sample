package com.example.spring_sample.trySpring.login.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // @Before("execution(* com.example.spring_sample.trySpring.login.controller.LoginController.getLogin (..))")
    // @Before("execution(* com.example.spring_sample.trySpring.login.controller.SignupController.postSignUp (..))")
    @Before("execution(* *..*.*Controller.* (..))")
    public void startLog(JoinPoint jp) {
        System.out.println("メソッド開始 : " + jp.getSignature());
    }

    // @After("execution(* com.example.spring_sample.trySpring.login.controller.LoginController.getLogin (..))")
    // @After("execution(* com.example.spring_sample.trySpring.login.controller.SignupController.postSignUp (..))")
    @After("execution(* *..*.*Controller.* (..))")
    public void endLog(JoinPoint jp) {
        System.out.println("メソッド終了 : " + jp.getSignature());
    }
}
