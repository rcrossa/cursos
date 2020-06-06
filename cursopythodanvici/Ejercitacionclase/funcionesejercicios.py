from collections import Counter
from random import randint

a=[1,2,5]

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
            numero=int(randint(0,100))
            return numero



def numero5(resul):
        if resul < n:
            if 5 in a:
                while resul < n:
                        resul+=5
                        monedas5+=1
                        return resul



