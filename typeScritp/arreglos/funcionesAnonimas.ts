interface Alumno{
    nombre: string;
    apellido: string;
}

var alumnos:Alumno [] =[];

alumnos.push({nombre: "Ana", apellido:"pineda"});

alumnos.push({nombre: "carmen", apellido:"pineda"});

alumnos.push({nombre: "jorge", apellido:"pineda"});

alumnos.forEach((alumno)=>
{
    console.log(alumno.nombre);
}
)