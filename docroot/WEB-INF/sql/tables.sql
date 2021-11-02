create table CS_Service (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	serviceName VARCHAR(75) null,
	servicePrice VARCHAR(75) null,
	serviceDes VARCHAR(75) null
);

create table CS_YCustomer (
	uuid_ VARCHAR(75) null,
	yCustomerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerName VARCHAR(75) null,
	customerEmail VARCHAR(75) null,
	customerAddress VARCHAR(75) null,
	customerNRC VARCHAR(75) null,
	customerContact VARCHAR(75) null,
	payment VARCHAR(75) null,
	yServicesId LONG
);

create table CS_YService (
	uuid_ VARCHAR(75) null,
	yServiceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	serviceName VARCHAR(75) null,
	servicePrice VARCHAR(75) null,
	serviceDes VARCHAR(75) null
);

create table CS_YServices (
	uuid_ VARCHAR(75) null,
	yServicesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	servicesName VARCHAR(75) null,
	servicesPrice VARCHAR(75) null,
	servicesDes VARCHAR(75) null
);