import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	static Flower flower;
	static Location location;
	
	public static void main(String[] args) {
		Random rand = new Random();
		int randX = rand.nextInt(9);
		int randY = rand.nextInt(9);
		Color purpl = new Color(136, 85, 153);
		Color blue = new Color(0, 153, 153);
		Color yellow = new Color(238, 221, 68);
		Color white = new Color(250, 250, 255);
		Color red = new Color(255, 0, 0);
		
		World world = new World();
		Location arbitrary = new Location(randX, randY);
		
		world.show();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				location = new Location(i, j);
				if (i % 3 == 0) {
					flower = new Flower(red);
					world.add(location, flower);
				} else {
					if (i % 3 == 1) {
						flower = new Flower(white);
						world.add(location, flower);
					} else {
						flower = new Flower(blue);
						world.add(location, flower);
					}
				}
			}
		}
	}
}
	