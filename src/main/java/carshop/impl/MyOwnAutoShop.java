package carshop.impl;

import carshop.cars.Car;
import carshop.cars.Ford_Car;
import carshop.cars.Sedan_Car;
import carshop.cars.Truck_Car;
import carshop.carshop_inteface.Admin;
import carshop.carshop_inteface.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    Car [] cars = new Car[]{
            new Sedan_Car(210, false, 4000, "White", 24),
            new Ford_Car(230, false, 5300, "Blue", 2006, 0.3),
            new Ford_Car(170, false, 3100, "Black", 2000, 0),
            new Truck_Car(190, false, 3500, "Black", 2700),
            new Truck_Car(240, false, 5000, "Yellow", 2200)
    };

    @Override
    public double getIncome() {
        double income=0;
        for (Car car :cars){
            if(car.isSellOut()){
                income+=car.getSalePrice();
            }
        }
        return income;
    }

    @Override
    public void getCarsPrice() {
        System.out.println("There are cars prices: ");
        for (Car car :cars){
            if(!car.isSellOut()) {
                System.out.print(car.getSalePrice() + ", ");
            }
        }
        System.out.print("\n");
    }

    @Override
    public void getCarColors() {
        System.out.println("There are cars colors: ");
        for (Car car :cars){
            if(!car.isSellOut()){
                System.out.print(car.getColor()+", ");
            }
        }
        System.out.print("\n");
    }

    @Override
    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return cars[id].getColor();
    }

    @Override
    public void purchaseCar(int id) {
        cars[id].setSellOut(true);
    }
}
