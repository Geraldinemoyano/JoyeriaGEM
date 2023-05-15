Algoritmo sin_titulo
	
	Definir A, C, D, E, F, G, P, sumajoyeria Como Entero
	Definir B Como Caracter
	Definir BC, MC, AC, prototal Como Real
	
	Escribir " Ingrese el código de la joya en número, sin espacios ni puntos."
	Leer A 
	Escribir " Ingrese el nombre de la joya"
	Leer B 
	Escribir " "
	Escribir " Las joyas que se ofrecen tienen los siguientes rangos en precios:"
	Escribir " Joyas de oro 24 kilates 920000"
	Escribir " Joyas de oro 30 kilates 1700000"
	Escribir "Joyas plata de ley 925 90000"
	Escribir " "
	Escribir " ************************* "
	Escribir " ¿Cuantas joyas de oro 24K se vendieron en la semana?"
	leer C
	BC = 920000*C
	Escribir " El resultado es: ",BC
	
	Escribir " ************************* "
	Escribir " ¿Cuantas joyas de 30K se vendieron en la semana? "
	leer D
	MC = 17000000*D
	Escribir " El resultado es: ",MC
	
	Escribir " ************************* "
	Escribir " ¿Cuantas joyas de plata 925 se vendieron en la semana? "
	leer E
	MC = 90000*E
	Escribir " El resultado es: ",AC
	Escribir " ************************* "
	sumajoyeria = C+D+E+F+G+P;
	prototal = BC+MC+AC;
	Escribir ""
	Escribir "********"
	Escribir "El total de joyas vendidas es: ",sumajoyeria
	Escribir B " El nombre y codigo de la joya ",A
	Escribir "Entrega el total de joyas vendidas semanalmente"
	Escribir ""
	Escribir C " Joyas de 24K "
	Escribir D " Joyas de 30K"
	Escribir E " Joyas de plata 925"
	Escribir ""
	Escribir "El promedio semanal de joyas vendidas es de: ",prototal
	Escribir BC " En Joyas de 24K"
	Escribir MC " En Joyas de 30K"
	Escribir AC " En Joyas de plata 925"	
	
FinAlgoritmo
