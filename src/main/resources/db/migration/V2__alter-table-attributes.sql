-- Drop da chave estrangeira existente
ALTER TABLE AttributePoints
DROP FOREIGN KEY attributepoints_ibfk_1;

-- Adição de uma nova chave estrangeira
ALTER TABLE AttributePoints
ADD CONSTRAINT attributepoints_ibfk_1
FOREIGN KEY (character_id) REFERENCES Characters(id)
ON DELETE CASCADE;
