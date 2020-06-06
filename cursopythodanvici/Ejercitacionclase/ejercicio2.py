import funcionesejercicios
# from random import randint


# n=int(randint(0,100))
a = ['1', '2', '5']
n = 0
resul = 0
resul2 = 0
resul3 = 0
monedas5 = 0
monedas2 = 0
monedas1 = 0
resul = 0
a = 0
# n=0
n = funcionesejercicios.numerorandom(n)
# valores=0

print("Numero random: ", n)


if resul < n:
            for a in range(3):
                    if a%5==0:
                        while resul < n:
                                resul+=5
                                monedas5+=1
                    if resul > n:
                        monedas5=monedas5-1
                        resul=resul-5
                        resul=5*monedas5
                        
            for a in range(3):
                    while resul < n:
                            resul+=2
                            monedas2=monedas2+1
                    if resul>n:
                             while resul>n:
                                    monedas2=monedas2-1
                                    resul2=resul-2
                                    resul=resul2
            for a in range(3):
                    if a%1==a:
                        while resul < n:
                            resul+=1
                            monedas1+=1
                    resul3=1*monedas1
                    resul=resul+resul3


       

print("Monedas de 5: ", monedas5, "\nMonedas de 2: ", monedas2, "\nMonedas de 1:", monedas1)


