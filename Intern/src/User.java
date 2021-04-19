
public abstract class User {

    private static int count =15;
    private int id;
    private String name;
    private String password;
    private String eMail;
    private String location;

    public User(int id, String name, String password, String eMail, String location) {
        count++;
        this.id = count;
        this.name = name;
        this.password = password;
        this.eMail = eMail;
        this.location = location;
    }

    public User() {

    }

    abstract void addUserToFile();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}