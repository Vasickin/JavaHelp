package help;

public class Help {

    public static void main(String[] args)
            throws java.io.IOException {


        char choice;

        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Выбирите: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1' -> {
                System.out.println("Инструкция if:\n");
                System.out.println("if (условие) {");
                System.out.println("  инструкция;");
                System.out.println("}");
                System.out.println("else {");
                System.out.println("  инструкция;");
                System.out.println("}");
            }
            case '2'-> {
                System.out.println("Инструкция switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println("  case константа -> {");
                System.out.println("    последовательность инструкций;");
                System.out.println("  }");
                System.out.println("  default -> {");
                System.out.println("  последовательность инструкций;");
                System.out.println("  }");
                System.out.println("}");
            }
            default -> {
                System.out.println("Запрос не найден!");
            }

        }
    }
}
