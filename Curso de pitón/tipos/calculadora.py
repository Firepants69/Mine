
n1 = input("ingresa el primer numero ""\n")
n2 = input("ingresa el segundo numero ""\n")
n1 = int(n1)
n2 = int(n2)
multiplicacion = n1 * n2
suma = n1 + n2
resta = n1 - n2
division = n1 / n2
cuadrado1 = n1 * n1
cuadradodos = n2*n2
salvo = f"""
los numeros {n1} y {n2} sumados son {suma} \n
los numeros {n1} y {n2} restados son {resta} \n
los numeros {n1} y {n2} multiplicados son {multiplicacion} \n
los numeros {n1} y {n2} divididos son {division} \n
el cuadrado del numero {n1} es {cuadrado1} \n
el cuadrado del numero {n2} es {cuadradodos} \n
los cuadrados sumados son {cuadrado1 + cuadradodos}
"""
print(salvo)
