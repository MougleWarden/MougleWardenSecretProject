package game;

public class World
{
	public static int[][] tileArray = new int[20000][20000]; //This can be used by the Tile class in order to have a grid-like arrangement for the tiles. Example: 1 = grass tile, 2 = rock tile, 3 = bush tile, etc.
	int x=0,y=0;
	public World() //What I have put in this constructor is an array initializer. x = world width, y = world height
	{
		while(y<2000)
		{
			while(x<2000)
			{
				tileArray[x][y] = 1;
				System.out.print(x+" ");
				System.out.print(y+" ");
				System.out.println(tileArray[x][y]); //These strings are so that you can see the initialization of tileArray.
				x++;
			}
			x=0;
			y++;
		}
	}
}