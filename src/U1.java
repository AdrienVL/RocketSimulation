import java.util.Random;

public class U1 extends Rocket {

    Random random = new Random();
    Rocket rocket = new Rocket();

    public boolean launch() {
        int chanceExplosion;
        chanceExplosion = 5 * (rocket.getCurrentWeight()/rocket.getTotalWeight());

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }

    }

    public boolean land() {
        int chanceExplosion;
        chanceExplosion = 1 * (rocket.getCurrentWeight()/rocket.getTotalWeight());

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }
    }


}
