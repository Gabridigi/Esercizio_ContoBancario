import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner prendeInput = new Scanner(System.in);
    
    Contobancario c = new Contobancario(10, "Gabriele Di Gennaro", "2030/08/28");
    
    System.out.println(c);
    c.accredita(prendeInput.nextFloat());
    System.out.print("Il conto aggiornato dopo l'accredito è di: ");
    System.out.println(c.getConto());
    
  }
}
