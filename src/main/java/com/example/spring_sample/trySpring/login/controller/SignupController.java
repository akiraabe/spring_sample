package com.example.spring_sample.trySpring.login.controller;

import com.example.spring_sample.trySpring.login.domain.model.GroupOrder;
import com.example.spring_sample.trySpring.login.domain.model.SignupForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SignupController {

    private Map<String, String> radioAdmin;

    private Map<String, String> initRadioAdmin() {
        Map<String, String> radio =new LinkedHashMap<>();
        radio.put("管理者","true");
        radio.put("一般", "false");
        return radio;
    }

    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute SignupForm form, Model model) {
        radioAdmin = initRadioAdmin();
        model.addAttribute("radioAdmin", radioAdmin);
        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return getSignUp(form, model);
        }
        System.out.println(form);
        return "redirect:/login";
    }
}
