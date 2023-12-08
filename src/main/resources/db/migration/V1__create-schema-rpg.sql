-- Tabela Users
CREATE TABLE Users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tabela Characters
CREATE TABLE Characters (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    alignment VARCHAR(255),
    background VARCHAR(255),
    features TEXT,
    class VARCHAR(255),
    race VARCHAR(255),
    level INT,
    character_name VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(id)
) ENGINE=InnoDB;

-- Tabela AttributePoints
CREATE TABLE AttributePoints (
    character_id INT PRIMARY KEY,
    strength INT NOT NULL,
    dexterity INT NOT NULL,
    constitution INT NOT NULL,
    intelligence INT NOT NULL,
    wisdom INT NOT NULL,
    charisma INT NOT NULL,
    passive_perception INT NOT NULL,
    FOREIGN KEY (character_id) REFERENCES Characters(id)
) ENGINE=InnoDB;

-- Tabela Spells
CREATE TABLE Spells (
    spell_id INT PRIMARY KEY AUTO_INCREMENT,
    character_id INT,
    name VARCHAR(255),
    description TEXT,
    FOREIGN KEY (character_id) REFERENCES Characters(id)
) ENGINE=InnoDB;

-- Tabela CharacterItems
CREATE TABLE CharacterItems (
    characteritems_id INT,
    character_id INT,
    name VARCHAR(255),
    description TEXT,
    PRIMARY KEY (characteritems_id),
    FOREIGN KEY (character_id) REFERENCES Characters(id)
) ENGINE=InnoDB;