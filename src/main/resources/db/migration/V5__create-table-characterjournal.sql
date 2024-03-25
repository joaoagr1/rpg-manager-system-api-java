CREATE TABLE characterjournal (
    character_id INT,
    journal TEXT,
    PRIMARY KEY (character_id),
    FOREIGN KEY (character_id) REFERENCES Characters(id) ON DELETE CASCADE
);
