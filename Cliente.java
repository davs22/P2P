package P2P;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[]args){
       try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Digite sua porta: ");
        int minhaPorta = Integer.parseInt(scanner.nextLine());

        Thread threadServer = new Thread(new Serveropener(minhaPorta));
        threadServer.start();
        System.out.println("Servidor iniciado na porta " + minhaPorta);
        
       }
    }
}
