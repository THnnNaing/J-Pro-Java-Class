import java.util.Scanner;
class Employee{
    static Scanner sc = new Scanner(System.in);

    int id, salaryrate, age;
    String name, depCode;

    void inputEmployee(){
        System.out.println("Enter Employee Information");
        System.out.println();
        System.out.print("ID -> ");
        id = sc.nextInt();
        System.out.print("Name -> ");
        name = sc.next();
        System.out.print("Age -> ");
        age = sc.nextInt();
        System.out.print("depCode -> ");
        depCode = sc.next();
        System.out.print("SalaryRate -> ");
        salaryrate = sc.nextInt();
    }

    void setEmployee(int ID, String Name, int Age, String DepCode, int SalaryRate){
        this.id = ID;
        this.name = Name;
        this.age = Age;
        this.depCode = DepCode;
        this.salaryrate = SalaryRate;
    }

    void showEmployee(){
        System.out.println("Employee Information");
        System.out.println("........................");
        System.out.println("ID :"+id);
        System.out.println("Name \t:"+name);
        System.out.println("Age \t:"+age);
        System.out.println("DepCode \t:"+depCode);
        System.out.println("SalaryRate \t:"+salaryrate);
        System.out.println("........................");
    }

    public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee();

    e1.setEmployee(1, "Julius", 30, "SE", 1000);
    e2.inputEmployee();

    e1.showEmployee();
    e2.showEmployee();
    }

}