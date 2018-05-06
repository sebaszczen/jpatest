package jpatest.controller;

import jpatest.domain.Man;
import jpatest.repositories.ManRespository;
import jpatest.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/man")
public class ManController {
    @Autowired
    ManService  manService;

    @PostMapping("/form")
    public String addMan(Model model, @ModelAttribute @Valid Man man, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "manForm";
        }
        else {
            manService.addMan(man);
            List<Man>manList=manService.findAll();
            model.addAttribute("manList",manList);
            return "manHome";
        }
    }


    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("man",new Man());

        return "manForm";
    }



}
