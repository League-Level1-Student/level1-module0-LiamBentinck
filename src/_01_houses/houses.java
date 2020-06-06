package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot("mini");

	public static void main(String[] args) {
		rob.setSpeed(10);
		rob.penDown();
	//	rob.hide();
		rob.setX(100);
		rob.setY(550);
		rob.setPenColor(Color.BLACK); 
		String input = JOptionPane.showInputDialog("How many buildings do you want to create?");
		int numberOfBuildings = Integer.parseInt(input);
//		house();
		
		//rob.move(100);
		Random rand = new Random();
		for (int i = 0; i < numberOfBuildings; i++) {
			rob.setRandomPenColor();
			int buildingOptions = rand.nextInt(3);
			chooseBuilding(buildingOptions);
//			rob.turn(270);
//			rob.setPenColor(Color.BLACK);
//			house();
			rob.setPenColor(Color.GREEN);
			rob.move(10);
			rob.turn(-90);
		}

	}

static void house(){
	Random r =new Random();
	int roofOption =r.nextInt(2);
	rob.move(60);
	if(roofOption ==0 ) {
		flatRoof();
	}
	else {
		pointyRoof();
	}
	rob.move(60);
	rob.turn(270);
}
static void house2() {
	rob.move(120);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(120);
	rob.turn(270);
}
static void house3() {
	rob.move(250);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(250);
	rob.turn(270);
}
static void flatRoof() {
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
}
static void pointyRoof() {
	rob.turn(45);
	rob.move(15);
	rob.turn(90);
	rob.move(15);
	rob.turn(45);
}
static void chooseBuilding(int option) {
	if(option==0) {
	house();
	}
	else if(option==1){
		house2();
	}
	else{
		house3();
	}
}
}
