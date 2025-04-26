import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    User user;
    List<Property> listOfProperties = new ArrayList<>();

    public PropertyOwner(User user) {
        this.user = user;
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }
}
