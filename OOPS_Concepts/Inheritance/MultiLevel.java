public class MultiLevel {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.name = "Tiger";
        t.eat();
        t.live();
        t.category();
    }
}

//  level-1 main parent class
class Animals {
    String name;
    public void eat() {
        System.out.println("All animals eat to live");
    }
}

// level-2 Wild inherits the properties from Animals
class Wild extends Animals {
    public void live() {
        System.out.println("Wild Animals live in forests");
    }
}

// level-3 Tiger inherits the properties from Wild
class Tiger extends Wild {
    public void category() {
        System.out.println(name + " Comes Under Wild Animal Category");
    }
}



// Graph representation
// level-1 Animals [Parent]
        //
        //
// level-2 Wild [Child]
        //
        //
// level-3 Tiger [Sub-Child]