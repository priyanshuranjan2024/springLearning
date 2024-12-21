package car.example.autowire.constructor;

public class Car {
    //this will be dependent on the specification class
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+specification);
    }
}
