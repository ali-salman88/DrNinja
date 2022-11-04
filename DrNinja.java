package DrNinja;
import robocode.*;
import robocode.util.*;
import java.util.*;
import java.awt.Color;
import java.awt.geom.Point2D;
import robocode.ScannedRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;

//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * DrNinja - a robot by (your name here)
 */
public class DrNinja extends Robot
{

	/**
	 * run: DrNinja's default behavior
	 */


	public void run() {
				scan();
				fire(1);
				setBodyColor(new Color(0, 0, 0));
				setGunColor(new Color(0, 0, 0));
				setRadarColor(new Color(0, 0, 0));
				setScanColor(Color.blue);
				setBulletColor(Color.black);
				turnGunLeft(360);
						fire(1);

		
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			fire(1);
			ahead(100);
			turnGunLeft(360);
			scan();
			back(100);
			turnGunRight(360);
			turnRight(110);
			turnGunLeft(360);
			fire(1);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {

		fire(1);
		ahead(250);
		scan();
		fire(1);
		back(250);
		scan();
		fire(1);
		ahead(250);
		if (e.getDistance ()<150){
			fire (4);
		}else{
			fire(2);
		}

		back(70);
		turnRight(20);
		ahead(250);
		turnLeft(90);
		ahead (150);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(100);
		turnLeft(90);
	
		fire(1);
		ahead(290);
				turnRight(190);
		turnGunLeft(360);
		fire(1);

		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		
		back(850);
		turnRight(500);
		fire(1);
		ahead (3);
		fire(1);
		turnRight(50);
	}	
	public void onHitRobot(HitRobotEvent hre) {
		back(550);
		turnRadarLeft(360);
		fire(1);
		turnGunLeft(360);
		fire(1);
		turnRight(50);
		ahead (300);
		
       if (hre.getBearing() > -90 && hre.getBearing() <= 90) {
           back(8);
		   ahead(8);
		   fire(3);
		   back(100);
       } else {
           ahead(100);
       }
   
   }
  
}
