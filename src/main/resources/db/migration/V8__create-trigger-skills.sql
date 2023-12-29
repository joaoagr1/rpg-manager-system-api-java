DELIMITER //
CREATE TRIGGER after_character_insert_skills
AFTER INSERT ON characters FOR EACH ROW
BEGIN
    INSERT INTO skills (character_id, Acrobatics, Animal_Handling, Arcana, Athletics, Deception, History, Insight, Intimidation ,Investigation,
                                     Medicine, Nature, Perception,Performance, Persuasion, Religion, Sleight_of_Hand, Stealth, Survival)
    VALUES (NEW.id, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
END;
//
DELIMITER ;


