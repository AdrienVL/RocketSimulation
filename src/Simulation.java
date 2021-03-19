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
        String[] arrayOfItem = data.split("=", 2);
        int kilos = Integer.parseInt(arrayOfItem[1]);
        Item item = new Item();
        item.setItem(arrayOfItem[0], kilos/1000);
        listItems.add(item);
        
      }

        items.close();
        return listItems;

    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> listItems){

        ArrayList<Rocket> listRockets = new ArrayList<Rocket>();
        Rocket rocket = new Rocket();

        int currentWeight = 12;

        rocket.setRocket(10, 18, currentWeight, 100);


        for(int i = 0; i < listItems.size(); i++){

            if(rocket.canCarry(listItems.get(i))){

                //How to deal with updating object
            
                currentWeight += rocket.carry(listItems.get(i));
                System.out.println("CURRENT WEIGHT can Carry: " + currentWeight);

            }else{
                rocket.setRocket(10, 18, currentWeight, 100);
                listRockets.add(rocket);
                currentWeight = 10;
                currentWeight +=rocket.carry(listItems.get(i));


            }
        }


          return listRockets;
  
      }

      public ArrayList<Rocket> loadU2(ArrayList<Item> listItems){

        ArrayList<Rocket> listRockets = new ArrayList<Rocket>();
        Rocket rocket = new Rocket();

        int currentWeight = 0;


        for(int i = 0; i < listItems.size(); i++){

            if(rocket.canCarry(listItems.get(i))){
            
                currentWeight +=rocket.carry(listItems.get(i));
            }else{
                rocket.setRocket(18, 29, currentWeight, 120);
                listRockets.add(rocket);
                currentWeight = 0;
                currentWeight +=rocket.carry(listItems.get(i));


            }
        

        }


          return listRockets;
  
      }

        public int runSimulation(ArrayList<Rocket> listRockets){

            U1 u1 = new U1();
            U2 u2 = new U2();


            int budget = 0;
            for(Rocket rocket : listRockets){
                if(rocket.getRocketCost() == 100){
                    if(u1.launch(rocket.getCurrentWeight(),rocket.getMaxWeight()) == false || u1.land(rocket.getCurrentWeight(),rocket.getMaxWeight()) == false){
                        budget += rocket.getRocketCost();
    
                    }
                }if(rocket.getRocketCost() == 120){

                    if(u2.launch(rocket.getCurrentWeight(),rocket.getMaxWeight()) == false || u2.land(rocket.getCurrentWeight(),rocket.getMaxWeight()) == false){
                        budget += rocket.getRocketCost();
    
                    }

                }

            }

            return budget;
    
        } 

    
    
    
}
