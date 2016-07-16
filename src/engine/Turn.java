package engine;

import player.Player;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Turn {

    private Engine engine;
    private Player player;

    public Turn(Engine engine, Player player) {
        this.engine = engine;
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
        engine.placeTroops();
    }

    private void combat() {
        Player attackedPlayer = engine.attack();

        if(attackedPlayer != null) {
            //resolve combat
        }

    }

    private void troopMovements() {
        engine.moveTroops();
    }

    private void end() {

    }

}
