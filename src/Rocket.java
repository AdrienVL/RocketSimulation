public class Rocket implements SpaceShip{


    private int rocketWeight;
    private int totalWeight;
    private int currentWeight;

    public Rocket(int rocketWeight, int totalWeight, int currentWeight){
        this.rocketWeight = rocketWeight;
        this.totalWeight = totalWeight;
        this.currentWeight = currentWeight;
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
    public boolean canCarry(int item) {
        // TODO Auto-generated method stub
            int maxCargoWeight = totalWeight - rocketWeight;
            if(item > maxCargoWeight){
                return true;
            }else{
                return false;
            }
    }

    @Override
    public int carry(int item) {
        // TODO Auto-generated method stub
        currentWeight = rocketWeight + item;
        return currentWeight;
    }
    
    
}
