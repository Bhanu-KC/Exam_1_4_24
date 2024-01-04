package model_1;

import model.Tshirt;
public class Order {
    String name;
    String ph_no;

    String[] items;
    int[] price;
    // Created a constructor to initialize the values of the product
    public Order(String name, String ph_no, String[] items, int[] price) {
        this.name = name;
        this.ph_no = ph_no;
        this.items = items;
        this.price = price;
    }
    // getter and setter to get and set the values for the objects that will be created

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }
    // Created a function to print the bill according to the given format
    public void Bill() {
        int totalAmount = 0;
        //Adds the total price to from the price taken ":" is used a "in" from python
        for (int price : price) {
            totalAmount += price;
        }

        double vat = totalAmount * 0.13;
        double totalPrice = totalAmount + vat;

        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + ph_no);
        //Prints the value of items in a list according to the items present
        System.out.print("Items: [");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
            if (i < items.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Prints the value of items in a list according to the price present
        System.out.print("Price: [");
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i]);
            if (i < price.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Prints the total price
        System.out.println("Total Amount with VAT: " + totalPrice);
    }
}
