hola = " hola mundo putas gordas de mierda"

hola1 = hola.replace(' ', '')
print(hola1)


def EsPalindromo(texto):
    textoSinEspacios = texto.replace(' ', '').lower()
    invertida = textoSinEspacios[:: -1]
    return invertida == textoSinEspacios


def no_space(texto):
    nuevo_texto = ""
    for char in texto:
        if char != " ":
            nuevo_texto += char
    return nuevo_texto


def reverse(texto):
    texto_al_reves = ""
    for char in texto:
        texto_al_reves = char + texto_al_reves
    return texto_al_reves


def Espalindromos(texto):
    texto = no_space(texto).lower()
    texto_al_reves = reverse(texto).lower()
    return texto == texto_al_reves


print(Espalindromos("Amo la Paloma"))
print(EsPalindromo("hola amigos como estan"))


cadena_invertida = ""
r = input("coloca algo para voltear el caracter: ")
for char in r:
    cadena_invertida = char + cadena_invertida
    print(cadena_invertida)

nt = ""
s = "tu puta madre negro de mierdaaaaa"
for char in s:
    if char != " ":
        nt += char
print(nt)


for i in range(5):
    i += 1
    print(i)
