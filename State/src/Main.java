import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();


        Scanner scanner = new Scanner(System.in);


        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha o estado (A ou B) ou digite 'sair' para encerrar:");
            String comando = scanner.nextLine();

            switch (comando.toLowerCase()) {
                case "a":
                    contexto.setEstado(new EstadoA());
                    contexto.executar();
                    break;
                case "b":
                    contexto.setEstado(new EstadoB());
                    contexto.executar();
                    break;
                case "sair":
                    sair = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }

        scanner.close();
}
}




