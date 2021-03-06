package location;

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

        setPreferredSize(new Dimension(200, 200));
        setMinimumSize(new Dimension(200, 200));
    }

    public void paintComponent(Graphics g){

        g.setColor(color);
        g.fillRect(0, 0, 200, 200);
        g.setColor(Color.RED);

        g.drawString(model.getName(), 50, 100);
    }

}