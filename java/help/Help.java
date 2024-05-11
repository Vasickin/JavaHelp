package help;

public class Help {
    public static void main(String[] args)
        throws java.io.IOException{

        char choice;

        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Выбирите: ");
        choice = (char) System.in.read();

        System.err.println("\n");

        switch (choice) {
            case '1' -> {
            System.out.println("Инструкция if:");
            System.out.println("if (условие) {");
            System.out.println("  инструкция;");
            System.out.println("}");
            System.out.println("else {");
            System.out.println("  инструкция;");
            System.out.println("}");
            }
            default -> {
            }
            
        }
    }
}

