import java.util.Random;

public class U2 extends Rocket{
    
    Random random = new Random();
    Rocket rocket = new Rocket();

    public boolean launch(int currentWeight, int maxWeight) {
        double chanceExplosion;
        chanceExplosion = (0.04 * ((currentWeight/maxWeight))) * 100;

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }

    }

    public boolean land(int currentWeight, int maxWeight) {
        double chanceExplosion;
        chanceExplosion = (0.08 * (currentWeight/maxWeight))*100;

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }
    }
}
