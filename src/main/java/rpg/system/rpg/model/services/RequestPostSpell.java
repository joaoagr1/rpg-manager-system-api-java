package rpg.system.rpg.model.services;

public record RequestPostSpell(
        Long character_id,
        String name,
        String description

) {
}
