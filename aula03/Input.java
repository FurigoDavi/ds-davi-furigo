import java.util.Scanner; // import the Scanner class 

class Input {
  public static void main(String[] args) {

    Scanner MeuScan = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = MeuScan.nextLine();   
       
    System.out.println("Username is: " + userName); 
    
    // Exemplo

    Scanner maxScore = new Scanner(System.in);
    Scanner userScore = new Scanner(System.in);
  }
}
