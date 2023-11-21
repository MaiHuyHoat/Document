package com.web.user.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.user.Model.User;
import com.web.user.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/list")

    public String listAction(Model model , HttpServletRequest request){
        // Khai báo biến tạm chứa danh sách
        // bản ghi đọc ra từ Repository


        List<User> listUsers= service.getAllUsers();
        model.addAttribute("User",new User());
        model.addAttribute("listUsers",listUsers);
        return "list";// kết xuất giao diện list
    }
    @PostMapping("/search")
    public  String searchAction(@RequestParam("key") String name,Model model){
        List<User> listUsers= service.findByName(name);

        model.addAttribute("User",new User());
        model.addAttribute("listUsers",listUsers);

        return "list";// kết xuất giao diện list
    }
    @GetMapping("/edit/{id}")
    public String EditAction(@PathVariable int id, Model model){

        User User= service.getUserById(id);

        if(User!=null)
        {
            model.addAttribute("User",User);
            model.addAttribute("UserP",new User());
            return "edit";

        }
        return  "404NotFound";

    }
    @PostMapping("/edit/{id}")
    public String EditAction(@ModelAttribute User User, @PathVariable long id) throws JsonProcessingException {


        User.setId(id);
        if( service.saveUser(User)) {
            return "redirect:/User/list";
        }

        else return "404NotFound";
    }
    @PostMapping("/Add")
    public String AddAction(@ModelAttribute("user") User User, HttpServletRequest request) throws JsonProcessingException {


        ObjectMapper om= new ObjectMapper();
        System.out.println(om.writeValueAsString(User));


        if( service.saveUser(User)) {
            return "redirect:/User/list";
        }

        else
            return "404NotFound";
    }
    @GetMapping("/delete/{id}")
    public String DeleteAction(@PathVariable int id,HttpServletRequest request,Model model){
        if(service.deleteUserById(id)) {
            return "redirect:/User/list";
        }
        return "404NotFound"    ;
    }

}
