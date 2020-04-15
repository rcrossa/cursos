interface Alumno{
    alumnoID:number;
    nombre: string;
    apellido: string;
}

var alumnos:Alumno[] =[];

alumnos.push({alumnoID: 1,nombre: "Ana", apellido:"pineda"});

alumnos.push({alumnoID: 2,nombre: "carmen", apellido:"pineda"});

alumnos.push({alumnoID: 3, nombre: "jorge", apellido:"pineda"});

var alumnoEncontrado = alumnos.find((alumno)=>{
    return alumno.nombre.includes("arme")
})
console.log(alumnoEncontrado)

// var alumnoEncontrado = alumnos.find((alumno)=>
// {
//     return alumno.alumnoID == 2;
// })
// console.log(alumnoEncontrado);