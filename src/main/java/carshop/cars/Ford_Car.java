package carshop.cars;

public class Ford_Car extends Car {
    int yearOfIssue;
    double Discount;

    public Ford_Car(int speed, boolean isSellOut, double regularPrice, String color, int year,double manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.yearOfIssue = year;
        this.Discount =manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice-(regularPrice* Discount);
    }
}
