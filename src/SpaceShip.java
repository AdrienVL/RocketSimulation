public interface SpaceShip{
    boolean launch(int currentWeight, int maxWeight);
    boolean land(int currentWeight, int maxWeight);
    boolean canCarry(Item item);
    int carry(Item item);
}
