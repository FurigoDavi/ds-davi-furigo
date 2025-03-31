import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);

        int cod;
        String sex;
        int tempTrab;
        float salCasa;
        float bonus;

        System.out.println("Digite seu codigo de funcionario: ");
        cod = sca.nextInt();

        System.out.println("Digite seu Sexo(Masculino e Femenino): ");
        sex = sca.nextLine();

        System.out.println("Digite seu tempo de trabalhor: ");
        tempTrab = sca.nextInt();

        System.out.println("Digite seu salario: ");
        salCasa = sca.nextFloat();

        sca.close();

        if ( sex == ("Masculino") && tempTrab > 15){
            bonus = (salCasa * 20)/100;
        }
        else if ( sex == ("Femenino") && tempTrab > 10){
            bonus = (salCasa * 25)/100;
        }
        else{
            bonus = 100;
        }

        System.out.println("O bonus sera de: R$" + bonus);

    }
}
