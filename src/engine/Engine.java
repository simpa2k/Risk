package engine;

import java.awt.Color;
import location.LocationModel;
import location.LocationView;
import player.Player;
import java.util.ArrayList;

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

    public ArrayList<LocationView> createLocations() {
        ArrayList<LocationView> locationViews = new ArrayList<>();

        for(int i = 0; i < locationNames.length; i++) {
            LocationModel locationModel = new LocationModel(locationNames[i]);
            LocationView locationView = new LocationView(Color.BLACK, locationModel);
            locationViews.add(locationView);
        }

        return locationViews;
    }

    public void execute() {
        while(!(players.isEmpty()))
            for(Player player : players) {
                Turn turn = new Turn(this, player);
                turn.start();
            }
    }

    private void removePlayer(Player player) {
        players.remove(player);
    }

    protected void placeTroops() {

    }

    protected Player attack() {
        return null;
    }

    protected void moveTroops() {

    }

}
