package Decorator;
import Composite.Item;

public class Sale extends AbstractDecorator{
    private int discount;
    public Sale(Item anitem,int discount)throws Exception{
        super(anitem);
        setDiscount(discount);
    }
    public void setDiscount(int discount) throws Exception {
        if((discount<=100)&&(discount>= 0)){
            this.discount=discount;
        }else{
            throw new Exception("Invalid discount.");
        }
    }
    public int getDiscount(){
        return discount;
    }
    public double getPrice(){
        double price=super.getPrice();
        return price-(price*discount/100);
    }
}
