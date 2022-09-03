package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Transactional
    @Override
    public Object getUserById(int id) {
        return userDAO.getUserById(id);
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
    @Transactional
    @Override
    public void removeUser(int id) {
        userDAO.removeUser(id);
    }
    @Transactional
    @Override
    public void updateUser(@Valid User user) {
        userDAO.updateUser(user);
    }
}