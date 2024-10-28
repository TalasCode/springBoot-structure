package com.springBoot3.Tala.Services.Implementations;

import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springBoot3.Tala.Services.UserService;
import com.springBoot3.Tala.models.User;

import lombok.RequiredArgsConstructor;

import com.springBoot3.Tala.Repos.UserRepo;

@RequiredArgsConstructor
@Service
@Primary
@Endpoint(id = "customusers")
public class UserServiceImp implements UserService {

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
        return this.userRepo.findAll();
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
