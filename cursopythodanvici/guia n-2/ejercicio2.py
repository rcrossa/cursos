Apellido = str(input("Ingrese el apellido: "))
Marzo = float(input("Ingrese el saldo de Marzo: "))
Abril = float(input("Ingrese el saldo de Abril: "))


if Marzo > Abril:
    Diferencia = Marzo - Abril
    if Diferencia <= 8000:
        print("Enviar promoción")    
    else:
        print("Codigo 3 ", Apellido)
elif Abril > Marzo:
        Diferencia= Abril - Marzo
        if Diferencia <= 8000:
            print("Enviar promoción") 
        else:
            print("Codigo 3 ", Apellido)
  

