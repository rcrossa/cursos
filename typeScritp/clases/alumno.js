var Alumno = /** @class */ (function () {
    function Alumno() {
    }
    Alumno.prototype.mostrarMensaje = function () {
        console.log("hola", this.nombre + " " + this.apellido);
    };
    Alumno.prototype.asignar = function (nombreParametro, apellidoParametro, pesoParametro) {
        this.nombre = nombreParametro;
        this.apellido = apellidoParametro;
        this.peso = pesoParametro;
    };
    return Alumno;
}());
//fin de la clase
//instancio objetos
var alumno1 = new Alumno;
alumno1.asignar("Alejandro", "perez", 100);
alumno1.mostrarMensaje();
var alumno2 = new Alumno();
alumno2.asignar("Martin", "Rodriguez", 80);
alumno2.mostrarMensaje();
var alumno3 = new Alumno();
alumno2.asignar("Rosa", "lopez", 70);
alumno2.mostrarMensaje();
