class StringSorter {
    public static <T extends Comparable<T>> void printArray(T[] array) {
        java.util.Arrays.sort(array);
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String... args) {
        System.out.println("4: Altere a classificação da seção 5.1 do Try This e classifique um array de strings.");

        String[] phrases = { "0 - Down", "Pleased to meet you", "Nice to know me", "Whats the message", "Will you show me", "I\'ve been waiting", "A long time now", "So here is hte answer." };

        for(int i = 0; i < phrases.length; i++) {
            for (int j = phrases.length - 1; j > i; j--) {
                if ((phrases[j-1]).compareTo(phrases[j]) > 0) {
                    String tripa = phrases[j-1];
                    phrases[j-1] = phrases[j];
                    phrases[j] = tripa;
                }
            }
        }

        printArray(phrases);
    }
}

