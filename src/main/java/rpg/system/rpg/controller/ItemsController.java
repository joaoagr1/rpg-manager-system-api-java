package rpg.system.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpg.system.rpg.model.domain.CharacterItem;
import rpg.system.rpg.model.repositorys.ItemsRepository;
import rpg.system.rpg.model.services.RequestPostItem;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsRepository itemsRepository;

    @GetMapping("/{character_id}")
    public ResponseEntity<List<CharacterItem>> getItemByCharacterId(@PathVariable Long character_id) {
        List<CharacterItem> itemsFromCharacter = itemsRepository.findItemsByCharacterId(character_id);
        return ResponseEntity.ok(itemsFromCharacter);
    }

    @PostMapping
    public ResponseEntity<CharacterItem> createItem(@RequestBody RequestPostItem data) {
        CharacterItem createdItem = itemsRepository.save(new CharacterItem(data));
        return ResponseEntity.ok(createdItem);
    }

    @DeleteMapping("/{characteritems_id}")
    public ResponseEntity<String> deleteItem(@PathVariable Long characteritems_id) {
        itemsRepository.deleteById(characteritems_id);
        return ResponseEntity.noContent().build();
    }

}
