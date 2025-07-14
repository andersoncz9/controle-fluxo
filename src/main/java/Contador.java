import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
    boolean entradaValida = false;
    var scanner =  new Scanner(System.in);
    do {
    System.out.println("Digite dois números, o seundo número deve ser maior que o primeiro.");
    System.out.print("Digite o primeiro número: ");
    int parametroUm = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int parametroDois =  scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
            entradaValida = true;
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }while(!entradaValida);
        scanner.close();
    }

static void contar(int parametroum, int parametrodois) throws ParametroInvalidosException{
    if (parametroum >= parametrodois) {
        throw new ParametroInvalidosException("O segundo número deve ser maior que o primeiro!");
    }

    int numeroContador = parametrodois - parametroum;
        for(int i = 1; i <= numeroContador; i++){
            System.out.println("Imprimindo número " + i);
    }
}

}
