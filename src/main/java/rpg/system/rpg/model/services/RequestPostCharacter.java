package rpg.system.rpg.model.services;

public record RequestPostCharacter(


        String background,
        String alignment,
        String features,
        String class_,
        String race,
        Long level,
        String characterName,
        Long user_id,
        Long gp,
        Long ac
) {

}
