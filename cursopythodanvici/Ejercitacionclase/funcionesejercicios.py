from collections import Counter
from random import randint

a=[1,2,5]
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
         if resul < n:
            for a in range(3):
                    if a%5==0:
                        while resul < n:
                                resul+=5
                                monedas5+=1
                                
                                return resul


def numero2(resul):
        if resul<numerorandom:
            if resul%2 in a:
                while resul < n:
                    resul+=2
                    monedas2=monedas2+1
                    return resul

def numero1(resul):
        if resul<n:
            if 2 in a:
                while resul < n:
                    resul+=2
                    monedas2=monedas2+1
                    

def suma (monedas5):
    resul=5*monedas5
    return resul

def suma (monedas2):
     resul=5*monedas5
     return resul

def suma (monedas1):
    resul=5*monedas5
    return resul