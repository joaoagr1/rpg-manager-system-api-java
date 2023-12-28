package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.AttributePoints;
import rpg.system.rpg.model.domain.Skills;
import rpg.system.rpg.model.repositorys.AttributePointsRepository;
import rpg.system.rpg.model.repositorys.SkillRepository;
import rpg.system.rpg.model.services.RequestUpdateAttributes;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillRepository skillRepository;

    //This endpoint returns the list of skills from a specific character...
    @GetMapping("/{character_id}")
    public ResponseEntity<List<Skills>> getAttributesByCharacterId(@PathVariable Long character_id) {
        List<Skills> skills = skillRepository.getSkillsByCharacterId(character_id);
        return ResponseEntity.ok(skills);
    }

   // @PutMapping("/{character_id}")
    //public ResponseEntity<AttributePoints> updateAttributePointsByCharacterId(@PathVariable Long character_id, @RequestBody RequestUpdateAttributes dataAttribute) {
      //  AttributePoints existingAttributes = skillRepository.findById(character_id)
        //        .orElseThrow(() -> new EntityNotFoundException("Attributes not found"));
        //existingAttributes.updatedataAttribute(dataAttribute);
      //  AttributePoints updatedAttributes = skillRepository.save(existingAttributes);
       // return ResponseEntity.ok(updatedAttributes);
  //  }
}
