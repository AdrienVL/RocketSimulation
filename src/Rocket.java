public class Rocket implements SpaceShip{

    private int rocketWeight;
    private int totalWeight;

    public Rocket(int rocketWeight, int totalWeight){
        this.rocketWeight = rocketWeight;
        this.totalWeight = totalWeight;
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



        return rocketWeight + item;
    }
    
    
}
