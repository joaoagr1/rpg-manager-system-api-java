package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rpg.system.rpg.model.repositorys.CharactersRepository;
import rpg.system.rpg.model.domain.RPGCharacters;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharactersRepository charactersRepository;

    @GetMapping
    public ResponseEntity getAllCharacters(){
        var allcharacters = charactersRepository.findAll();
        return ResponseEntity.ok(allcharacters);
    }

    //Find all characters for a specific user...
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<RPGCharacters>> getCharactersByUserId(@PathVariable Long userId) {
        List<RPGCharacters> characters = charactersRepository.findCharactersByUserId(userId);
        return new ResponseEntity<>(characters, HttpStatus.OK);

    }


    //Find all basics information from a specific character...
    @GetMapping("/{character_id}")
    public Optional<RPGCharacters> findById(@PathVariable Long character_id) {
        return charactersRepository.findById(character_id);
    }





}
