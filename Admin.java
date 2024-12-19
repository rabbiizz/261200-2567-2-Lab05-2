import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type : admin");
    }

    void displayInfo(boolean full){
        if(full){
            System.out.println("Name : " + name);
            System.out.println("Birthday : " + dob);
            System.out.println("User type : admin");
            System.out.println("Today's date : " + LocalDate.now());
        }
        else{
            System.out.println("Name : " + name);
        }
    }

    public void displayHappyBirthday() {
        int currentyear = LocalDate.now().getYear();
        int age = currentyear - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}
