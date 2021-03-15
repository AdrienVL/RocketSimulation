import java.util.Random;

public class U1 extends Rocket {

    private int rocketWeight;
    private int totalWeight;
    private int currentWeight;

    Random random = new Random();

    public U1(int rocketWeight, int totalWeight, int currentWeight) {
        super(rocketWeight, totalWeight, currentWeight);
        //TODO Auto-generated constructor stub
    }

    public boolean launch() {
        int chanceExplosion;
        chanceExplosion = 5 * (currentWeight/totalWeight);

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber < chanceExplosion){

            return false;
        }else{
            return true;

        }

    }

    public boolean land() {
        int chanceExplosion;
        chanceExplosion = 1 * (currentWeight/totalWeight);

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber < chanceExplosion){

            return false;
        }else{
            return true;

        }
    }


}
