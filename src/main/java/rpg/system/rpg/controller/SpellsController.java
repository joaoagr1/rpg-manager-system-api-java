package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.Spells;
import rpg.system.rpg.model.repositorys.SpellsRepository;
import rpg.system.rpg.model.services.RequestPostSpell;

import java.util.List;

@RestController
@RequestMapping("/spells")
public class SpellsController {

    @Autowired
    private SpellsRepository spellsRepository;

    //This endpoint returns all spells from a specific character...
    @GetMapping("/{character_id}")
    public ResponseEntity<List<Spells>> getCharactersByUserId(@PathVariable Long character_id) {
        List<Spells> spells = spellsRepository.findSpellsByCharacterId(character_id);
        return ResponseEntity.ok(spells);
    }

    //This endpoint create a spell for a specific character...
    @PostMapping
    public ResponseEntity<Spells> createSpell(@RequestBody RequestPostSpell data) {
        Spells createdSpell = spellsRepository.save(new Spells(data));
        return ResponseEntity.ok(createdSpell);
    }

    //This endpoint deletes a spell from a specific character...
    @DeleteMapping("/{spell_id}")
    public ResponseEntity<String> deleteSpell(@PathVariable Long spell_id) {
        spellsRepository.deleteById(spell_id);
        return ResponseEntity.ok("Spell deleted successfully.");

    }

}
