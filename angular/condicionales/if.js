var cantidadSolicitada = 12;
var deseaImprimir = true;
if (cantidadSolicitada > 10) {
    console.log("Tienes que aplicar un descuento");
}
if (deseaImprimir) {
    console.log("Estamos imprimiendo");
    cantidadSolicitada = 50;
    if (cantidadSolicitada > 10) {
        console.log("Hacer un descuento");
    }
}
