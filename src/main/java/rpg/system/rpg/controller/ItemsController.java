package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.CharacterItem;
import rpg.system.rpg.model.repositorys.ItemsRepository;
import rpg.system.rpg.model.services.RequestPostItem;

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

    @PostMapping
    public void createItem(@RequestBody RequestPostItem data) {
        itemsRepository.save(new CharacterItem(data));
    }




}
