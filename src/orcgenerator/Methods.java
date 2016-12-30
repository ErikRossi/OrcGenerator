package orcgenerator;

import javax.swing.*;

public class Methods {
    public static int quantityOfOrcs() {
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many Orcs do you want to create?"));
        return quantity;
    }
    public static Orc[] createOrcs(Orc[] o) {
        for (int i = 0; i < o.length; i++) {
            o[i] = new Orc();
        }
        return o;
    }
    
    public static void callPrintOut(Orc[] o) {
        for (int i = 0; i < o.length; i++) {
           o[i].printOut();
        }
    }
}
