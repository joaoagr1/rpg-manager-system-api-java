package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import rpg.system.rpg.model.domain.RPGCharacters;
import rpg.system.rpg.model.repositorys.CharactersRepository;
import rpg.system.rpg.model.services.RequestPostCharacter;
import rpg.system.rpg.model.services.RequestUpdateCharacter;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharactersRepository charactersRepository;

    @GetMapping
    public ResponseEntity<List<RPGCharacters>> getAllCharacters() {
        List<RPGCharacters> allCharacters = charactersRepository.findAll();
        return ResponseEntity.ok(allCharacters);
    }

    @GetMapping("/foto/{personagemId}")
    public ResponseEntity<byte[]> getFoto(@PathVariable Long personagemId) {
        byte[] foto = charactersRepository.findFotoById(personagemId);

        if (foto == null) {
            return ResponseEntity.notFound().build();
        }
//1
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(foto, headers, HttpStatus.OK);

    }
    @PostMapping("/uploadFoto/{personagemId}")
    public ResponseEntity<String> uploadFoto(@PathVariable Long personagemId, @RequestParam("foto") MultipartFile foto) throws IOException {

        RPGCharacters byPersonagemId = charactersRepository.findByCharacterId(personagemId)
                .orElseThrow(() -> new EntityNotFoundException("Personagem não encontrado!"));

        byPersonagemId.setImage(foto.getBytes());
        charactersRepository.save(byPersonagemId);
        return ResponseEntity.ok("Foto salva com sucesso!");

    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<List<RPGCharacters>> getCharactersByUserId(@PathVariable Long user_id) {
        List<RPGCharacters> charactersFromUser = charactersRepository.findCharactersByUserId(user_id);
        return ResponseEntity.ok(charactersFromUser);
    }

    
    @GetMapping("/{character_id}")
    public ResponseEntity<RPGCharacters> getCharacterById(@PathVariable Long character_id) {
        RPGCharacters character = getRpgCharacters(character_id);
        return ResponseEntity.ok(character);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<RPGCharacters> createCharacter(@RequestBody RequestPostCharacter data) {
        RPGCharacters createdCharacter = charactersRepository.save(new RPGCharacters(data));
        return ResponseEntity.ok(createdCharacter);
    }

    @CrossOrigin
    @DeleteMapping("/{character_id}")
    public ResponseEntity<Void> deleteCharacterById(@PathVariable Long character_id) {
        RPGCharacters character = getRpgCharacters(character_id);

        charactersRepository.delete(character);
        return ResponseEntity.noContent().build();
    }

    @CrossOrigin
    @PutMapping("/{character_id}")
    public RPGCharacters updateCharacterById(@PathVariable Long character_id, @RequestBody RequestUpdateCharacter data) {
        RPGCharacters existingCharacter = getRpgCharacters(character_id);

        existingCharacter.updateData(data);
        return charactersRepository.save(existingCharacter);
    }

    private RPGCharacters getRpgCharacters(Long character_id) {
        return charactersRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Character Não encontrado!"));
    }

}
