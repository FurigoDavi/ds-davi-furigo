public class TesteConversao {
    public static void main(String[] args) {

        //Pars(Conversão de variáveis)
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        // Exemplo
        int maxScore = 500;

        // The actual score of the user
        int userScore = 250;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the result
        System.out.println("User's percentage is " + percentage + "%");

        // Minha Versão
        float MinhaDivida = 5000000f;
        float Emprestimo = 604450f;

        int RestoPagar =(int) (MinhaDivida - Emprestimo);

        System.out.println("O resto da sua dívida a pagar é: R$" + RestoPagar);


    }
}