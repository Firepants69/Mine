usuarios = [
    ["rafael", 2],
    ["felipe", 3],
    ["ericardo", 6],
    ["the whale", 9]
]


# nombres = [usuario for usuario in usuarios if usuario[1] > 6]
# print(nombres)
nombres = [usuario[0] for usuario in usuarios if usuario[1] > 6]
print(nombres)
# map
# nombres.append(usuario[0])
# print(nombres)
# nombres = list(map(lambda usuario: usuario[0], usuarios))
menosUsuarios = list(filter(lambda usuario: usuario[1] > 2, usuarios))
print(menosUsuarios)
