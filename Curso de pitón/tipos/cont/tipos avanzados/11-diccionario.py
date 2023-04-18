punto = {"tu papa": "es joto", "tu mama": "es puta"}
print(punto)
print(punto["tu mama"])
print(punto["tu papa"])

punto["tu tia"] = "es una zorrra"
# print(punto, punto["alalla"])
if "lala" in punto:
    print("aña", punto["alaalaa"])


print(punto.get("x"))
print(punto.get("lallaa", 97))
del punto["tu mama"]
del punto["tu papa"]

print(punto)
punto["x"] = 25

for valor in punto:
    print(valor, punto[valor])

for llave, valor in punto.items():
    print(llave, valor)

usuarios = [
    {"id": 1, "nombre": "chanchito"},
    {"id": 2, "nombre": "felipe"},
    {"id": 3, "nombre": "esteban"},
    {"id": 4, "nombre": "roel"},
]
for usuario in usuarios:
    print(usuario["nombre"])
