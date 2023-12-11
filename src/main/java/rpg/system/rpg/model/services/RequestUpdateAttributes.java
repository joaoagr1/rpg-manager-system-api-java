package rpg.system.rpg.model.services;

public record RequestUpdateAttributes(
        Long strength,
        Long passivePerception,
        Long dexterity,
        Long constitution,
        Long intelligence,
        Long wisdom,
        Long charisma
) {
}
