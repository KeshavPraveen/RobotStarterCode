import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import kareltherobot.*;


// Your goal is to create a robot who can make a diamond with 5 beepers on each side.
public class Main implements Directions{
  
  public static void main(String[] args){
    // Uncomment Comment lines 13-16 if you are doing the challenge
    
    // Scanner in = new Scanner(System.in); // Creating an object of Scanner data type
    
    // System.out.println("How many beepers do you want on each side of the diamond?");
    // int beepers = in.nextInt();
    // initialize beepers to the value of what the user types
    
    Robot Fred = new Robot(5, 1, East, 100);


    World.setSize(10,10);  
    World.setVisible(true);
    World.setDelay(10);

   for(int i = 0; i < 5; i++) {
    Fred.move();
    Fred.turnLeft();
    Fred.move
   }  
  
   
  }
static void turnRight(Robot Fred) {
  Fred.turnLeft();
  Fred.turnLeft();
  Fred.turnLeft();
}

static void turnAround(Robot Fred) {
  Fred.turnLeft();
  Fred.turnLeft();
}  

 }
   
 