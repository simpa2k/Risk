package player;

import gamePiece.GamePieceModel;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Player {

    private Color color;
    public static Map<String, GamePieceModel> gamePieces = new HashMap<String, GamePieceModel>();

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
