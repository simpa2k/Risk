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

    }

    private void combat() {

    }

    private void troopMovements() {

    }

    private void end() {

    }

}
