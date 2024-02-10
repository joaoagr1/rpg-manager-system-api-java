package rpg.system.rpg.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.AttributePoints;
import rpg.system.rpg.model.repositorys.AttributePointsRepository;
import rpg.system.rpg.model.services.RequestUpdateAttributes;

import java.util.List;

@RestController
@RequestMapping("/atributepoints")
public class AttributePointsController {

    @Autowired
    private AttributePointsRepository attributePointsRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<AttributePoints>> getAttributesByCharacterId(@PathVariable Long character_id) {
        List<AttributePoints> attributes = attributePointsRepository.getAttributesByCharacterId(character_id);
        return ResponseEntity.ok(attributes);
    }

    @PutMapping("/{character_id}")
    public ResponseEntity<AttributePoints> updateAttributePointsByCharacterId(@PathVariable Long character_id, @RequestBody RequestUpdateAttributes dataAttribute) {
        AttributePoints existingAttributes = attributePointsRepository.findById(character_id)
                .orElseThrow(() -> new EntityNotFoundException("Attributes not found"));
        existingAttributes.updatedataAttribute(dataAttribute);
        AttributePoints updatedAttributes = attributePointsRepository.save(existingAttributes);
        return ResponseEntity.ok(updatedAttributes);
    }

}
