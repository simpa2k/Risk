package Location;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maja on 2016-07-16.
 */
public class LocationView extends JComponent {

    private Color color;
    private LocationModel model;

    public Color getColor(){
        return color;
    }

    public LocationView(Color color, LocationModel model){
        this.color = color;
        this.model = model;
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(200, 200, 200, 200);
    }

}