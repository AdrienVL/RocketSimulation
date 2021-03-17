import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    

    public ArrayList<Item> loadItems(File phase) throws FileNotFoundException{

      Scanner items = new Scanner(phase);
      ArrayList<Item> listItems = new ArrayList<Item>();
      while (items.hasNextLine()) {
        String data = items.nextLine();
        String[] arrayOfItem = data.split(data, '=');
        int kilos = Integer.parseInt(arrayOfItem[1]);
        // Item item = new Item(arrayOfItem[0],kilos);
        Item item = new Item();
        item.setItem(arrayOfItem[0], kilos);
        listItems.add(item);
        
      }
      items.close();
        return listItems;

    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> listItems){
        int rocketWeight = 10;
        int totalWeight = 10;
        int currentWeight = 10;

        ArrayList<Rocket> listRockets = new ArrayList<Rocket>();
        Rocket rocket = new Rocket(rocketWeight, totalWeight, currentWeight);



        for(int i = 0; i < listItem.size(); i++){


            if(listItem.get(i).weight)

        }



          return listRockets;
  
      }
    
    
}
