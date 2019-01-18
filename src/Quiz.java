import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hallo! Wie lautet dein Name? ");
        String name = scanner.nextLine();

        System.out.print("Bist du bereit für ein paar Fragen, die dein Allgemeinwissen testen, " + name + "? ");
        String antwort = scanner.nextLine();

        if(antwort.equals("nein")) { // TODO: Nein checken?
            System.exit(0); // Programm beenden
        }
        // TODO: Was passiert, wenn etwas anderes als ja oder nein eingegeben wird?

        while(true) {
            System.out.println("OK - es geht los!");

            System.out.print("1. Frage: Wie lautet die Hauptstadt von Lettland? ");
            String antwort1 = scanner.nextLine();

            System.out.print("2. Frage: In welchem Jahr hat Kolumbus Amerika entdeckt? ");
            String antwort2 = scanner.nextLine();

            System.out.print("3. Frage: Wer hat James Bond im Film Goldfinger gespielt? ");
            String antwort3 = scanner.nextLine();

            if ("Riga".equals(antwort1) && "1492".equals(antwort2) && "Sean Connery".equals(antwort3)) {
                System.out.println("Super, Antworten waren richtig!");
                System.exit(0);
            }

            int count = 0;
            if (!"Riga".equals(antwort1)) {
                count++;
            }
            if (!"1492".equals(antwort2)) {
                count++;
            }
            if (!"Sean Connery".equals(antwort3)) {
                count++;
            }

            System.out.println("Du hast " + count + " von 3 Fragen falsch beantwortet.");

            System.out.println("Willst du es nochmal versuchen?");
            String nochmal = scanner.nextLine();

            if (nochmal.equals("nein")) {
                System.exit(0);
            }
        }

    }
}
