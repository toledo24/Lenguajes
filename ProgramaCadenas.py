#Miguel Serrano Ramirez
entrada = raw_input("Agregar diccionario [Ejemplo: a,b,c,d]   ")
#separar con comas el diccionario
entrada = entrada + ","
#cadena
cadena = []
aux = ""
for i in range(0, len(entrada)):
	if entrada[i] !="," :
		aux = aux + entrada[i]
	else:
                #adjuntar a la lista .append
		cadena.append(aux)
		aux = ""
#A^0
print "A^0 = Epsilon"
#A^1
a = "("
for i in range(0, len(cadena)):
	a = a + cadena[i]+","
a = a + ")"
print "A^1 = "+a
#A^2
b = "("
for i in range(0, len(cadena)):
	for l in range(0, len(cadena)):	
		b = b + cadena[i]+cadena[l]+","
b = b + ")"
print "A^2 = "+b
#A^3
c = "("
for i in range(0, len(cadena)):
	for l in range(0, len(cadena)):	
		for m in range(0, len(cadena)):
			c = c + cadena[i]+cadena[l]+cadena[m]+","
c = c + ")"
print "A^3 = "+c
print "Listo"


