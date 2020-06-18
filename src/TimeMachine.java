public class TimeMachine {
    void backInTime(Person person) {
        person.age--;
        System.out.println("Age: " + person.age);
    }
    void timeTravel(Person person, int x) {
        person.age += x;
        System.out.println("Age: " + person.age);
    }
}
