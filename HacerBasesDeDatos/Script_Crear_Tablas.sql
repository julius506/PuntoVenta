CREATE TABLE Persona(
	Cedula char(14) not null,
	Tipo varchar(40),
	primary key (Cedula)
);

CREATE TABLE Cliente (
	Cedula char(14) not null,
	Descuento int DEFAULT 0,
	Exonerado boolean,
	primary key (Cedula),
	foreign key (Cedula) references Persona on delete cascade
);

CREATE TABLE login (
username	VARCHAR(25)	NOT NULL,
contrasena	VARCHAR(25)	NOT NULL,
puesto		VARCHAR(25)	NOT NULL,
foreign key (username) references Persona,
PRIMARY KEY(username)
);

CREATE TABLE Fisico(
	Cedula char(14) not null,
	NombreP varchar(30) not null,
	Apellido1 varchar(30) not null,
	Apellido2 varchar(30),
	Grado_Aca varchar(30),
	primary key (Cedula),
	foreign key (Cedula) references Persona on delete cascade
);

CREATE TABLE Juridico(
	Cedula char(14) not null,
	Nombre varchar(30) not null,
	primary key (Cedula),
	foreign key (Cedula) references Persona on delete cascade
);

CREATE TABLE Direccion(
	Cedula char(14) not null,
	Provincia varchar(30),
	Canton varchar(30),
	Distrito varchar(30) not null,
	Senas varchar(100),
	primary key (Cedula, Provincia, Canton, Distrito, Senas),
	foreign key (Cedula) references Persona on delete cascade
);

CREATE TABLE Telefono(
	Cedula char(14) not null,
	Num_Tel char(14) not null,
	Provincia varchar(30),
	Canton varchar(30),
	Distrito varchar(30) not null,
	Senas varchar(100),
	--ID_TEL serial,
	primary key (Cedula, Num_Tel, Provincia, Canton, Distrito, Senas),
	foreign key (Cedula, Provincia, Canton, Distrito, Senas) references Direccion on delete cascade
);

CREATE TABLE Producto(
	Cod char(30) not null,
	Descripcion varchar(30) not null,
	Minimo int,
	Existencia int,
	Costo money,
	Precio1 money,
	Precio2 money,
	Precio3 money,
	Descuento int,
	Impuesto int,
	Exento boolean,
	Ubicacion varchar(30),
	Medida varchar(10),
	primary key (Cod)
);

CREATE TABLE Empleado(
	Cedula char(14) not null,
	Fecha_Ingreso date,
	Comision int DEFAULT 0,
	Tipo varchar(30),
	Puesto varchar(20),
	Sucursal varchar(20),
	Email varchar(20),
	primary key (Cedula),
	foreign key (Cedula) references Persona on delete cascade
);

CREATE TABLE Caja(
	Num_Caja char(14) not null,
	Saldo_actual money,
	Fecha date,
	Hora time,
	tiempo timestamp,
	primary key (Num_Caja, Saldo_actual, Fecha, Hora)
);

CREATE TABLE Cierre_Caja(
	Num_Caja char(14) not null,
	Fecha_Cierre date,
	Hora_Cierre time,
	Cedula char(14),
	Saldo money,
	tiempo timestamp,
	primary key (Num_Caja, Fecha_Cierre, Hora_Cierre, Cedula, Saldo),
	foreign key (Cedula) references empleado
);

CREATE TABLE Apertura_Caja(
	Num_Caja char(14) not null,
	Fecha_Aper date,
	Hora_Apertur time,
	Cedula char(14),
	Saldo money,
	tiempo timestamp,
	primary key (Num_Caja, Fecha_Aper, Hora_Apertur, Cedula, Saldo),
	foreign key (Cedula) references empleado
);


CREATE TABLE Facturas(
	Num_Factura serial not null,
	Fecha date,
	Total money,
	Num_Caja char(14),
	Cedula_Cliente char(14),
	Cedula_Cajero char(14),
	primary key (Num_Factura),
	foreign key (Cedula_Cajero) references LogIn(username)
);

CREATE TABLE Facturados(
	Num_Factura int not null,
	Cod char(30) not null,
	Cantidad int not null,
	Precio money not null,
	primary key (Num_Factura, Cod),
	foreign key (Num_Factura) references Facturas,
	foreign key (Cod) references Producto
);

CREATE TABLE Compra(	
	ID_Solicitud serial not null,
	CedulaEmpleado char(14) not null,
	Total money,
	Fecha date not null,
	primary key (ID_Solicitud),
	foreign key (CedulaEmpleado) references Empleado (cedula)
);

CREATE TABLE Solicitud(
	ID_Solicitud int not null,
	Cod char(30) not null,
	CedulaVen char(14) not null,  
	CedulaPro char(14) not null,
	Cantidad int,
	Precio money,
	primary key (ID_Solicitud),
	foreign key (ID_Solicitud) references compra,
	foreign key (CedulaVen) references Empleado (cedula),
	--foreign key (CedulaPro) references Proveedor (cedula)
);

CREATE TABLE Proveedor(
	Cedula char(14) not null,
	Nombre varchar(15),
	Apellido1 varchar(15),
	Apellido2 varchar(15),
	Descuento int DEFAULT 0,
	Email varchar(20),
	Contacto varchar(15),
	Fecha_Ingreso date,
	primary key (Cedula),
	foreign key (Cedula) references Persona
	on delete cascade
);

CREATE TABLE Lugar(
	Provincia char(14) not null,
	Canton varchar(45) not null,
	Distrito varchar(45) not null,
	primary key (Canton, Distrito)
);

CREATE TABLE Sucursales(
	Nombre char(20) not null,
	Provincia char(14) not null,
	Canton varchar(45) not null,
	Distrito varchar(45) not null,
	Senas varchar(100),
	Gerente varchar(20),
	PRIMARY KEY (Nombre)
);

CREATE TABLE Puestos(
	Puesto varchar(15) not NULL
	PRIMARY KEY (Puesto)
);

