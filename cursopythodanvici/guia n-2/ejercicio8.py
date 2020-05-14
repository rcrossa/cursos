Operario = str(input("Operario: ")) 
i=0
Total=0

while i < 5:
    i=i+1
    Unidades = int(input("Cantidad de unidades: "))
    Total = Unidades + Total
    print(Total)
    Promedio = Total / 5
    if Promedio > 499:
        print("Supera el promedio. Total: ", Total, "Hay bono")
       
   
if Promedio < 500 :
        print("El total semanal es: ", Total, "No hay bono")

