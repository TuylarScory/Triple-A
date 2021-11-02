create index IX_7D837A1E on CS_Service (groupId);
create index IX_74CCFC28 on CS_Service (uuid_);
create index IX_C3B95F00 on CS_Service (uuid_, companyId);
create unique index IX_4A0DA582 on CS_Service (uuid_, groupId);

create index IX_710DE05C on CS_YCustomer (groupId);
create index IX_EF97D9E6 on CS_YCustomer (uuid_);
create index IX_984B1E82 on CS_YCustomer (uuid_, companyId);
create unique index IX_7AD5D84 on CS_YCustomer (uuid_, groupId);

create index IX_85AA6BB9 on CS_YService (groupId);
create index IX_41A99883 on CS_YService (uuid_);
create index IX_92490BC5 on CS_YService (uuid_, companyId);
create unique index IX_CBBBBF87 on CS_YService (uuid_, groupId);

create index IX_8EF2FFDC on CS_YServices (groupId);
create index IX_5B3ED966 on CS_YServices (uuid_);
create index IX_55716F02 on CS_YServices (uuid_, companyId);
create unique index IX_A32DCE04 on CS_YServices (uuid_, groupId);