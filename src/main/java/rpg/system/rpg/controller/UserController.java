package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @PostMapping
    public void createUser(@RequestBody RequestPostUser data) {
        usersRepository.save(new User(data));
    }


}
