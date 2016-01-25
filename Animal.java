import java.util.ArrayList;

public abstract class Animal {
    private int age;
    private String name;
    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Animal(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }


    protected abstract String getTypicalSound();

    public void printInformation() {
        System.out.println("I am " +
                this.getClass().getSimpleName() + ", my name is "+
                this.name+", "+
                this.gender+", "+
                this.age +" years old!");
        System.out.println(getTypicalSound());
    }
}

class Dog extends Animal {
    public Dog(int age, String name, String gender) {
        super(age, name, gender);
    }

    protected String getTypicalSound() {
        return "*DogSound*";
    }
}

class Frog extends Animal {
    public Frog(int age, String name, String gender) {
        super(age, name, gender);
    }

    protected String getTypicalSound() {
        return "*FrogSound*";
    }
}

class Cat extends Animal {

    public Cat(int age, String name) {
        super(age, name);
        super.setGender("female");
    }

    protected String getTypicalSound() {
        return "*CatSound*";
    }
}

class Kitten extends Animal {

    public Kitten(int age, String name, String gender) {
        super(age, name, gender);
    }

    protected String getTypicalSound() {
        return "*KittenSound*";
    }
}

class Tomcat extends Animal {

    public Tomcat(int age, String name) {
        super(age, name);
        super.setGender("male");
    }

    protected String getTypicalSound() {
        return "*TomcatSound*";
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Frog(2, "Bumpy", "male"));
        animals.add(new Dog(4, "Jack", "male"));
        animals.add(new Cat(1,"Mimi"));
        animals.add(new Kitten(1,"Lexie", "female"));
        animals.add(new Tomcat(4, "Tom"));

        for (Animal temp: animals) {
            temp.printInformation();
        }

    }
}

