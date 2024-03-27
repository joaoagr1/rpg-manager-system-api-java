package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.Skills;
import rpg.system.rpg.model.repositorys.SkillRepository;
import rpg.system.rpg.model.services.RequestUpdateSkills;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<Skills>> getAttributesByCharacterId(@PathVariable Long character_id) {
        List<Skills> skills = skillRepository.getSkillsByCharacterId(character_id);
        return ResponseEntity.ok(skills);
    }

    @PutMapping("/{character_id}")
    public ResponseEntity<Skills> updateSkillsByCharacterId(@PathVariable Long character_id, @RequestBody RequestUpdateSkills dataSkills) {
        Skills existingSkills = skillRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Skills not found"));

        existingSkills.updatedataSkills(dataSkills);
        Skills updatedSkills = skillRepository.save(existingSkills);
        return ResponseEntity.ok(updatedSkills);
    }

}
