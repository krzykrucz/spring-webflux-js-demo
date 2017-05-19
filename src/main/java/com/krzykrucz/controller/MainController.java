package com.krzykrucz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hector on 19/05/2017.
 */

@Controller
@Slf4j
public class MainController {

    @GetMapping("/")
    public String mainView() {
        return "stream";
    }
}
