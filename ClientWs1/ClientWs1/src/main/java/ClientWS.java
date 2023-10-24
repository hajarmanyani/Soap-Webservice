import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.Arrays;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println("Conversion result: " + stub.concert(7600));

        Compte c = stub.getCompte(3);
        System.out.println(c.getCode());
        System.out.println(c.getSolde());
    }
}
