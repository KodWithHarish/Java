class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle is Engine Starting");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car is Vehicle Hence, Car Engine is also Starting.");
    }
}

class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike is also Vehicle Hence, Bike Engine is also Starting.");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();

        System.out.println();

        Bike b = new Bike();
        b.startEngine();
    }
}
