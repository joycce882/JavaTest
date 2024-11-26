package java_2024_11_24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> CarList = new ArrayList<>();
        Car c1 = new Car("BMWX7",500000, "黑色");
        Car c2 = new Car("audi_e",240000,"白色");
        Car c3 = new Car("xaiomi_su7",300000.0,"珍珠白");

        Collections.addAll(CarList,
                new Car("BMWX7",500000, "黑色"),
                new Car("audi_e",240000,"白色"),
                new Car("xaiomi_su7",300000.0,"珍珠白")
        );
        for (Car car:CarList){
            System.out.println(car.getBrand()+"\t"+car.getPrice()+"\t"+car.getColor());
        }
    }
}
