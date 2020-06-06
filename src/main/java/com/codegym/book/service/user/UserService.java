package com.codegym.book.service.user;

import com.codegym.book.model.User;

public interface UserService {
    Iterable<User> getList();

    User save(User user);

    void delete(Long id);

    User findById(Long id);
}
