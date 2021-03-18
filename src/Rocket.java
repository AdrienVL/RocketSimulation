public class Rocket implements SpaceShip{

    private int rocketWeight;
    private int maxWeight;
    private int currentWeight;
    private int rocketCost;


    //Setter
    public void setRocket(int rocketWeight, int maxWeight, int currentWeight, int rocketCost){
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
        this.rocketCost = rocketCost;
      
           }

    //Getters

    public int getRocketWeight() {
        return rocketWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getRocketCost() {
        return rocketCost;
    }



    @Override
    public boolean launch(int currentWeight, int maxWeight) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean land(int currentWeight, int maxWeight) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        // TODO Auto-generated method stub

        int maxCargoWeight = getMaxWeight() - getRocketWeight();
        if(item.getItemWeight() < maxCargoWeight && (rocketWeight + item.getItemWeight()) < maxCargoWeight){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int carry(Item item) {
        // TODO Auto-generated method stub

        return getRocketWeight() + item.getItemWeight();
    }

    
}
