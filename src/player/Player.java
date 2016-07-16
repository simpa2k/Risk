package player;

import gamePiece.GamePieceModel;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Player {

    private Color color;
    private String name;
    private int armiesLeftToPlace;
    public static Map<String, GamePieceModel> gamePieces = new HashMap<String, GamePieceModel>();

    public Player(String name, Color color){

    }

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
