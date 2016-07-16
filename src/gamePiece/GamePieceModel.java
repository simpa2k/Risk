package gamePiece;

import location.Location;
import player.Player;

/**
 * Created by Robert on 2016-07-16.
 */
public class GamePieceModel {

    private GamePieceType gamePieceType;
    private int amount;
    private Player player;
    private Location location;

    public GamePieceModel(int amount, Player player, Location location){

    }

    public GamePieceType getGamePieceType() {
        return gamePieceType;
    }

    public int getAmount() {
        return amount;
    }

    public Player getPlayer() {
        return player;
    }

    public Location getLocation() {
        return location;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
