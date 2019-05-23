import java.io.FileNotFoundException;

public class Game {

	public static void main(String[] args) 
	{
		try {
			Map map = new Map();
			map.showMap();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
