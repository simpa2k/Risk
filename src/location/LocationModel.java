package location;

import java.util.HashSet;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class LocationModel {

    private LocationView view;
    private String name;
    private HashSet<LocationModel> neighbours = new HashSet<>();

    public LocationModel(LocationView view, String name) {
        this.view = view;
        this.name = name;
    }

    public LocationView getView() {
        return view;
    }

    public String getName() {
        return name;
    }

}
