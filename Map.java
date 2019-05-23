import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Map 
{
	private Tile[][] map = new Tile[50][50];
	private ArrayList<Integer> mapId = new ArrayList<Integer>();
	File file = new File("map.txt");
	
	public Map() throws IOException
	{
		int temp = 0;
		FileInputStream inputStream = new FileInputStream(file);
	    while (inputStream.available() > 0) 
	    {
	    	temp  = inputStream.read();
	    	mapId.add(temp);
	    }
	    inputStream.close();
	    create(mapId);
	}
	
	public void showMap()
	{
		for(int r = 0; r < map.length; r++)
		{
			for(int c = 0; c < map[0].length; c++)
			{
				System.out.print(map[r][c].getTileId());
			}
			System.out.println();
		}
	}
	
	public void create(ArrayList<Integer> arr)
	{
		int n = 0;
		for(int r = 0; r < map.length; r++)
		{	for(int c = 0; c < map[0].length; c++)
			{
				map[r][c] = new gameTile(arr.get(n), arr.get(n) == 1);
				n++;
			}
		}
	}
}
