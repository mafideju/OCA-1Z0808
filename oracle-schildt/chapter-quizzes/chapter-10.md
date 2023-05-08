## ***1: Porque Java define tanto fluxo de caracteres como fluxo de bytes?***
### `Bytes são o fluxo básico de entrada e saída. O fluxo de caracteres (Unicode) implementa um fluxo de bytes para facilitação do uso de caracteres em Java. O fluxo de caracteres facilita a vida do programador, enquanto o fluxo de bytes é mais robusto.`


---
## ***2: Já que a entrada e a saída do console são baseadas em texto, porque Java ainda usa fluxo de byte para este fim?***
### `Porque a máquina só entende dados binários. System (in, out, err) são antigos, antes do fluxo de chars.`


---
## ***3: Mostre como abrir um arquivo para leitura de bytes.***
### `InputStream stream = new FileInputStream("filename.txt");`


---
## ***4: Mostre como abrir um arquivo para leitura de caracteres.***
### `Reader reader = new FileReader("filename.txt");`


---
## ***5: Mostre como abrir um arquivo IO para acesso aleatório.***
### `RandomAccessFile randomReader = new RandomAccessFile("filename.txt", "rw");`


---
## ***6: Como podemos converter um string numérico "123.23" para um equivalente binário.***
### `String num = "123.23";`
### `Double conv = Double.parseDouble(num);`
### `return conv;;`


---
## ***7: Escreva um programa que copie um arquivo de texto. No processo, faça o converter todos os espaçoes em hifens. Use as classes de fluxo de bytes em arquivo. Use a abordagem tradicional para fechar o arquivo chamando close() explicitamente.***
### ``


---
## ***8: Reescreva o programa anterior para fluxos de caracteres. Use try-with-resources para fechar automaticamente o arquivo.***
### ``


---
## ***9: Que tipo de fluxo é System.in?***
### `Fluxo de entrada de bytes(Input Stream)`


---
## ***10: O que o método read() de InputStream retorna quando o fim do fluxo é alcançado?***
### `-1`


---
## ***11: Que tipo de fluxo é usado na leitura de dados binários?***
### `Fluxo de bytes - DataInputStream`


---
## ***12: Reader e Writer estão no topo da hierarqioa de classes _________***
### `do fluxo de caracteres`


---
## ***13: A instrução try-with-resources é usada para _______ _______.***
### `Fechar recursos automaticamente`


---
## ***14: Quando usamos um método tradicional de fechamento de arquivos, geralmente fechar um arquivo dentro de um bloco finally é uma boa abordagem. V ou F?***
### `Verdadeiro`