package com.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AppUserService {
    private AppUserRepository repo;

    @Autowired
    public AppUserService(AppUserRepository repo) {
        this.repo = repo;
    }

    public List<AppUser> getUsers() {
        return repo.findAll();
    }

    public void setUser(AppUser usr) {
        repo.save(usr);
    }

}
