package com.koreait.surl_project_11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("a")
    @ResponseBody
    public String Hi() {
        return "hi";
    }

    @GetMapping("b")
    @ResponseBody
    public String Hi2() {
        return "hi2";
    }
}

