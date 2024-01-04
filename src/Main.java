import model.Tshirt;
import model_1.Order;
public class Main {
    public static void main(String[] args) {
        // Created array to use in the object
        String[] sizes1 = {"L","XL","XXL","M"};
        String[] sizes2 = {"S","L","XL","XXl","M","XXL"};
        //Created a object for Tshirts where the required values are kept
        Tshirt Batman = new Tshirt("Batman shirt",573,1460,"Batman Begins","A black shirt with batman begins logo on it",sizes1);
        Tshirt Google = new Tshirt("Google shirt",564,1800,"Google","A plain white shirt with google logo on the top right",sizes2);

        String[] rahul_order = {"573","564"};
        int[] rahul_price = {1640,1800};
        //Created a object for Order where the required values are kept
        Order Rahul = new Order("Rahul Gautum","9861818323",rahul_order,rahul_price);
        // Created array to use in the object
        String[] sam_order = {"564"};
        int[] sam_price = {1800};
        Order Sam = new Order("Sam Raju","9861818323",sam_order,sam_price);


        // Used a function for Tshirts to print the Tshirts info according to the format
        Batman.Greek_Geek_Format();
        Google.Greek_Geek_Format();
        // Used a function for Order to print the bill according to the given format and the total amount
        Rahul.Bill();
        Sam.Bill();
    }
}
