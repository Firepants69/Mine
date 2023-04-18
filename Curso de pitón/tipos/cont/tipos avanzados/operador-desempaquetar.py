lista = [1, 2, 3, 4, 5]
# print(lista)
# print(*lista)
# lista2 = (1, 2, 4, 5, 6)
# rint(*lista2)
lista3 = {1, 2, 3, 4, 5}
print(*lista3)

lista2 = [4, 5]

compinada = ["sexo", *lista, *lista2, "ete setch"]
print(compinada)

punto1 = {"x:": 10, "y": 19}
punto2 = {"z:": 14, "x": 11}

nuevo = {**punto1, **punto2, "lala": "mundo", "x": "mundo"}
print(nuevo)
