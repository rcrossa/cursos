interface Usuario{
    nombre : string;
    apellido: string; 
}

var listadoDeUsuarios: Array<Usuario> = [
    {
        nombre: 'Ana',
        apellido: 'Perez'
    },    
    {
        nombre:'Soledad',
        apellido:'Juarez'
    },
    {
        nombre:'Pepe',
        apellido:'Lopez'
    }
]
// for (let cantidadRepetir:number =0;cantidadRepetir < listadoDeUsuarios.length;cantidadRepetir++) {
//     console.log(listadoDeUsuarios[cantidadRepetir].apellido)
    
// }
// for (let Usuario of listadoDeUsuarios) {
//     console.log('Hola Bienvenido: ',Usuario.nombre)
//     console.log('Nos alegra tenerte de nuevo :', Usuario)
// }

for (let posicion in listadoDeUsuarios) {
     console.log(listadoDeUsuarios[posicion].nombre)
}