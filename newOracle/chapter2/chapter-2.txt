1 - Porque Java especifica rigorosamente o intervalo e o comportamento de seus tipos primitivos?
-- Pela questão da portabilidade.


2 - Qual é o tipo de caractere usado em Java e porque ele é diferente do tipo de caractere usado em outras linguagens de programação?
-- Tipo char, Unicode, feito com 16 bits ao contrário das outras formas como o ASCII que usa 8 bits.


3 - Um valor boolean pode ter o valor que você quiser já que qualquer valor diferente de zero é verdadeiro. Verdadeiro ou falso?
-- Falso. Apenas verdadeiro (1) e falso (0).


4 - Dada esta saída:
	one
	two
	three
	, usando um único string, mostre a instrução println() que a produziu.
-- System.out.println("one\ntwo\nthree");


5 - O que há de errado com este fragmento?
	for(i = 0; i < 10, i++) {
	  int sum;
	  sum = sum + i;	
	}
-- A variavél de controle está dentro do laço e é zerada a cada iteração, não fazendo a soma esperada pelo laço. Também não é acessível fora de seu escopo.


6 - Explique as diferenças entre a forma prefixada e posfixada do operador de incremento.
-- A forma prefixada itera o elemento na entrada, a posfixada itera o elemento na saida, após o mesmo ser lido, sendo possivel imprimir o valor da iteração apenas no próximo ciclo iteratório..


7 - Mostre como um AND de curto-circuito pode ser usado para impedir um erro de divisão por zero.
-- if ((b != 0) && (val/2)) {}


8 - Em uma expressão, a que tipos são promovidos byte e short?
-- São promovidos a um tipo maior, o int.


9 - Em geral, quando uma coerção é necessária?
-- Quando os tipos são incompativeis e/ou quando há conversão redutora.


10 - Escreva um programa que calcule os numeros primos entre 2 e 100.
-- external-file - Prime


11 - O uso de parenteses afeta o desempenho do programa?
-- Pode afetar a ordem de precedencia em que uma instrução é executada.


12 - Um bloco define um escopo?
-- Sim, seja de um método, controle de fluxo ou classe, fica definida com o uso das chaves.


