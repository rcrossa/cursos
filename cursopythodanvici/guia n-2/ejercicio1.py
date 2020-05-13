Electrodomestico = str(input("Ingrese el nombre del electrodomestico: "))
Precio = float(input("Ingrese el precio: "))

if Precio <= 12500 :
    total = Precio * 1.21
    print("El precio con iva del", Electrodomestico," es: ", total)
else:
    total =Precio / 3 
    total = total * 1.10
    print("El precio con iva del", Electrodomestico," es: ", total)