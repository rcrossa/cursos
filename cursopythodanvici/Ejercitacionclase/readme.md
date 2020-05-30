1) Escribir un programa en Python que cuente la frecuencia de caracteres en un string, devolverlo en un
diccionario, usar funciones e importación.
Ejemplo: google.com
Resultado: {'o': 3, 'g': 2, '.': 1, 'e': 1, 'l': 1, 'm': 1, 'c': 1}

2) Escribir un programa que realice la devolución de una cantidad dada por el usuario en monedas.
El programa debe cumplir los siguientes requisitos:
Solo se disponen de tres tipos de monedas: 5, 2 y 1 €. Crear una lista que contenga estos tres tipos de moneda y
usar la lista en la solución.
El programa debe generar un número al azar de euros entre 1 y 100
El programa debe mostrar por pantalla el mínimo número de monedas necesarias para sumar la cantidad
definida al azar por el usuario y cuántas monedas de cada tipo se necesitan para ello. El número de monedas de
cada tipo debe guardarse en otra lista, usar funciones e importación.
Ej.: 12: Se necesitan 3 monedas: 2 de 5 €, 1 de 2 €, 0 de 1 €

3) Escribir un programa que cree un diccionario simulando un carrito de compra. El programa debe preguntar el
artículo (key) y su precio (value) y añadir el par al diccionario, hasta que el usuario decida terminar. Después se
debe mostrar por pantalla la lista de la compra y el costo total, con el siguiente formato:
Lista de la compra
Artículo 1 Precio
Artículo 2 Precio
Artículo 3 Precio
... ...
Total $....

4) Escribir un programa que gestione las facturas pendientes de cobro de una empresa.
Las facturas se almacenarán en un diccionario donde la clave de cada factura será el número de factura y el
valor el precio final de la factura.
El programa debe preguntar al usuario si quiere añadir una nueva factura, pagar una existente o terminar.
Si desea añadir una nueva factura se preguntará por el número de factura y su precio y se añadirá al diccionario.
Si se desea pagar una factura se preguntará por el número de factura y se eliminará del diccionario. Después de
cada operación el programa debe mostrar por pantalla la cantidad cobrada hasta el momento y la cantidad
pendiente de cobro.
5) Realizar una función en Python que reciba un string, donde todas las letras iguales a la primera letra de la
palabra sean reemplazadas por el carácter $, excepto la primera letra
Ejemplo: estudie -> estudi$

* Recuerden que texto [1:4], implica que el primer elemento es cero y na hasta fin-1, en caso de texto [3:], va hasta el
final del string.