from conexion import *
from consultas import *

lista = miCursor.execute(todos_reg)
lista = miCursor.fetchall() 

for producto in lista:
        print ("Articulo: ", producto[0], " / Sección: ", producto[3]) 

lista_contar = miCursor.execute(total)
lista_contar = miCursor.fetchone()      # trae un unico regisro

print("La cantidad de productos son:",lista_contar[0])

lista2 = miCursor.execute("SELECT * FROM PRODUCTOS WHERE precio >= 700")
lista2 = miCursor.fetchall()       # asigna el contenido a un arreglo

print("\nSolo los productos de $ 700 en adelante\n")  

for producto in lista2:
        print ("Articulo: ", producto[0], " / Precio: ", producto[2]) 

# con ingreso del dato

dato = float(input("A partir de que precio: "))

lista3 = miCursor.execute(f"SELECT * FROM PRODUCTOS WHERE precio >= '{dato}'")

lista3 = miCursor.fetchall() 

print(lista3)

miConexion.close()