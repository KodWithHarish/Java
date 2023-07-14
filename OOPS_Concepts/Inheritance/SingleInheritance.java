public class SingleInheritance {
    public static void main(String[] args) {
        Java j = new Java();
        j.name = "Java";
        j.execute();
        j.display();
    }
}

// level-1 Main parent class
class Language {
    String name;

    public void execute() {
        System.out.println(name+" language can be executed");
    }
}

// level-2 Child inherits the property from parent i.e Animal
class Java extends Language {
    public void display() {
        System.out.println(name + " is a object oriented programming language.");
    }
}

// Graph representation
// level-1 Language [Parent]
        //
        //
// level-2 Java [Child]