import java.util.Scanner;
//////
// Hej, jag ber om ursäkt jag började arbeta för sent med denna uppgift och han
// inte klart i tid för inlämningen. Jag kommer att kolla igenom inspelningen av
// lektionen igen och se till att detta inte händer framöver för kommande inlämningar.
//
// Detta är det jag han med innan klockan blev 12.
//////

public class Main {
    public static void main(String[] args) {
        Scanner USERNAME = new Scanner(System.in);
        System.out.println("Vad heter du?: ");
        System.out.println("Du heter: " + USERNAME.next());
    }   {
        Scanner NUMMER = new Scanner(System.in);

        System.out.println("Snälla skriv ett nummer: ");

            int x = NUMMER.nextInt();

            for (int i = 1; i <= x; i++) {
                System.out.println("loop" + i);
            }

            NUMMER.close();
        }
    }
