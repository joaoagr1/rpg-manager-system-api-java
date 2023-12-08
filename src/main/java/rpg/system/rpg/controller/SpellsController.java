package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.RPGCharacters;
import rpg.system.rpg.model.domain.Spells;
import rpg.system.rpg.model.repositorys.CharactersRepository;
import rpg.system.rpg.model.repositorys.SpellsRepository;
import rpg.system.rpg.model.services.RequestPostSpell;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/spells")
public class SpellsController {


    @Autowired
    private SpellsRepository spellsRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<Spells>> getCharactersByUserId(@PathVariable Long character_id) {
        List<Spells> spells = spellsRepository.findSpellsByCharacterId(character_id);
        return new ResponseEntity<>(spells, HttpStatus.OK);

    }

    @PostMapping
    public void createSpell(@RequestBody RequestPostSpell data){
        spellsRepository.save(new Spells(data));
    }

    @DeleteMapping("/{id}")
    public void deleteSpell(@PathVariable Long id){
        spellsRepository.deleteById(id);

        }

}
