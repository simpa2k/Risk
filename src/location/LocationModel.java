package location;

import java.util.HashSet;

/**
 * Created by simpa2k on 2016-07-16.
 */

public class LocationModel {

    private String name;
    private HashSet<LocationModel> neighbours = new HashSet<>();

    public LocationModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
