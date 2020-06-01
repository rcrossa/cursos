import funcionesejercicios



# n=numerorandom()
a=[1,2,5]
resul=0
monedas5=0
monedas2=0
monedas1=0
a=0
n=0
n=funcionesejercicios.numerorandom(n)


print("Numero random: ",n)

resul=funcionesejercicios.numero5(resul)
# if resul < n:
#     if 5 in a:
#         while resul < n:
#             resul+=5
#             monedas5+=1


    
# print("primer cantidad:",resul)
# resul=5*monedas5
# print("Primer result:",resul)

if(resul>n):
    monedas5=monedas5-1
    # print("monedas if:",monedas5)
    resul=resul-5
    resul=5*monedas5
# print("Segundo result:",resul)


    if resul<n:
        if 2 in a:
            while resul < n:
                resul+=2
                monedas2=monedas2+1

        #   resul2=2*monedas2
        #   resul=resul+resul2

# print("Segunda cantidad:",resul)


if(resul>n):
   while resul>n:
        monedas2=monedas2-1
        resul=resul-2

    # resul2=2*monedas2
    # resul=resul+resul2
    # print("monedas if:",monedas5)
# print("Segundo result:",resul)



if resul < n :
    if 1 in a:
        while resul < n:
            resul+=1
            monedas1+=1    

# resul3=1*monedas1
# resul=resul+resul3

# print("resultado final:\n", resul)


print("Monedas de 5: ",monedas5,"\nMonedas de 2: ", monedas2,"\nMonedas de 1:", monedas1)
