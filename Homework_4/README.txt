In urma testelor cu cele doua implementari Student si LazyStudent putem observa urmatoarele:

-pe un esantion de 3000 de operatii de get din cele 2 implementari avem urmatoarele

lungime_lista = 1000
	16 - timp Student
	8 - timp LazyStudent
lungime_lista = 2000
	17 - timp Student
	16 - timp LazyStudent
lungime_lista = 3000
	17 - timp Student
	21 - timp LazyStudent
lungime_lista = 5000
	21 - timp Student
	37 - timp LazyStudent

CONCLUZIE - pe masura ce lungimea listei creste, timpul pentru implementarea Student
ramane aproape constant, pe cand in implementarea Lazystudent (desi functioneaza mai rapid 
pe lungimi de lista mici) va creste semnificativ