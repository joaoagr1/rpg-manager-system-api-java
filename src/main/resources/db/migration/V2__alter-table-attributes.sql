alter table attributepoints
 drop foreign key attributepoints_ibfk_1;

 alter table attributepoints
 add constraint attributepoints_ibfk_1
 foreign key (character_id) references characters(id)
 on delete cascade;