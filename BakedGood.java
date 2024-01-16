
/**
 * Baked goods is the first object of our bakery project! It allows users to create a BakedGood object
 *
 * @author Evangeline along with Upskill Class
 * @version 1/16/24
 */
public class BakedGood
{
    // instance variables - replace the example below with your own
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity){
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }
    
    //modify the quantity
    public void bakeMore(int num){
        quantity += num;
    }
    
    public void sold(int num){
        quantity -= num;
    }
    
    public String toString(){
        return name + " costs $" + price + " and we happen to have " + quantity + " left:)";
    }
    
    public static void main(String[] args){
        BakedGood croissant = new BakedGood("croissant", "butter, flower, egg yoke", 20.0, 0);
        System.out.println(croissant);
        //bake 10 croissant
        croissant.bakeMore(10);
        System.out.println(croissant);
    }
}