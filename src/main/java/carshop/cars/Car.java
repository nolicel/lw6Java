package carshop.cars;

public abstract class Car {
    private int speed;
    private  boolean isSellOut;
    private String color;
    protected double regularPrice;

    public Car(int speed, boolean isSellOut, double regularPrice, String color){
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public String getColor() {return color;}
    public  void setSellOut(boolean sellOut) {isSellOut = sellOut;}
    public boolean isSellOut(){return  isSellOut;}
    public abstract double getSalePrice();
}
