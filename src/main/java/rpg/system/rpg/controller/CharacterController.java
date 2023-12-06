package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rpg.system.rpg.model.CharactersRepository;
import rpg.system.rpg.model.RPGCharacters;

import javax.xml.stream.events.Characters;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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





}
