-- tabela users
create table users (
id int primary key auto_increment,
login varchar(255) not null,
password_hash varchar(255) not null,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);

-- tabela characters
create table characters (
id int primary key auto_increment,
user_id int,
alignment varchar(255),
background varchar(255),
features text,
class varchar(255),
race varchar(255),
level int,
character_name varchar(255),
gp int,
ac int,
image longblob,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp,
foreign key (user_id) references users(id)
) engine=innodb;

-- tabela attributepoints
create table attributepoints (
character_id int primary key,
strength int,
dexterity int,
constitution int,
intelligence int,
wisdom int,
charisma int,
passive_perception int,
foreign key (character_id) references characters(id)
) engine=innodb;

create table skills (
character_id int primary key,
acrobatics int,
animal_handling int,
arcana int,
athletics int,
deception int,
history int,
insight int,
intimidation int,
investigation int,
medicine int,
nature int,
perception int,
performance int,
persuasion int,
religion int,
sleight_of_hand int,
stealth int,
survival int,
foreign key (character_id) references characters(id)
) engine=innodb;

-- tabela spells
create table spells (
spell_id int primary key auto_increment,
character_id int,
name varchar(255),
description text,
foreign key (character_id) references characters(id)
) engine=innodb;

-- tabela characteritems
create table characteritems (
characteritems_id int auto_increment,
character_id int,
name varchar(255),
description text,
primary key (characteritems_id),
foreign key (character_id) references characters(id)
) engine=innodb;