import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        int d;
        System.out.print("Gib eine Zahl ein: ");
        int a = In.readInt();
        d = a;
        System.out.print("Gib noch eine Zahl ein: ");
        int b = In.readInt();
        if(b > d) {
            d = b;
        }
        System.out.print("Gib noch eine Zahl ein: ");
        int c = In.readInt();
        if(c > d) {
            d = c;
        }

        Out.println("Die größte Zahl ist: " + d);

        

    }
}
