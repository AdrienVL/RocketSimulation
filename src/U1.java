import java.util.Random;

public class U1 extends Rocket {

    Random random = new Random();
    Rocket rocket = new Rocket();

    public boolean launch(int currentWeight, int maxWeight) {
        double chanceExplosion;
        double weightRatio = (double) currentWeight/maxWeight;

        chanceExplosion = 5 * (weightRatio);


        int randomNumber = random.nextInt(100)+1;

        System.out.println("Current Weight: " + currentWeight);
        System.out.println("Max Weight: " + maxWeight);
        System.out.println("random: " + randomNumber);
        System.out.println("chanceExplosion: " + chanceExplosion);
        System.out.println("====================================");

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }

    }

    public boolean land(int currentWeight, int maxWeight) {
        double chanceExplosion;
        chanceExplosion = (0.01 * (currentWeight/maxWeight)) * 100;

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }
    }


}
