package coworking_service.services;

import coworking_service.models.User;

import java.util.HashMap;
import java.util.SplittableRandom;

public class UserService {
    private HashMap<String, User> users = new HashMap<>();

    public void register(String username, String password) {
        User user = new User(username, password);
        users.put(username, user);
    }

    public User getUser(String name) {
        return users.get(name);
    }
}
