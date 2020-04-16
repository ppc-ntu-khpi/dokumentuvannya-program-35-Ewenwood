package domain;
/**
 * Class that describe Artist
 */
public class Artist extends Employee {
    /**
     *
     Constructor that initializes class fields
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     *
     Constructor that initializes class field {@link Artist#skiils} and Constructor fields of ancestor
     * @param skiils
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Override method that return string with a value of class fields and fields of  ancestor
     * @return String value
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     *
     */
    private String[] skiils;

    /**
     *
     * @return String value
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     *  Method that set a value for skills array
     * @param skills
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     *
     * @return skills array
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}