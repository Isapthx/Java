import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int confirma;
        
        System.out.println("0 - Sim \n1 - Não \nDeseja acessar sua conta? ");
        confirma = ler.nextInt();
        
        while(confirma != '1') {
            System.out.println("INFORMAÇÕES DA SUA CONTA");
            System.out.println("Saldo: " + Conta);

            System.out.println("0 - Sim \n1 - Não \nDeseja acessar sua conta? ");
            confirma = ler.nextInt();
        }
    }
}
