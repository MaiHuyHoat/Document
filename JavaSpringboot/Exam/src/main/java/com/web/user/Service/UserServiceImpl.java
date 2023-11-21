package com.web.user.Service;

import com.web.user.Model.User;
import com.web.user.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService{
   @Autowired
   private UserRepository repository;



    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public List<User> findByName(String key) {

        return repository.findByName(key);
    }

    @Override
    public User getUserById(long id) {
        User existUser = repository.findById(id).orElse(null);
        return existUser;
    }

    @Override
    public boolean saveUser(User user) {
        try {
            repository.save(user);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteUserById(long id) {
        try{
            repository.deleteById(id);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
