ALTER TABLE characteritems
DROP FOREIGN KEY characteritems_ibfk_1;

ALTER TABLE characteritems
ADD CONSTRAINT characteritems_ibfk_1
FOREIGN KEY (character_id) REFERENCES characters(id)
ON DELETE CASCADE;
