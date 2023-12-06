ALTER TABLE attributepoints
DROP FOREIGN KEY attributepoints_ibfk_1;

ALTER TABLE attributepoints
ADD CONSTRAINT attributepoints_ibfk_1
FOREIGN KEY (character_id) REFERENCES characters(id)
ON DELETE CASCADE;
