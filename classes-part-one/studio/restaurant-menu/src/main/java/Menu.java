import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList <MenuItem> menuItems;
    private Date lastUpdated;

    public  Menu (ArrayList <MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

}
