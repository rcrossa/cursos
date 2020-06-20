from conexion import *
from consultas import *

miCursor.execute("DELETE FROM PRODUCTOS WHERE precio > 300")    # nunca olvidar el WHERE
miConexion.commit()

miCursor.execute(todos_reg)
print(miCursor.fetchall())

miCursor.execute("UPDATE PRODUCTOS SET nombre_articulo='Boligrafo' WHERE ID='2'")
miConexion.commit()

miCursor.execute(todos_reg)
print(miCursor.fetchall())

# uso de fetchone
miCursor.execute("SELECT nombre_articulo as nom FROM PRODUCTOS WHERE ID='8'")
prod = miCursor.fetchone()
print(prod[0])