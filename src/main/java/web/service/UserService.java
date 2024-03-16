package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    void changeUser(Long id, User user);
    List<User> getAllUsers();
}
