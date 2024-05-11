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
            case '1':
                System.err.println("Инструкция if:\n");
                System.err.println("if(условие) {");
                System.err.println("  инструкция;");
                System.err.println("}");
                System.err.println("else {");
                System.err.println("  инструкция;");
                System.err.println("}");
                break;
            default:
                throw new AssertionError();
        }
    }
}

