package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rpg.system.rpg.model.domain.AttributePoints;
import rpg.system.rpg.model.domain.Spells;
import rpg.system.rpg.model.repositorys.AttributePointsRepository;
import rpg.system.rpg.model.repositorys.CharactersRepository;

import java.util.List;

@RestController
@RequestMapping("/atributepoints")
public class AttributePointsController {

    @Autowired
    private AttributePointsRepository attributePointsRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<AttributePoints>> getAttributesByCharacterId(@PathVariable Long character_id) {
        List<AttributePoints> attributes = attributePointsRepository.getAttributesByCharacterId(character_id);
        return new ResponseEntity<>(attributes, HttpStatus.OK);

    }


}
