import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        
        Out.print("Gib die x-Koordinate ein: ");
        double x = In.readDouble();
        Out.print("Gib die y-Koordinate ein: ");
        double y = In.readDouble();


        /*
        ------Original-Version------
        
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));  //Abstand des Punktes vom Ursprung

        boolean inSquare = ((x >= 0 && x <= 4) && (y >= 0 && y <= 4));  //liegt Punkt innerhalb von Rechteck?

        boolean outCircle = (d > 4);    //liegt Punkt außerhalb von Kreis

        if(inSquare && outCircle) {         //wenn beide Bedingungen true sind
            System.out.println("Punkt liegt auf grüner Fläche!");
        }
        else {
            System.out.println("Punkt liegt nicht auf grüner Fläche!");
        }
            */

        
        /*
        ------Version in einer Zeile------
        */
                        
        //Abstand des Punktes vom Ursprung: Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
        //liegt Punkt innerhalb von Rechteck? ((x >= 0 && x <= 4) && (y >= 0 && y <= 4))
        //liegt Punkt außerhalb von Kreis: (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) > 4)
        // der Gesamtausdruck überprüft ob der Punkt innerhalb des Rechtecks aber außerhalb des Kreises und somit in der gruenen Flaeche liegt
        if(((x >= 0 && x <= 4) && (y >= 0 && y <= 4)) && (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) > 4)) {         
            //wenn beide Bedingungen true sind, dann in der gruenen Flaeche
            System.out.println("Punkt liegt auf grüner Fläche!");
        }
        else {
            // liegt ausserhalb der gruenen Flaeche
            System.out.println("Punkt liegt nicht auf grüner Fläche!");
        }
    }
}
