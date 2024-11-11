package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class AppUserController {
    private AppUserService srvc;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.srvc = appUserService;
    }

    @PostMapping
    public void addUser(@RequestBody AppUser usr) {
        srvc.setUser(usr);
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return srvc.getUsers();
    }

}
