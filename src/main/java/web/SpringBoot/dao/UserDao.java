package web.SpringBoot.dao;

import web.SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    List<User> listUsers();

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);
}
