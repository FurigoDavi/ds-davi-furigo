import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        //variaveis
        String nomeFunc;
        float horas;
        float porHora;
        int filho;
        int idade;
        float tempServico;
        float salFamilia;
        double adic;
        double ir = 0;

        System.out.println("Insira o nome do funcionario: ");
        nomeFunc = leia.nextLine();

        System.out.println("Insira o numero de horas trabalhadas(por mes): ");
        horas = leia.nextFloat();

        System.out.println("Insira o valor pago por hora: ");
        porHora = leia.nextFloat();

        System.out.println("Insira a quantia de filhos com idade abaixo de 14 anos: ");
        filho = leia.nextInt();

        System.out.println("Insira a idade do funcionario: ");
        idade = leia.nextInt();

        System.out.println("Insira o tempo de servico do funcionario: ");
        tempServico = leia.nextFloat();

        System.out.println("Valor do salario familia por filho: ");
        salFamilia = leia.nextFloat();

         //contas
        float salarioBruto = (porHora * horas) ;
        double desconto = (salarioBruto * 8.5) / 100;
        float salarioFamilia = salarioBruto + (salFamilia * filho);

        leia.close();

        if (salarioBruto > 1.500){
            ir = (salarioBruto * 15) / 100;
        }
        else if (salarioBruto > 500 && salarioBruto < 1500){
            ir = (salarioBruto * 8) / 100;
        }
        else if (salarioBruto <= 500 ){
            ir = 0;
        }
        
        if (idade > 40){
            adic = (salarioBruto * 2)/100;
        }
        else if (tempServico > 15){
            adic = (salarioBruto * 3.5)/100;
        }
        else if (tempServico <= 15 && tempServico > 5 && idade > 30){
            adic = (salarioBruto * 1.5)/100;
        }
        else{
            adic = 0;
        }
        
        double salarioLiquido = salarioBruto + adic - ir - desconto; 

        System.out.println("Nome do funcionario: " + nomeFunc);
        System.out.println("Salario bruto: R$" + salarioBruto);
        System.out.println("Seus descontos foram: R$" + ir);
        System.out.println("Seus adicionais foram: R$" + adic);
        System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}
