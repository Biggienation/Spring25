package com.java24.spring25;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("error")
    public String handleError() {
        log.info("error occurred");
        return "error";
    }

}
