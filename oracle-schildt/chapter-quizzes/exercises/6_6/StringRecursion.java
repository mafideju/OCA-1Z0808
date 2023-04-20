class StringRecursion {
    String str;

    StringRecursion(String str) { this.str = str; }

    void reverter(int index) {
        if (index != str.length() - 1) reverter(index + 1);
        if (index == str.length() - 1) System.out.println();
        System.out.print(str.charAt(index));
    }

    public static void main(String[] args) {
        System.out.println("6: Crie um método recursivo que exiba o conteudo de uma string de tras pra frente.");

        StringRecursion stringRecursion = new StringRecursion("Teste de String");
        StringRecursion newStringRecursion = new StringRecursion("socorram me subi no onibus em marrocos");
        stringRecursion.reverter(0);
        newStringRecursion.reverter(0);
        System.out.println();
    }
}