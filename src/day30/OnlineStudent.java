package day30;

public class OnlineStudent extends Student{

    String state;

    public OnlineStudent(String name, int id, String major, String state) {
        super(name, id, major);
        this.state = state;
    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "state='" + state + '\'' +
                "} " + super.toString();
    }
}
