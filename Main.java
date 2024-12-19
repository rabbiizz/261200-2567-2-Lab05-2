public class Main {
    public static void main(String[] args) {
        User John = new User("John",1954,12,18);
        John.displayInfo();
        Admin nicolas = new Admin("Nicolas",1964,12,18);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
        System.out.println();
        nicolas.displayHappyBirthday();
        John.displayHappyBirthDay();
    }
}