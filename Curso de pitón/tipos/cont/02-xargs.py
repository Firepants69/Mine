def suma(*numeros):
    resultado = 0
    for numero in numeros:
        resultado += numero
    print(resultado)


suma(2, 5, 3, 4, 34, 535, 353, 35353, 53, 535, 35, 35, 3, 5)
suma(2, 34, 35, 35, 5, 35, 3)


def multiapellidos(*apellidos):
    for apellido in apellidos:
        print(apellido, end=" ")


multiapellidos("hola", "adios", "como estas", "pendejada", "tilin")
