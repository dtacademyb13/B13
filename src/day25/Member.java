package day25;

public class Member {

    private String name;
    private int age;
    private String subscriptionType;
    private boolean isActive;

    public Member(String name, int age, String subscriptionType) {
        this.name = name;
        this.age = age;
        this.subscriptionType = subscriptionType;
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public String getInfo() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subscriptionType='" + subscriptionType + '\'' +
                ", isActive=" + isActive +
                '}';
    }


    /*

    Objective:
Develop a Java program that allows users to manage fitness center memberships. Users can add new members, update membership details, and view the current member list.
Class Requirements:
Member Class:
Instance Variables:
name: (private String) The name of the member.
subscriptionType: (private String) The type of subscription (e.g., "Monthly", "Annual").
isActive: (private boolean) Indicates whether the membership is active.
Constructors:
A constructor that initializes name, subscriptionType, and isActive.
Encapsulation:
Getter and setter methods for all instance variables.
Main Class:
Array of Member Objects:
Use an array to store Member objects, representing the fitness center's memberships.
Main Method Logic:
Initialize an array of Member objects.
Enter a loop that allows users to add new members, update existing members' details, or view the current membership list.
For each member:
Prompt the user to enter the name, subscription type, and active status.
Create a new Member object and add it to the array.
Provide options to display all members in the list or update an existing member's details.
Exit the program upon user request.


     */
}
