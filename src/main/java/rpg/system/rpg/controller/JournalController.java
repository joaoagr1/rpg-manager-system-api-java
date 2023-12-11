package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.Journal;
import rpg.system.rpg.model.domain.RPGCharacters;
import rpg.system.rpg.model.domain.Spells;
import rpg.system.rpg.model.repositorys.JournalRepository;
import rpg.system.rpg.model.repositorys.SpellsRepository;
import rpg.system.rpg.model.services.RequestPostSpell;
import rpg.system.rpg.model.services.RequestUpdateCharacter;
import rpg.system.rpg.model.services.RequestUpdateJournal;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalRepository journalRepository;

    //This endpoint updates the journal from a specific character...
    @PutMapping("/{character_id}")
    public ResponseEntity<Journal> updateJounralrByCharacterId(@PathVariable Long character_id, @RequestBody RequestUpdateJournal data) {
        Journal existingJournal = journalRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Character not found"));
        existingJournal.updatedata(data);
        Journal updatedCharacter = journalRepository.save(existingJournal);
        return ResponseEntity.ok(updatedCharacter);
    }


}
