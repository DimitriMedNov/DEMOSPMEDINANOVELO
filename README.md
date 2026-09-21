# Demo de Spring Boot — MVC y REST

Aplicación de la materia de desarrollo de la Universidad Anáhuac Mayab. Administra productos y usuarios exponiendo las dos formas: páginas web y API.

## Qué tiene

- **Capa MVC** con vistas en Thymeleaf y Bootstrap, para usar la aplicación desde el navegador
- **Capa REST** (`ProductRESTController`, `UsuarioRESTController`), para consumirla desde otro programa
- Entidades JPA `Product`, `Usuario`, `Login` y `ChangePassRequest`, con sus repositorios y una capa de servicio de por medio

Las dos capas comparten los mismos servicios: la lógica está escrita una vez y se sirve por dos caminos.

## Stack

Java · Spring Boot · Spring Data JPA · Thymeleaf · Bootstrap · Maven

> De esta misma práctica existen dos versiones anteriores: `SpringMedinaNovelo` (sólo MVC) y `Software3` (recortada).
