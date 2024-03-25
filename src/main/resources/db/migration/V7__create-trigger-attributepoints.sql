DELIMITER //
CREATE TRIGGER after_character_insert_attributes
AFTER INSERT ON Characters FOR EACH ROW
BEGIN
    INSERT INTO Attributepoints (character_id,strength,dexterity,constitution,intelligence,wisdom,charisma,passive_perception )
    VALUES (NEW.id, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
END;
//
DELIMITER ;