class Employee {
    // Private variables, cannot be accessed directly from outside
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {  // Simple validation
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setAge(30);
        
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}