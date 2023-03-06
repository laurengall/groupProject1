import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  
  }
  public static double add(double a, double b){
    return a + b;
  } 
  public static double sub(double a, double b){
    return a - b;
  }
  public static double mult(double a, double b){
    return a * b;
  }
  public static double div(double a, double b){
    return a / b;
  }
  public static void squareFloorFootage(int recNum){
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < recNum; i++){
      System.out.println("Input length of rectangle "+ i);
      scan.nextDouble();
      System.out.println("Input width of rectangle "+ i);
      scan.nextDouble();
    }
  }
  /* What I assume they meant
  public static double squareFloorFootage(int recNum){
    Scanner scan = new Scanner(System.in);
    int totalFootage = 0;
    for(int i = 0; i < recNum; i++){
      System.out.println("Input length of rectangle "+i);
      double l = scan.nextDouble();
      System.out.println("Input width of rectangle "+i);
      double w = scan.nextDouble();
      totalFootage += (l*w);
    }
    return totalFootage;    
  }*/
  public static double totalWallArea(int wallNum){
    Scanner input = new Scanner(System.in);
    double area = 0.0; 
    for(int i = 0; i < wallNum; i++){
      System.out.println("Gib me length");
      double l = input.nextDouble();
      System.out.println("Gib me width");
      double w = input.nextDouble();
      area += l * w;
    }
    return area;
}
  public static void mandate(){
      System.out.println("The add method adds two ints. This method requires two ints from the user."); 
    System.out.println("The sub method subtracts two ints. This method requires two ints from the user.");     
    System.out.println("The mult method multiplies two ints. This method requires two ints from the user."); System.out.println("The div method divides two ints. This method requires two ints from the user."); 
    }
}