package com.example.spring_sample.trySpring.login.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
/**
 * アプリケーション全体の例外処理を実装します。
 */
public class GlobalControllAdvice {

    @ExceptionHandler(DataAccessException.class)
    public String dataAccessExceptionHandler(DataAccessException e, Model model) {

        // 例外クラスのメッセージをModelに登録
        model.addAttribute("error","内部サーバーエラー（DB):GlobalConrollAdvice");
        model.addAttribute("message","DataAccessExceptionが発生しました");
        //HTTPのエラーコード500をModelに登録
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR);

        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e, Model model) {
        model.addAttribute("error","内部サーバーエラー：GlobalControllAdvice");
        model.addAttribute("message","Exceptionが発生しました");
        //HTTPのエラーコード500をModelに登録
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR);

        return "error";
    }
}