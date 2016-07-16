package engine;

import location.LocationModel;
import location.LocationView;
import player.Player;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by simpa2k on 2016-07-16.
 */

public class Engine {

    private static final String[] locationNames = {"Sverige", "Norge", "Danmark", "Narnia", "Ingenstans", "Mordor",
                                                    "DSV", "Kista"};
    private ArrayList<Player> players;

    public Engine(ArrayList<Player> players) {
        this.players = players;
    }

    public HashSet<LocationModel> createLocations() {
        HashSet<LocationModel> locationModels = new HashSet<>();

        for(int i = 0; i < locationNames.length; i++) {
            LocationModel locationModel = new LocationModel(new LocationView(), locationNames[i]);
            locationModels.add(locationModel);
        }

        return locationModels;
    }

    public void execute() {
        while(!(players.isEmpty()))
            for(Player player : players) {
                Turn turn = new Turn(player);
                turn.start();
            }
    }

    private void removePlayer(Player player) {
        players.remove(player);
    }

}
