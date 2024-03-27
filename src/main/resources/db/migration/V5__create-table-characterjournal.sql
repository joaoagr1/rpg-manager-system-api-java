create table characterjournal (
    character_id int,
    journal text,
    primary key (character_id),
    foreign key (character_id) references characters(id) on delete cascade
);
