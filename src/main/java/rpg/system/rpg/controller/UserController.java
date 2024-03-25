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
    @CrossOrigin
    public ResponseEntity<User> createUser(@RequestBody RequestPostUser data) {
        User createdUser = usersRepository.save(new User(data));
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/login")
    @CrossOrigin
    public Long login(@RequestParam String login, @RequestParam String password) {
        return usersRepository.userAuthentication(login, password)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado!"));
    }

}
