package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.setSpeed(10);
	rob.penDown();
	rob.hide();
	rob.setX(0);
	rob.setY(550);
	 rob.setPenColor(Color.BLACK);
	 house();
	rob.setPenColor(Color.GREEN);
	rob.move(100);
	for (int i = 0; i < 1; i++) {
		rob.turn(270);
		 rob.setPenColor(Color.BLACK);
		 house();
		rob.setPenColor(Color.GREEN);
		rob.move(100);
	 }
	
	
	

}
static void house(){
	rob.move(300);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(300);
	rob.turn(270);
}

	
}


