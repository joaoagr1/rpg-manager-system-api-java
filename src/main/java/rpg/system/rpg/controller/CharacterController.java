package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.repositorys.CharactersRepository;
import rpg.system.rpg.model.domain.RPGCharacters;
import rpg.system.rpg.model.services.RequestPostCharacter;
import rpg.system.rpg.model.services.RequestUpdateCharacter;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharactersRepository charactersRepository;


    //This endpoint returns the list of all characters...
    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<RPGCharacters>> getAllCharacters() {
        List<RPGCharacters> allCharacters = charactersRepository.findAll();
        return ResponseEntity.ok(allCharacters);
    }


    //This endpoint returns all characters from a specific user...
    @CrossOrigin
    @GetMapping("/user/{user_id}")
    public ResponseEntity<List<RPGCharacters>> getCharactersByUserId(@PathVariable Long user_id) {
        List<RPGCharacters> charactersFromUser = charactersRepository.findCharactersByUserId(user_id);
        return ResponseEntity.ok(charactersFromUser);
    }


    //This endpoint returns all basics information from a specific character...
    @CrossOrigin
    @GetMapping("/{character_id}")
    public ResponseEntity<Optional<RPGCharacters>> getCharacterById(@PathVariable Long character_id) {
        Optional<RPGCharacters> character = charactersRepository.findById(character_id);
        return ResponseEntity.ok(character);
    }


    //This endpoint creates a new character register...
    @PostMapping
    public ResponseEntity<RPGCharacters> createCharacter(@RequestBody RequestPostCharacter data) {
        RPGCharacters createdCharacter = charactersRepository.save(new RPGCharacters(data));
        return ResponseEntity.ok(createdCharacter);
    }


    //This endpoint deletes a character register passing character_id...
    @DeleteMapping("/{character_id}")
    public ResponseEntity<Void> deleteCharacterById(@PathVariable Long character_id) {
        // Check if the character exists before attempting to delete
        if (charactersRepository.existsById(character_id)) {
            // Delete the character
            charactersRepository.deleteById(character_id);
            // Return ResponseEntity with HTTP 204 No Content to indicate successful deletion
            return ResponseEntity.ok().build();
        } else {
            // If the character does not exist, return HTTP 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }

    //This endpoint updates a character register...
    @PutMapping("/{character_id}")
    public RPGCharacters updateCharacterById(@PathVariable Long character_id, @RequestBody RequestUpdateCharacter data) {
        RPGCharacters existingCharacter = charactersRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Character not found"));
        existingCharacter.updatedata(data);
        RPGCharacters updatedCharacter = charactersRepository.save(existingCharacter);
        return updatedCharacter;
    }


}
