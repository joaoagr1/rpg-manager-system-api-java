package rpg.system.rpg.model.services;

import rpg.system.rpg.model.domain.RPGCharacters;

public record RequestPostSpell(
        Long character_id,
        String name,
        String description

) {
}
