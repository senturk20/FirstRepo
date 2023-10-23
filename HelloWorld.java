public class HelloWorld {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a language choice as a command-line argument (e.g., 1 for English, 2 for Spanish).");
            return;
        }

        int choice = Integer.parseInt(args[0]);

        String greeting = "";

        if (choice == 1) {
            greeting = "Hello, World!";
        } else if (choice == 2) {
            greeting = "¡Hola, Mundo!";
        } else if (choice == 3) {
            greeting = "Bonjour, le Monde!";
        } else {
            System.out.println("Invalid choice. Defaulting to English.");
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}
