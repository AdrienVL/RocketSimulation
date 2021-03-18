import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {



    public ArrayList<Item> loadItems(String file) throws FileNotFoundException{

      File phase = new File(file);
      Scanner items = new Scanner(phase);
      ArrayList<Item> listItems = new ArrayList<Item>();
    

      

      while (items.hasNextLine()) {

        String data = items.nextLine();
        String[] arrayOfItem = data.split(data, '=');
        int kilos = Integer.parseInt(arrayOfItem[1]);
        Item item = new Item();
        item.setItem(arrayOfItem[0], kilos);
        listItems.add(item);
        
      }

      items.close();
        return listItems;

    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> listItems){

        ArrayList<Rocket> listRockets = new ArrayList<Rocket>();
        Rocket rocket = new Rocket();

        int currentWeight = 0;
        int itemTracker = 0;


        while(itemTracker != listItems.size()){


            for(int i = 0; i < listItems.size(); i++){

                if(rocket.canCarry(listItems.get(i))){
                
                    itemTracker++;
                    currentWeight +=rocket.carry(listItems.get(i));
                }else{
                    rocket.setRocket(10, 18, currentWeight, 100);
                    listRockets.add(rocket);
                    currentWeight = 0;
                    currentWeight +=rocket.carry(listItems.get(i));


                }
            }

        }

          return listRockets;
  
      }

      public ArrayList<Rocket> loadU2(ArrayList<Item> listItems){

        ArrayList<Rocket> listRockets = new ArrayList<Rocket>();
        Rocket rocket = new Rocket();

        int currentWeight = 0;
        int itemTracker = 0;


        while(itemTracker <= listItems.size()){


            for(int i = 0; i < listItems.size(); i++){

                if(rocket.canCarry(listItems.get(i))){
                
                    itemTracker++;
                    currentWeight +=rocket.carry(listItems.get(i));
                }else{
                    rocket.setRocket(18, 29, currentWeight, 120);
                    listRockets.add(rocket);
                    currentWeight = 0;
                    currentWeight +=rocket.carry(listItems.get(i));


                }
            }

        }

          return listRockets;
  
      }

        public int runSimulation(ArrayList<Rocket> listRockets){


            int budget = 0;
            for(Rocket rocket : listRockets){

                if(!rocket.launch() || !rocket.land()){
                    budget += rocket.getRocketCost();
                    continue;

                }

            }
            

            return budget;
    
        } 

    
    
    
}
