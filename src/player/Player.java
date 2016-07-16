package player;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Player {

    private int armiesLeftToPlace;

    public int getAmountOfLocations() {
        return 0;
    }

    public void increaseArmiesLeftToPlace(int amount) {
        armiesLeftToPlace += amount;
    }

    public void decreaseArmiesLeftToPlace(int amount) {
        armiesLeftToPlace -= amount;
    }

}
