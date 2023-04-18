cotas = ["wolfgang", "pelusa", "wolfgang", "tu mama", "tu papa"]

print(cotas.count("wolfgang"))
if "wolfgang" in cotas:
    print(cotas.index("wolfgang"))


cotas.insert(1, "tu puta madre pendejos perro bastardo")
cotas.append("ay mi mamita")
cotas.remove("pelusa")
cotas.pop(1)
del cotas[1]
print(cotas)
