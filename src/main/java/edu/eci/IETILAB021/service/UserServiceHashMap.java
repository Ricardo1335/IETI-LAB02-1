package edu.eci.IETILAB021.service;

import java.util.*;

import org.springframework.stereotype.Service;

import edu.eci.IETILAB021.data.User;
@Service
public class UserServiceHashMap implements UserService {
    HashMap <String, User> map = new HashMap <String, User> ();
    @Override
    public User create(User user) {
        map.put(user.id, user);
        return map.get(user.id);
    }

    @Override
    public User findById(String id) {
        
        return map.get(id);
    }

    @Override
    public List<User> getAll() {
        List<User> li = new ArrayList<User>();
        for (User u : map.values()) {
            li.add(u);
        }
        return li;
    }

    @Override
    public void deleteById(String id) {
        map.remove(id);
        
    }

    @Override
    public User update(User user, String userId) {
        map.put(userId, user);
        return map.get(userId);
    }
    
}
