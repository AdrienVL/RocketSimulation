import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    

    public ArrayList<Item> loadItems(File phase) throws FileNotFoundException{

      Scanner items = new Scanner(phase);
      while (items.hasNextLine()) {
        String data = items.nextLine();
        String[] arrayOfItem = data.split(data, '=');
        int kilos = Integer.parseInt(arrayOfItem[1]);
        Item item = new Item(arrayOfItem[0],kilos);
        System.out.println(data);
      }
      items.close();
        return null;


    }
    
    
}
