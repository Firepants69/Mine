saludo = "Hola Global"


def saludar():
    global saludo
    saludo = "Hola Mundo"
    print(saludo)


def saludaChachito():
    saludo = 25
    print(saludo)


restultado = saludo + 3
print(restultado)
saludar()
restultado = saludo + 3
print(saludo)
