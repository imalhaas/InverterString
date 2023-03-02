public class InverterString {
    public static void main(String[] args) {
        String original = "Lucas"; // string original
        String invertida = ""; // string que receberá a string original invertida

        // percorre a string original de trás para frente
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i); // adiciona cada caractere na string invertida
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
