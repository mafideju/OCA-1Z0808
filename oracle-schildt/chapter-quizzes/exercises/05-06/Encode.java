class Encode {
    public static void main(String[] args) {
        System.out.println("6: Expandindo a classe de codificação `Encode`, modifique a para que use uma string de oito caracteres como chave.");

        String message = "This is a Test";
        // String message = "MatchBox20";
        String encodedMessage = "";
        String decodedMessage = "";
        String oldKey = "oitochar";
        int key = oldKey.length();

        System.out.println("Original: " + message);

        for (int i = 0; i < message.length(); i++) {
            encodedMessage = encodedMessage + (char) (message.charAt(i) ^ key);
        }
        System.out.println("Encoded: " + encodedMessage);

        for (int i = 0; i < message.length(); i++) {
            decodedMessage = decodedMessage + (char) (encodedMessage.charAt(i) ^ key);
        }
        System.out.println("Decoded: " + decodedMessage);

    }
}