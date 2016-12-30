package orcgenerator;

public class OrcGenerator {

    public static void main(String[] args) {
        Orc[] orcs = new Orc[Methods.quantityOfOrcs()];
        orcs = Methods.createOrcs(orcs);
        Methods.callPrintOut(orcs);
    }
}
