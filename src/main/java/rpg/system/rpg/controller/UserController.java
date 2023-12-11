package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.CharacterItem;
import rpg.system.rpg.model.domain.User;
import rpg.system.rpg.model.repositorys.SpellsRepository;
import rpg.system.rpg.model.repositorys.UsersRepository;
import rpg.system.rpg.model.services.RequestPostItem;
import rpg.system.rpg.model.services.RequestPostUser;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    //This endpoint creates a new user...
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody RequestPostUser data) {
        User createdUser = usersRepository.save(new User(data));
        return ResponseEntity.ok(createdUser);
    }





}
