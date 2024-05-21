Esta tabla esta relacionada con la tabla categoria.
Para ingresas al swagger:
http://localhost:8013/swagger-ui/index.html#/surcursal-controller-roberto/updateById
para insertar datos con Post:
http://localhost:8013/api/sursscursal/
json:
{
  "name": "Carnana",
  "due_date": "2024-05-21T02:18:40.033Z",
  "enable": true,
  "price": 50,
  "category": {
    "id": 54,
    "name": "Carnicos",
    "enable": true
}
Para seleccionar todo Get:
http://localhost:8013/api/sursscursal/
  Lo unico que no pude realizar fue el eliminar por nombre.
