package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.User;
import rpg.system.rpg.model.repositorys.UsersRepository;
import rpg.system.rpg.model.services.RequestPostUser;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody RequestPostUser data) {
        User createdUser = usersRepository.save(new User(data));
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/login")
    public Long login(@RequestParam String login, @RequestParam String password) {
        Long userId = usersRepository.userAuthentication(login, password);

        if (userId != null) {
            return userId;
        } else {
            return 99L;
        }
    }


}
