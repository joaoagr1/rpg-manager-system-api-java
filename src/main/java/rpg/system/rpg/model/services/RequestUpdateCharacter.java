package rpg.system.rpg.model.services;

public record RequestUpdateCharacter(
        String background,
        String alignment,
        String features,
        String class_,
        String race,
        Long level,
        String characterName,
        Long gp,
        Long ac,
        String image
) {

}
