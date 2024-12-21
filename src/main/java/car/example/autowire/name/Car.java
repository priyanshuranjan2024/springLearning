package car.example.autowire.name;

public class Car {
    //this will be dependent on the specification class
    private Specification specification;

    //needs a setter for initializing with autowire


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+specification);
    }
}
