class Alumno{
    nombre: string;
    apellido:string;
    peso:number;

    


    mostrarMensaje():void{

        console.log("hola", this.nombre + " "+ this.apellido);
    }
    
    asignar(nombreParametro:string, apellidoParametro:string, pesoParametro:number){
        this.nombre = nombreParametro;
        this.apellido = apellidoParametro;
        this.peso = pesoParametro;
    }
}
//fin de la clase
//instancio objetos
var alumno1: Alumno = new Alumno;
alumno1.asignar("Alejandro","perez",100);
alumno1.mostrarMensaje();

var alumno2: Alumno = new Alumno();
alumno2.asignar("Martin","Rodriguez",80);
alumno2.mostrarMensaje();

var alumno3: Alumno = new Alumno();
alumno2.asignar("Rosa","lopez",70);
alumno2.mostrarMensaje();