public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public boolean getIsNew() {
        return isNew;
    }
    public void setName(String aName) {
        this.name = aName;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }
    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

}

