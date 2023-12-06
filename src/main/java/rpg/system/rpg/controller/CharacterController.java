package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity getAllCharacters() {
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
    public ResponseEntity<Optional<RPGCharacters>> findById(@PathVariable Long character_id) {
        Optional<RPGCharacters> character = charactersRepository.findById(character_id);
        return ResponseEntity.ok(character);
    }


    //Create a new Character register on character table...
    @PostMapping
    public ResponseEntity<RPGCharacters> create(@RequestBody RPGCharacters data) {
        RPGCharacters createdCharacter = charactersRepository.save(data);

        // Retorna ResponseEntity com o personagem criado e o status HTTP 201 Created
        return new ResponseEntity<>(createdCharacter, HttpStatus.CREATED);
    }


    //Deleting a character register passing character_id...
    @DeleteMapping("/{character_id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long character_id) {
        // Verifica se o personagem existe antes de excluí-lo
        if (charactersRepository.existsById(character_id)) {
            // Exclui o personagem
            charactersRepository.deleteById(character_id);
            // Retorna ResponseEntity com HTTP 200 OK
            return ResponseEntity.ok().build();
        } else {
            // Se o personagem não existir, retorna HTTP 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }


}
