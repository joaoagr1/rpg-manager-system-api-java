package rpg.system.rpg.model.services;

public record RequestPostItem(
        String name,
        String description,
        Long character_id
) {
}
