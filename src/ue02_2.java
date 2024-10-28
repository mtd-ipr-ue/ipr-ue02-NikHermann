import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        
        Out.print("Gib die Jahreszahl ein: ");
        int j = In.readInt();
        
        Out.print("Gib einen Monatswert an (1 für Jan; 12 für Dez): ");
        int m = In.readInt();

        
        
        switch(m) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Der Monat hat 31 Tage.");
                break;
            case 4, 6, 9, 11:
                System.out.println("Der Monat hat 30 Tage.");
                break;
            case 2:
                if(j % 4 == 0) {
                    if(j % 100 == 0) {
                        if(j % 400 == 0) {
                            System.out.println("Der Monat hat 29 Tage.");
                        }
                        else {
                            System.out.println("Der Monat hat 28 Tage.");
                        }
                    }
                    else {
                        System.out.println("Der Monat hat 29 Tage.");
                    }
                }
                else {
                    System.out.println("Der Monat hat 28 Tage.");
                }
                break;
        }

        }
    }

