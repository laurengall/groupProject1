import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean cont = true;
    String command;
    System.out.println("Welcome to Dan's calc and stuff or whatever! \nInput a command:\n1. Walls\n2. Floors\n3. Help\n4. Calculator\n5. Quit");
    while(cont){
      command = input.nextLine();  
      if (command.equalsIgnoreCase("1")){
        System.out.println("Input the number of walls:");
        int numWalls = input.nextInt(); 
        totalWallArea(numWalls);
      }else if (command.equalsIgnoreCase("2")){
        System.out.println("How many Rectangles does your floorplan break into:");
          int recNum = input.nextInt(); 
          squareFloorFootage(recNum); 
      } else if (command.equalsIgnoreCase("3") || command.equalsIgnoreCase("help")) {
        mandate();
      } else if(command.equalsIgnoreCase("4") || command.equalsIgnoreCase("calculate")){
        System.out.println("What operation would you like to perform? \n1. Add\n2. Sub\n3. Mult\n4. Div");
        command = input.nextLine();
        System.out.println("Input first number");
        int a = input.nextInt();
        System.out.println("Input second number");
        int b = input.nextInt();
        if(command.equalsIgnoreCase("1") || command.equalsIgnoreCase("add")){
          System.out.println(add(a,b));
        } else if(command.equalsIgnoreCase("2") || command.equalsIgnoreCase("sub")){
          System.out.println(sub(a, b));
        } else if(command.equalsIgnoreCase("3") || command.equalsIgnoreCase("mult")){
          System.out.println(mult(a, b));
        }
        else if(command.equalsIgnoreCase("4") || command.equalsIgnoreCase("div")){
          System.out.println(div(a, b));
        }
      } else if (command.equalsIgnoreCase("5") || command.equalsIgnoreCase("quit")){
        cont = false;
        System.out.println("This code is so awesome; we should get extra credit! Bye!");    
      } 
      else {
        System.out.println("Not a valid command, please try again");
      }
   }  
  }
  
   
  /* Operations Methods: 2 double parameters for each calculator method and return one double for each. Create calculation methods for adding, subtracting, multiplying, and dividing. i.e., useless methods the other group wanted us to make.*/
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
    if(b == 0){
      System.out.println("Cannot divide by 0");
      return -1;
    }
    return a / b;
  }
  /* Square Floor Footage Method: Take int of how many rectangles make up the room, then prompt the user for length and width for however many sections the user gives. Does not work for circular rooms and assumes shapes are right-angled shapes. */ 
  public static void squareFloorFootage(int recNum){
    Scanner scan = new Scanner(System.in);
    double areaRec = 0.0; 
    double areaTotal = 0.0; 
    for(int i = 1; i < recNum + 1; i++){
      System.out.println("Input length of Rectangle #"+ i);
      double l = scan.nextDouble();
      
      System.out.println("Input width of Rectangle #"+ i);
      double w = scan.nextDouble();
      areaRec = l * w; 
      areaTotal += areaRec; 
    }
    System.out.println("The square footage of the given room is " + areaTotal + " square feet."); 
  } 
  public static void totalWallArea(int wallNum){
    Scanner input = new Scanner(System.in);
    double area = 0.0; 
    double areaWall = 0.0; 
    for(int i = 1; i < wallNum +1; i++){
      System.out.println("Input length of Wall #" + i);
      double l = input.nextDouble();
      System.out.println("Input width of Wall #" + i);
      double w = input.nextDouble();
      areaWall = l * w;
      area += areaWall; 
    }
    System.out.println("The wall area in the given room is " + area + " square feet."); 
}
  /* Mandate: For all user prompts, print out what the method does and explain what the inputs are that it requires for the user. Ask for each value separately in different lines, so that the user only gives one value at a time so as to not confuse our delicate users. Make sure to include an output for unwanted outputs. */ 
  public static void mandate(){
    System.out.println(); 
      System.out.println("Add: The add method adds two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("Sub: The sub method subtracts two ints. This method requires two ints from the user."); System.out.println();     
    System.out.println("Mult: The mult method multiplies two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("Div: The div method divides two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("Square Footage: The square footage methods takes an int of how many rectangles a room can be divided into. Then, for each rectangle, it takes the length and width of that rectangle, and repeats for each rectangle. The total square footage is printed at the end."); 
    System.out.println(); 
    System.out.println("Wall Area: The total wall area method takes an int of the number of walls and asks for the length and width of each wall. This method prints the total wall area."); 
    System.out.println(); 
    }
  
}