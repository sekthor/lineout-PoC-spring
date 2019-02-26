## Get started
1. Install a JDK (>=8)
2. Install Maven
3. Get a good Java IDE (we recommend IntelliJ)
4. Open Project in IDE
5. Start project
6. Have fun :-)

The currently implemented endpoints are on

* `localhost:8080/teams`
* `localhost:8080/teams/{id}`   (replace {id} with any number)
* `localhost:8080/teams/ping`

## Structure

### models
Create all your data models here.

### services
Every data model should have its own service. Usually there is a getSingle, and a getAll method.

### resources
The resources are the representation of the actual REST API. Every resource has its own endpoint (i.e. `/teams`). The endpoint should always be in plural. It usually provides a getAll on its root (`/`), and a getDetail with a path parameter (`/{id}`)


## TODO
This is only a prototype. To have real fun, the following things should / could be done.

1. Database layer
2. Swagger
