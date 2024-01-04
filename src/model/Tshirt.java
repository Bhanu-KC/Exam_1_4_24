package model;

public class Tshirt {
    String name;
    int product_Code;
    int price;
    String brand;
    String description;
    String[] available_sizes;

   // created a constructor to initialize the values of the product
    public Tshirt(String name, int product_Code, int price, String brand, String description, String[] availablesizes) {
        this.name = name;
        this.product_Code = product_Code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.available_sizes = availablesizes;
    }
// getter and setter to get and set the values for the objects that will be created
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_Code() {
        return product_Code;
    }

    public void setProduct_Code(int product_Code) {
        this.product_Code = product_Code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Created a Tshirt Description function according to the given format
    public void Greek_Geek_Format(){
        System.out.println("Item name :"+this.name+"\nDescription: "+this.description+"\nProduct Code:"+this.product_Code+"\nPrice: " +this.price+"\nSizes:"+this.available_sizes);

    }

}
