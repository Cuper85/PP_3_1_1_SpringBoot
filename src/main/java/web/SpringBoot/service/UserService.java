package web.SpringBoot.service;

import web.SpringBoot.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);
}