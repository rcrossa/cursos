interface Alumnos{
    nombre:string;
    edad:number;
}

var listadoDeNombres: Array<string> = ["juana","Maria","ana"];
var listadoDeNumeros: Array<number> =[15,25,35,55,65];

var listadoDeAlumnos: Array<Alumnos> = [
{
    nombre: "Maria",
    edad: 15
},
{
    nombre:"ana",
    edad:24
},
{
    nombre: "Roberto",
    edad: 35
}
]

console.log(listadoDeNombres)
console.log(listadoDeNumeros)
console.log(listadoDeAlumnos)