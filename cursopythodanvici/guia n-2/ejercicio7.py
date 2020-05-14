Hermano1 = int(input("Ingrese la edad del hermano 1: "))
Hermano2 = int(input("Ingrese la edad del hermano 2: "))
Diferencia = 0

if Hermano1 > Hermano2:
    Diferencia=Hermano1 -Hermano2
    print("Mayor Hermano 1: ",Hermano1,"Diferencia Hermano 2: ", Diferencia,"")
else:
    if(Hermano2 > Hermano1):
        Diferencia = Hermano2 - Hermano1
        print("Mayor Hermano 2: ", Hermano2, "Diferencia Hermano 1: ",Diferencia)