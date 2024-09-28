interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class Multi {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();  
        obj.play(); 
    }
}
