public class lab2{
    int teacherID;
    String fullName, email;
    Double salary;

    // Default constructor
    public lab2() {
        this.teacherID = 0;
        this.fullName = "";
        this.email = "";
        this.salary = 0.0;
    }

    // Parameterized constructor
    public lab2(int teacherID, String fullName, String email, Double salary) {
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.email = email;
        this.salary = salary;
    }

    // Method to clone object using 'this'
    public void makeClone(lab2 t2) {
        this.teacherID = t2.teacherID;
        this.fullName = t2.fullName;
        this.email = t2.email;
        this.salary = t2.salary;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        lab2 teacher1 = new lab2(1, "sadikshya", "sadikshya@example.com", 50000.0);
       lab2 teacher2 = new lab2();

        // Cloning teacher1 into teacher2
        teacher2.makeClone(teacher1);

        // Displaying teacher2 details
        System.out.println("Teacher 2 Details (Cloned from Teacher 1):");
        System.out.println("Teacher ID: " + teacher2.teacherID);
        System.out.println("Full Name: " + teacher2.fullName);
        System.out.println("Email: " + teacher2.email);
        System.out.println("Salary: " + teacher2.salary);
    }
}