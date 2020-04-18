package domain;
/**
 * Class that describe Employee
 */
public class Employee {

    /**
     * Override method that return string with a value of class fields
     * @return  String value
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    // private static int employeesCount = 0;

    /**
     * Constructor that initializes its class fields  and set level required level
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     *  Constructor that initializes a random id for employee
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     *  Method that set a job title
     * @param job
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Method that return a job title
     * @return string value
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method that return a job title
     * @return string value
     */
    public String getName() {
        return name;
    }

    /**
     * Method that set a level for employee
     * @param level
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Method that return a level of employee
     * @return Integer value
     */
    public int getLevel() {
        return level;
    }
    /**
     * Method that return a dept of employee
     * @return String value
     */
    public String getDept() {
        return dept;
    }

    /**
     * Method that set a dept for employee
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Method that set a name for employee
     * {@code true} value of variable name
     * {@code false} John Doe
     * @param name
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}