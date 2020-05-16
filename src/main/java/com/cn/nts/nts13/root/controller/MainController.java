package com.cn.nts.nts13.root.controller;


import com.cn.nts.nts13.root.entity.LUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        LUser lUser=new LUser();
        lUser.setUsername("har");
        model.addAttribute("lUser",lUser);
        return "index";
    }
}
