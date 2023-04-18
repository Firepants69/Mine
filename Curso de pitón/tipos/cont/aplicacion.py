print("bienvenidos a la calculadora")
print("para poder salir escribe salir")
print("las operaciones son suma , multi, div y resta")
n1 = ""
while True:
    if not n1:
        n1 = input("ingrese número: ")
        if n1.lower() == "salir":
            break
        n1 = int(n1)
    op = input("ingresa operacion: ")
    if op.lower() == "salir":
        break
    n2 = input("ingresa siguiente numero: ")
    if n2.lower() == "salir":
        break
    n2 = int(n2)
    if op.lower() == "suma":
        n1 += n2
    elif op.lower() == "resta":
        n1 -= n2
    elif op.lower() == "multi":
        n1 *= n2
    elif op.lower() == "div":
        n1 /= n2
    else:
        print("coloca una opcion valida")
        break

    print(f"el resultado es {n1}")
