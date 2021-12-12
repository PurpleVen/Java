public class Animal {
    private int age;
    private String name;

    void set_data(int a, String b) {
        age = a;
        name = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Zebra extends Animal {

    String message_zebra(String str) {
        str = "The zebra named " + getName() + " is " + getAge() + " years old. The zebra comes from Africa";
        return str;
    }
}

class Dolphin extends Animal {


    String message_dolphin(String str) {
        str = "The dolphin named " + getName() + " is " + getAge() + " years old. The dolphin comes from New Zealand";
        return str;
    }
}
