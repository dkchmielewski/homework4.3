public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 26, "Kielce");
        TimeMachine timeMachine1 = new TimeMachine();
        timeMachine1.backInTime(person1);
        timeMachine1.timeTravel(person1, 5);
    }
}
