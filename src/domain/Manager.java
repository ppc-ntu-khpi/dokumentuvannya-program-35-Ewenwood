
package domain;
/**
 * Class that describe Manager
 */
public class Manager extends Employee {

    /**
     * Constructor that initializes its class fields and fields of ancestor
     * @param employees
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Override method that return string with a value of class fields
     * @return String value
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees();
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     * @param employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that initializes array of employees
     * @param employees
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that return employees array
     * @return Employee array
     */
    public Employee[] getEmployeesList() {
        return employees;
    }


}