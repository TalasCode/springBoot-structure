package com.springBoot3.Tala.Services;

import com.springBoot3.Tala.models.User;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User create(User user);

    User update(User user);

    List<User> getAll();

    User getById(Long id);

    User getByEmail(String email);

    void Delete(Long id);
}
