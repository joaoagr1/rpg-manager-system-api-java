package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rpg.system.rpg.model.domain.CharacterItem;
import rpg.system.rpg.model.domain.RPGCharacters;
import rpg.system.rpg.model.repositorys.ItemsRepository;
import rpg.system.rpg.model.repositorys.SpellsRepository;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {


    @Autowired
    private ItemsRepository itemsRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<CharacterItem>> getItemByCharacterId(@PathVariable Long character_id) {
        List<CharacterItem> items = itemsRepository.findItemsByCharacterId(character_id);
        return new ResponseEntity<>(items, HttpStatus.OK);

    }

}
