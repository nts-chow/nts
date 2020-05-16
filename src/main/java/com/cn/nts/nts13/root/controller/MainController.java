package com.cn.nts.nts13.root.controller;

import com.cn.nts.nts13.root.entity.Items;
import com.cn.nts.nts13.root.entity.LUser;
import com.cn.nts.nts13.root.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MainController {

    @Resource
    private MainService mainService;

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        LUser lUser=new LUser();
        lUser.setUsername("har");
        List<Items> list= mainService.findAll();
        lUser.setUsername(list.get(0).getName());
        model.addAttribute("lUser",lUser);
        return "index";
    }
}
