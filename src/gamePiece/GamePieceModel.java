package gamePiece;

import location.LocationModel;
import player.Player;

/**
 * Created by Robert on 2016-07-16.
 */
public class GamePieceModel {

    private GamePieceType gamePieceType;
    private int amount;
    private Player player;
    private LocationModel locationModel;

    public GamePieceModel(int amount, Player player, LocationModel locationModel){

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

    public LocationModel getLocationModel() {
        return locationModel;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setLocationModel(LocationModel locationModel) {
        this.locationModel = locationModel;
    }


}
