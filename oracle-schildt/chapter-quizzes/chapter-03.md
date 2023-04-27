1 - Escreva um programa que leia caracteres do teclado até um ponto ser recebido. Faça o contar o numero de espaços. Relate o total no fim do programa.
-- exercises 3-1

2 - Mostre a forma geral da escada if-else-if.
-- 
	if (condition) { 
		return statement; 
	} else if (secondCondition) { 
		return statement; 
	} else { 
		return statement; 
	}

3 - Dado o código
	if (x < 10) {
		if (x > 100) {
			if (!done) {
				x = z;
			} else {
				y = z;
			}
		}
	} else {
		System.out.println("error");
	}
A que if o ultimo else está associado?
-- Ao primeiro.

4 - Mostre a instrução for de um laço que conte de 1000 a 0 em intervalos de -2.
-- exercises 3-4

5 - O fragmento a seguir é valido?
for (int i = 0; i < num; i++) {
    sum += i;
}
count = i;
-- Não. A variável i é usada como controle dentro do laço e não está disponível fora do escopo.]

6 - Explique o que break faz. Certifique-se de explicar suas duas formas.

7 - No fragmento a seguir, após a instrução break ser executada, o que é exibido?
for(iterations) {
    while(running) {
	if (x=x) { break; }
    }
  System.out.println("After while");
}
System.out.println("After for");
-- After white, After for.

8 - O que o fragmento abaixo exibe?
for (int i = 0; i < 10; i++) {
    System.out.print(i + " ");
    if ((i % 2) == 0) continue;
    System.out.println();
}
-- Uma linha com 0 1 e quebra; 2 3 e quebra; assim até 8 9.

9 - Nem sempre a expressão de iteração de um laço for necessita alterar a variável de controle de laço segundo um valor fixo. 
Em vez disso, a variável de controle pode mudar de alguma maneira arbitrária. Usando esse conceito, escreva um programa que use
um laço for para gerar a progressão 1, 2, 4, 8, 16, 32, 64 e assim por diante. 
-- exercises 3-9

10 - 
