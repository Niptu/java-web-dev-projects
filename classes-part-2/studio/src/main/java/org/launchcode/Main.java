package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Create a new menu with an empty list of items and the current date
        Menu myMenu = new Menu(new Date(), new ArrayList<>());

        // Create a new menu item
        MenuItem newItem = new MenuItem(9.99, "Delicious Burger", "Main Course", true);

        // Add the new item to the menu
        myMenu.addItem(newItem);

        // You can add more items in the same way
        MenuItem anotherNewItem = new MenuItem(4.99, "Crispy Fries", "Appetizer", false);
        myMenu.addItem(anotherNewItem);

        // Print the updated menu
        myMenu.printMenu();
    }
}
