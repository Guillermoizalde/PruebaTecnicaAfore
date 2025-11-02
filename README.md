[README.md](https://github.com/user-attachments/files/23292666/README.md)
# 🏦 Banco Azteca - Sistema de Gestión de Clientes

Este proyecto es una aplicación web completa (Full Stack) para la **gestión de clientes del Banco Azteca**, desarrollada con:

- **Backend:** Spring Boot (Java 17)
- **Frontend:** HTML, CSS, JavaScript y Bootstrap
- **Base de datos:** MySQL
- **Autenticación:** Spring Security + endpoint de login personalizado
- **Funciones principales:** Registrar, listar, actualizar, eliminar y descargar clientes en PDF

---

## 🚀 Estructura del Proyecto

```
bancoazteca/
├── src/
│   ├── main/
│   │   ├── java/com/guillermo/bancoazteca/
│   │   │   ├── controller/        → Controladores REST (API)
│   │   │   ├── entity/            → Entidades JPA
│   │   │   ├── repository/        → Interfaces JPA Repository
│   │   │   ├── services/          → Lógica de negocio
│   │   │   └── config/            → Configuración de seguridad (Spring Security)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

---

## ⚙️ Configuración del Backend

### 1️⃣ `application.properties`

```properties
spring.application.name=bancoazteca

server.port = 9090

spring.datasource.url=jdbc:mysql://localhost:3306/db_azteca
spring.datasource.username=root
spring.datasource.password=sasa
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true

# Ver las consultas SQL
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE

spring.security.user.name=admin
spring.security.user.password=12345
```

---

## 🔧 Endpoints Principales

| Método | Endpoint                  | Descripción                         |
|---------|---------------------------|-------------------------------------|
| POST    | `/api/login`              | Inicia sesión (autenticación)       |
| GET     | `/api/clientes`           | Lista todos los clientes            |
| POST    | `/api/clientes`           | Crea un nuevo cliente               |
| GET     | `/api/clientes/{id}`      | Obtiene cliente por ID              |
| PUT     | `/api/clientes/{id}`      | Actualiza cliente existente         |
| DELETE  | `/api/clientes/{id}`      | Elimina cliente                     |

---

## 💻 Frontend (HTML + Bootstrap + JS)

El frontend está hecho con **Bootstrap 5** y **SweetAlert2**.  
Incluye las siguientes pantallas/modales:

- **Login:** validación de usuario con backend.
- **Registro:** formulario para agregar clientes.
- **Listado:** tabla con clientes registrados.
- **Acciones:** editar, eliminar y descargar PDF.
- **Alertas:** confirmación y éxito con SweetAlert2.

---

## 📦 Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Guillermoizalde/PruebaTecnicaAfore.git
cd bancoazteca
```

### 2️⃣ Crear la base de datos
En MySQL:
```sql
CREATE DATABASE db_azteca;
```

### 3️⃣ Compilar y ejecutar
```bash
mvn clean install
mvn spring-boot:run
```

El servidor se levantará en:
```
http://localhost:9090
```

### 4️⃣ Abrir el frontend
Abre el archivo:
```
login.html
```
o usa un servidor local (LiveServer en el puerto por defecto "5500")

---

## 📄 Generación de PDF

El sistema permite descargar los registros en **formato PDF**.

---

## 🧠 Autor

👤 **Guillermo Izalde**  
📧 contacto: *[joseguillermoizaldefernandez@gmail.com]*  
💻 Proyecto educativo con fines de práctica — *Banco Azteca (examen práctico)*
