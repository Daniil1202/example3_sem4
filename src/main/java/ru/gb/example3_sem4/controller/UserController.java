package ru.gb.example3_sem4.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.example3_sem4.model.User;
import ru.gb.example3_sem4.repository.UserRepository;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;




    @GetMapping("/users") //Получаем список пользователей
    public String getUsers(Model model){
        model.addAttribute("users",userRepository.getUserList());
        return "users";
    }
    @PostMapping("/users") //отправляем список пользователей
    public String registerUser( User user, Model model){
        userRepository.addUser(user);
        System.out.println(user);
        model.addAttribute("users",userRepository.getUserList());
        return "users";

    }



}
