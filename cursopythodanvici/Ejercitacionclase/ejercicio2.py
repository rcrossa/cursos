from a import numerorandom


a=[1,2,5]
n=numerorandom()
resul=0
cantidad=0
monedas5=0
monedas2=0
monedas1=0


print("Numero random: ",n)

while cantidad < n:
    cantidad+=5
    monedas5+=1

# print("primer cantidad:",cantidad)
resul=5*monedas5
# print("Primer result:",resul)

if(resul>n):
    monedas5=monedas5-1
    # print("monedas if:",monedas5)

cantidad=cantidad-5
resul=5*monedas5
# print("Segundo result:",resul)


if resul<n:
    while cantidad < n:
          cantidad+=2
          monedas2+=1

# print("Segunda cantidad:",cantidad)
resul2=5*monedas2
resul=resul+resul2
# print("Tercer result:",resul)

if resul<n:
          cantidad+=1
          monedas1+=1                         


print("Monedas de 5: ",monedas5,"\nMonedas de 2: ", monedas2,"\nMonedas de 1:", monedas1)
