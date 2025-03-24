import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);

        int cod;
        String nomFunc;
        int tempTrab;
        float salCasa;

        System.out.println("Digite seu codigo de funcionario: ");
        cod = sca.nextInt();

        System.out.println("Digite seu Sexo(Masculino e Femenino): ");
        nomFunc = sca.nextLine();

        System.out.println("Digite seu tempo de trabalhor: ");
        tempTrab = sca.nextInt();

        System.out.println("Digite seu salario: ");
        salCasa = sca.nextFloat();

        sca.close();

    }
}
