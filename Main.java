import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {

    
    int lim;
    Scanner in = new Scanner(System.in);
    System.out.println("introduce el limite");
    lim = in.nextInt();

    for(int k=1;k<=lim;k++)
    {

    if(  k%2!=0&& k%3!=0  && k%4!=0 && k%5!=0 && k%7!=0 && k%11!=0)
      {
        System.out.println(k);
      }
      
    }

      System.out.println(k);
    

    
  
  }

  
}