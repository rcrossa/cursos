Numero1 = float(input("Ingres un numero: "))
Numero2 = float(input("Ingres un numero: "))
Operacion = str(input("Ingrese caracter de operacion: "))
Suma=0
Resta=0
Multiplicacion=0
Divicion=0

if Operacion == "+":
     Suma = Numero1 + Numero2
     print("Resultado de la suma: ", Suma)
else:
     if Operacion == "-":
         Resta = Numero1 - Numero2
     elif Operacion == "/" :
                     Divicion = Numero1 / Numero2
                     print("Resultado de la Division es: ", Divicion)
     elif Operacion == "*" :
                     Multiplicacion = Numero1 * Numero2
                     print("Resultado de la Multiplicacion: ",Multiplicacion)
     else:
         print("El caracter ingresado no es el requerido")   
