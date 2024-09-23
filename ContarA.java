public class ContarA {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int quantidade = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                quantidade++;
            }
        }

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es).");
        } else {
            System.out.println("A letra 'a' não está presente na string.");
        }

        scanner.close(); 
    }
}