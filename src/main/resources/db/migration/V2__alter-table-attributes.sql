-- drop da chave estrangeira existente
alter table attributepoints
drop foreign key attributepoints_ibfk_1;

-- adição de uma nova chave estrangeira
alter table attributepoints
add constraint attributepoints_ibfk_1
foreign key (character_id) references characters(id)
on delete cascade;
