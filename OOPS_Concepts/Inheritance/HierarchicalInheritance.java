public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Dog";
        d.eat();
        d.display();

        System.out.println();

        Tiger t = new Tiger();
        t.name = "Tiger";
        t.eat();
        t.display();
    }
}

// level-1 Main parent class
class Animal {
    String name;

    public void eat() {
        System.out.println(name+" Eat food to live");
    }
}

// level-2 1st Child inherits the property from parent i.e Animal
class Dog extends Animal {
    public void display() {
        System.out.println(name + " is a pet animal live with humans.");
    }
}

// level-2 2nd Child inherits the property from parent i.e Animal
class Tiger extends Animal{
    public void display() {
        System.out.println(name + " is a wild animal lives in forest.");
    }
}

// Graph representation
// level-1 Animals [Parent]
        //
        //
// level-2 Dog [Child] and Tiger [Child]
