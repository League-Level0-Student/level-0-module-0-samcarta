package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
Robot rob = new Robot ();
rob.penDown();
rob.setSpeed(100);
rob.setWindowColor (Color.black);
rob.setWindowSize(800 , 800);
int count = 0;
while(count < 1) {
rob.turn(360/8);	
rob.move(64);
rob.turn(-40);
rob.move(flameSize);
rob.turn(170);
rob.move(flameSize);
rob.setPenColor(Color.red);
rob.turn(64);
rob.move(baseSize);


}
		

			
			  
			   // TURN RIGHT     Turn the robot 64 degrees to the right
			
				// MOVE         Move the robot the distance in the variable baseSize
		
				//  INCREASE COUNT. Increase the count by 1
		
		//  End the while loop here
		
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.

		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}
}
