public class Rocket implements SpaceShip{

    private int rocketWeight;
    private int totalWeight;
    private int currentWeight;

    //Setter
    public void setRocket(int rocketWeight, int totalWeight, int currentWeight){
        this.rocketWeight = rocketWeight;
        this.totalWeight = totalWeight;
        this.currentWeight = currentWeight;
           }

    //Getters

    public int getRocketWeight() {
        return rocketWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public boolean launch() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean land() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        // TODO Auto-generated method stub

        int maxCargoWeight = getTotalWeight() - getRocketWeight();
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
