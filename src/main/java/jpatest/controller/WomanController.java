package jpatest.controller;

import jpatest.domain.Man;
import jpatest.domain.Woman;
import jpatest.service.ManService;
import jpatest.service.WomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/woman")
public class WomanController {
    @Autowired
    WomanService womanService;
    @Autowired
    ManService manService;

    @GetMapping("/form")
    public String showForm(Model model){
        List<Man>manList=manService.findAll();
        model.addAttribute("manList",manList);
        model.addAttribute("woman",new Woman());
        return "womanForm";
    }

}
