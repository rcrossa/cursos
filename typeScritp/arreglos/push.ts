interface Alumno{
    nombre:string;
    apellido:string;
}
var alumnos: Alumno[] = [];

var ana: Alumno = {
    nombre:"Ana",
    apellido:"lopez",
}
var carmen: Alumno = {
    nombre:"carmen",
    apellido:"lopez",
}


alumnos.push(ana);
alumnos.push(carmen);
console.log(alumnos);