
public class Main {
   public static void main(String[] args)
   {

     double Balance =5000;
     double InterestRate =0.17;
     double Interest1 =0;
     double Interest2 =0;

      Interest1 =  Balance * InterestRate;

      Interest2 = Balance *( InterestRate+InterestRate);

      System.out.println("Month1 Balance is " + Interest1);
      System.out.println("Month2 Balance is " + Interest2);



 }
}