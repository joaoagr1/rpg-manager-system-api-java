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

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalRepository journalRepository;

    @PutMapping("/{character_id}")
    public ResponseEntity<Journal> updateJournalrByCharacterId(@PathVariable Long character_id, @RequestBody RequestUpdateJournal data) {
        Journal existingJournal = journalRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Character not found"));

        existingJournal.updatedata(data);
        Journal updatedCharacter = journalRepository.save(existingJournal);
        return ResponseEntity.ok(updatedCharacter);
    }

    @GetMapping("/{character_id}")
    public ResponseEntity<List<Journal>> getJournalByCharacterId(@PathVariable Long character_id){
        List<Journal> selectedJournal = journalRepository.findJournalByCharacterId(character_id);
        return ResponseEntity.ok(selectedJournal);
    }

}
