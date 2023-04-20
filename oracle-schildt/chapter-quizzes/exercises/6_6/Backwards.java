class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1) backward(idx + 1);
        System.out.print(str.charAt(idx));
    }

    public static void main(String[] args) {
        Backwards reverse = new Backwards("Teste de String");
        reverse.backward(0);
    }
}
