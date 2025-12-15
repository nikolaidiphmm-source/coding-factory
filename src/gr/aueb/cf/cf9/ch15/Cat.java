package gr.aueb.cf.cf9.ch15;

public class Cat implements ISpeakable {
    private String name;

    public Cat(String alice) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Speak() {
        System.out.println("Meow!");
    }
}
