package engine;

import player.Player;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Turn {

    private Player player;

    public Turn(Player player) {
        this.player = player;
    }

    public void start() {
        reinforcements();
        combat();
        troopMovements();
    }

    private void reinforcements() {
        int amountOfHeldLocations = player.getAmountOfLocations();
        int amountOfArmiesReceived = amountOfHeldLocations / 3 <= 8 ? 3 : amountOfHeldLocations / 3;

        player.increaseArmiesLeftToPlace(amountOfArmiesReceived);
    }

    private void combat() {

    }

    private void troopMovements() {

    }

    private void end() {

    }

}
