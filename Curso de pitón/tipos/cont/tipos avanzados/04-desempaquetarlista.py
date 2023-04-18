numeros = [1, 2, 4]
# rick
# primero = numeros[0]
# segundo = numeros[1]
# tercero = numeros[2]

primero, segundo, tercero = numeros
print(primero, segundo, tercero)

palabras = ["eres", "golosa", "glotona"]
uno, dos, tres = palabras
print(uno, dos, tres)

booleanos = [True, False, True]

uno, dos, tres = booleanos
print(uno, dos, tres)

ete = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

primero, segundo, tercero, *enmedio, penultimo, ultimo = ete
print(primero, segundo, tercero, enmedio, penultimo, ultimo)
