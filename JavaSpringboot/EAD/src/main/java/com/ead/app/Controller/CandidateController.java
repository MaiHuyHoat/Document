package com.ead.app.Controller;

import com.ead.app.Model.Candidate;
import com.ead.app.Service.CandidateSevice;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CandidateController {
    @Autowired
    protected CandidateSevice service;
    @GetMapping("")
    public String Index(Model model){
        List<Candidate> list= service.GetAll();
        model.addAttribute("list",list);
        model.addAttribute("candidate",new Candidate());
        return "list";
    }
   @PostMapping("search")
   public String SearchByName(@RequestParam("key") String key,Model model){
     List<Candidate> list=service.SearchByName(key);
       model.addAttribute("list",list);
       model.addAttribute("candidate",new Candidate());
       return "list";
   }

   @GetMapping("/show/{id}")
    public  String Show(@PathVariable long id,Model model){
        Candidate modelEx= service.GetDetail(id);
        model.addAttribute("candidate",modelEx);
        return "show";
   }
    @PostMapping("/update/{id}")
    public String Update(@PathVariable long id, @ModelAttribute("candidate") @Valid Candidate model, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            // Trả lại trang hiện tại
            System.out.println("có lôỗi ");
            return "redirect:" + request.getRequestURI();
        }

        model.setId(id);
        service.save(model);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String Delete(@PathVariable long id){
        service.Delete(
                id
        );
        return  "redirect:/";
    }
}
