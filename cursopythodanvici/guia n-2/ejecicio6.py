Pais = str(input("Ingrese el pais: "))
Pproducto = float(input("Valor de producto: "))
Tasaimp = float(input("Tasa de interes: "))

if Pais == "Argentina":
     print("Valor del producto: ", Pproducto)
else:
     Total = Pproducto + Tasaimp
     print("Total: ",Total)

