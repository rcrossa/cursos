var listadoDeUsuarios = [
    {
        nombre: 'Ana',
        apellido: 'Perez'
    },
    {
        nombre: 'Soledad',
        apellido: 'Juarez'
    },
    {
        nombre: 'Pepe',
        apellido: 'Lopez'
    }
];
// for (let cantidadRepetir:number =0;cantidadRepetir < listadoDeUsuarios.length;cantidadRepetir++) {
//     console.log(listadoDeUsuarios[cantidadRepetir].apellido)
// }
for (var _i = 0, listadoDeUsuarios_1 = listadoDeUsuarios; _i < listadoDeUsuarios_1.length; _i++) {
    var Usuario = listadoDeUsuarios_1[_i];
    console.log('Hola Bienvenido: ', Usuario.nombre);
    console.log('Nos alegra tenerte de nuevo :', Usuario);
}
