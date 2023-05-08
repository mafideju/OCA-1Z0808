class Stack {
    private int[] stack;
    private int putData, getData = 0;
    int top = -1;

    Stack(int size) {
        stack = new int[size];
    }

    void push(int num) {
        if(putData == stack.length) {
            System.out.println(" - Pilha Cheia!");
            return;
        }

        stack[putData++] = num;
    }

    int pop() {
        if(putData == stack.length) {
            System.out.println(" - Pilha ???????!");
            return;
        }

        return stack[putData--];
    }


    int get() {
        if (getData == putData) {
            System.out.println(" - Pilha Vazia...");
            return 0;
        }
        return stack[getData++];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[[ ");
        for (int i = getData; i < putData; i++) {
            sb.append((char) stack[i]);
            if (i < putData - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]]");
        return sb.toString();
    }

    public boolean isEmpty() {
        return top == -1; // Returns true if top is -1 (i.e., stack is empty), false otherwise
    }

    public static void main(String... args) {
        System.out.println("3: O complemento de uma fila é e pilha. Ela usa o acesso primeiro a entrar e último a sair como uma pilha de pratos. O primeiro prato colocado na mesa é o ultimo a ser usado. Crie uma classe de pilha chamada `Stack` que possa conter caracteres. Chame os metodos que acessa a pilha de `push()` e `pop()`. Permita que o usuario especifique o tamanho da pilha quando ela for criada. Mantenha os membros privados.");
        System.out.println("...........");
        Stack stack = new Stack(7);
        stack.push('c');
        stack.push('a');
        stack.push('z');
        stack.push('f');
        stack.push('w');
        stack.push('o');
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Minha Fila - " + stack);

        Stack bookStack = new Stack(30);
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            bookStack.push(ch);
        }
        System.out.println("Pilha Alfa - " + bookStack);

        Stack empty = new Stack(10);
        empty.get();
        System.out.println("Fila Vazia " + empty);
    }
}