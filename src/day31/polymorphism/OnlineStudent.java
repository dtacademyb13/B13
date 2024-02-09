package day31.polymorphism;

public class OnlineStudent extends Student{

    String id;

    public OnlineStudent(String name, String state, String id) {
        super(name, state);
        this.id = id;
    }


    @Override
    public String toString() {
        return "OnlineStudent{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }
}
