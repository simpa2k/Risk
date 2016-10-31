package window;

import engine.Engine;
import location.LocationView;
import player.Player;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Window extends JFrame {

    private Player player;
    private ArrayList<Player> players = new ArrayList<>();
    private JScrollPane sp = new JScrollPane();
    private JPanel mainPanel = new JPanel();

    public Window() {

        mainPanel.setLayout(new GridLayout(2,3));

        Player p = new Player();
        players.add(p);

        Engine engine = new Engine(players);
        ArrayList <LocationView> drawLocations = engine.createLocations();

        for(int i = 0; i < drawLocations.size(); i++){

            mainPanel.add(drawLocations.get(i));

        }
        sp = new JScrollPane(mainPanel);
        add(sp, BorderLayout.CENTER);

    }

}
