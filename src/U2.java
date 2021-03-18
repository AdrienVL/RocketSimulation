import java.util.Random;

public class U2 extends Rocket{
    
    Random random = new Random();
    Rocket rocket = new Rocket();

    public boolean launch() {
        int chanceExplosion;
        chanceExplosion = 4 * (rocket.getCurrentWeight()/rocket.getMaxWeight());

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }

    }

    public boolean land() {
        int chanceExplosion;
        chanceExplosion = 8 * (rocket.getCurrentWeight()/rocket.getMaxWeight());

        int randomNumber = random.nextInt(100)+1;

        if (randomNumber >= chanceExplosion){

            return false;
        }else{
            return true;

        }
    }
}
