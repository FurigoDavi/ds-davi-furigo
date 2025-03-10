public class TiposVariaveis {
    public static void main(String[] args) {

        //= Tipos de Variavéis
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // Informações dos Estudantes
        String studentName = "Davi Furigo";
        int studentID = 70;
        int studentAge = 16;
        float studentFee = 75.25f;
        char studentGrade = 'A';
        
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);


        // Valor da Variáveis
        int altura = 4;
        int largura = 6;
        int area;

        // Calcular a área do retângulo
        area = altura * largura;

        System.out.println("A altura é: " + altura);
        System.out.println("A largura é: " + largura);
        System.out.println("A area do trangulo é: " + area);

        //Exemplo
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

    }
    
}
