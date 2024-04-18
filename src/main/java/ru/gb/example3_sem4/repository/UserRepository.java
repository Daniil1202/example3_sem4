package ru.gb.example3_sem4.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.gb.example3_sem4.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();
    public void addUser(User user){
        userList.add(user);
    }
    public List<User> getUserList() {
        return userList;
    }


}
