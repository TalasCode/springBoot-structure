package com.springBoot3.Tala.Services.Implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBoot3.Tala.Repos.UserRepo;
import com.springBoot3.Tala.Services.UserService;
import com.springBoot3.Tala.models.User;
import java.util.Collections;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImp2 implements UserService {

    private final UserRepo userRepo;

    @Override
    public User create(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User update(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        User userWithIdZero = this.userRepo.findById(0L).orElse(null);
        return Collections.singletonList(userWithIdZero);
    }

    @Override
    public User getById(Long id) {
        return this.userRepo.findById(id).get();
    }

    @Override
    public User getByEmail(String email) {
        return this.userRepo.findByEmail(email);

    }

    @Override
    public void Delete(Long id) {
        this.userRepo.deleteById(id);

    }

}
