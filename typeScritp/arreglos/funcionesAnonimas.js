var alumnos = [];
alumnos.push({ nombre: "Ana", apellido: "pineda" });
alumnos.push({ nombre: "carmen", apellido: "pineda" });
alumnos.push({ nombre: "jorge", apellido: "pineda" });
alumnos.forEach(function (alumno) {
    console.log(alumno.nombre);
});
