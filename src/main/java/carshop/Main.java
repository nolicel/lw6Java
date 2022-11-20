package carshop;

import analyse.Str_Vovels;
import analyse.Str_nVovels;
import carshop.impl.MyOwnAutoShop;
import LW5_Extend.abstraction.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop shop = new MyOwnAutoShop();
        shop.getCarColors();
        shop.getCarsPrice();
        System.out.println(shop.getIncome());
        System.out.println(shop.getCarPrice(3));
        System.out.println(shop.getCarColor(3));
        shop.purchaseCar(3);
        System.out.println(shop.getIncome());

        Person[] persons = new Person[]{
                new Person("Styles","Harry",28),
                new Person("Brown","James",48),
                new Student("Chalamet","Timothee",26,222,346894),
                new Lecturer("Jackson","Michael",44,"IT",15666),
                new Student("Colman","Zendaya",26,222,523825),
                new Student("Thorne","Bella",25,222,118237),
                new Person("Pickler","Kellie",36),
                new Lecturer("Snyder","Timothy",53,"History",12000)
        };

        for (Person person : persons)
        {
            System.out.println(person.printInfo());
        }

        Str_Vovels vovelsAnalyse = new Str_Vovels();
        Str_nVovels nVovelsAnalyse = new Str_nVovels();
        System.out.println("Enter string: ");

        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print("is vovels characters in your string: " + vovelsAnalyse.strAnalyse(str));
        System.out.println("\n");
        System.out.print("is nVovels characters in your string: " + nVovelsAnalyse.strAnalyse(str));
        System.out.println("\n");
    }
}
