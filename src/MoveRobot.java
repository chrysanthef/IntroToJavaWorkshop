import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot robo = new Robot("mini");
	robo.move(100);
	robo.turn(90);
	robo.move(100);
	robo.setSpeed(10);
	robo.setX(100);
	robo.setY(100);
	robo.move(300);
	robo.setPenColor(26, 86, 12);
	robo.penDown();
	robo.move(100);
	robo.turn(90);
	robo.move(100);
	robo.turn(90);
	robo.move(100);
	robo.turn(90);
	robo.move(100);
	robo.turn(90);
	robo.penUp();
	robo.moveTo(500, 500);
	robo.penDown();
	robo.setRandomPenColor();
	robo.move(200);
	robo.turn(60);
	robo.setRandomPenColor();
	robo.move(200);
	robo.turn(60);
	robo.setRandomPenColor();
	robo.move(200);

}
}
