import mysql.connector  #conector para mysql
import dbConnect

miConexion = mysql.connector.connect(**datos_db.dbConnect)
cursor= conexion.cursor()


