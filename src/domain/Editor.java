package domain;
/**
 * Class that describe Editor
 */
public class Editor extends Artist {

    /**
     * Constructor that initializes its class fields and fields of ancestor
     * @param electronicEditing
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     * @param electronicEditing
     * @param skiils
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     * @param electronicEditing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor that initializes its class fields and fields of ancestor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     *   Method that return a string value
     * @return  {@code true}  string value of s + "electronic"
     *           {@code false} string value of s + "paper"
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= ";
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;

    }

    private boolean electronicEditing;

    /**
     * @return boolean value
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method that set a value for electronicEditing
     * @param electronic
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}