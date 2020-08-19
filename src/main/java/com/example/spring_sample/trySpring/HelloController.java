package com.example.spring_sample.trySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1") String text, Model model) {
        model.addAttribute("sample", text);
        return "helloResponse";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("text2") String text, Model model) {
        int id = Integer.parseInt(text);
        Employee employee = helloService.findOne(id);
        model.addAttribute("employee", employee);
        return "helloResponseDB";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}