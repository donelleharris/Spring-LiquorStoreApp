package com.me.liquorstoreap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InventoryController {
    @GetMapping("/")
    public String index() {
        return "/index";
    }
    @PostMapping("/")
    public String indexDisplay(){
        return "/index";
    }

}
