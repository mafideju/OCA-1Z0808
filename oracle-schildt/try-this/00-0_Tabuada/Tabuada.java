class Tabuada {
    public static void main(String[] args) {
        for(int i = 2; i <= 10; i++) {
            for(int j = 2; j <= 10; j++) {
                System.out.print(i + " X " + j + " = " + (i * j) + " | ");
                if (j == 10) System.out.println();
            }
        }
    }
}