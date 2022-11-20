package carshop.carshop_inteface;

public interface Customer {
    public void getCarsPrice();
    public void getCarColors();
    public double getCarPrice(int id);
    public String getCarColor(int id);
    public void purchaseCar(int id);
}
