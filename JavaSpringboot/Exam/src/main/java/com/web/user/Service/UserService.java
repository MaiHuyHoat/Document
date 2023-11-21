package com.web.user.Service;

import com.web.user.Model.User;

import java.util.List;

public interface UserService {
    // doc du lieu nhieu ban ghi
    List<User> getAllUsers();
    List<User> findByName(String key);
    // doc du lieu mot ban ghi
    User getUserById(long id);
    // luu du lieu cua 1 ban ghi db
    boolean saveUser(User user);

    boolean deleteUserById(long  id);

}
