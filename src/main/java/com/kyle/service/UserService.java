package com.kyle.service;

import java.util.List;

import com.kyle.model.User;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
