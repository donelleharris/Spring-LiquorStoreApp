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
    @GetMapping("/addInventory")
    public String addInventory(){
        return "/addInventory";
    }
    @PostMapping("/addInventory")
    public String addInventory(Model model){
        return "/addInventory";
    }
    @GetMapping("/edit")
    public String editInventory(){
        return "/edit";
    }
    @PostMapping("/edit")
    public String editInventory(Model model){
        return "/edit";
    }
    
//    add to edit page???
//    @GetMapping("/delete")
//    public String deleteInventory(){
//        return "/delete";
//    }
//    @PostMapping("/delete")
//    public String deleteInventory(Model model){
//        return "/delete";
//    }

}
