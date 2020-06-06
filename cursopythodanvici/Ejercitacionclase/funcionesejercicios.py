from collections import Counter
from random import randint

a = ['1', '2', '5']
resul=0
n=0
monedas5=0
monedas2=0
monedas1=0


# Ejercicio 1
def separacaracteres(b):
           x= b.split()
           print(x)
            
def contador(b):
            print(Counter(b))

# Ejercicio 2

def numerorandom(n):
            n=int(randint(0,100))
            return n



def numero5(resul):
          for a in range(3):
                    if a%5==0:
                        while resul < n:
                            resul+=5
                            monedas5=monedas5+1
                    if resul > n:
                        monedas5=monedas5-1
                        resul=resul-5
                        resul=5*monedas5
                    return resul


def numero2(resul):
        for a in range(3):
                    if a%2==a:
                        while resul < n:
                            resul+=2
                            monedas2=monedas2+1
                    if resul>n:
                             while resul>n:
                                    monedas2=monedas2-1
                                    resul=resul-2
                    return resul

def numero1(resul):
        for a in range(3):
                    if a%1==a:
                        while resul < n:
                            resul+=1
                            monedas1+=1
                    resul3=1*monedas1
                    resul=resul+resul3
                    

def suma (monedas5):
    resul=5*monedas5
    return resul

def suma (monedas2):
     resul=5*monedas5
     return resul

def suma (monedas1):
    resul=5*monedas5
    return resul