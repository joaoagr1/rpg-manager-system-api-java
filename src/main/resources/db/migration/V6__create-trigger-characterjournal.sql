DELIMITER //
CREATE TRIGGER after_character_insert
AFTER INSERT ON characters FOR EACH ROW
BEGIN
    INSERT INTO characterjournal (character_id, journal)
    VALUES (NEW.id, NULL);
END;
//
DELIMITER ;
