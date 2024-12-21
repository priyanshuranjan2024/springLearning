package car.example.constructor.injection;

public class Car {
    //this will be dependent on the specification class
    private Specification specification;

    //needs a constructor


    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+specification);
    }
}
