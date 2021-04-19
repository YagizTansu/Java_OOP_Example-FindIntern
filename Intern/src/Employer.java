import java.io.FileWriter;
import java.io.IOException;

public class Employer extends User {

    public Employer(int id, String name, String password, String eMail, String location) {
        super(id,name, password, eMail, location);
    }

    @Override
    void addUserToFile() {
        FileWriter writerUsers = null;

        try {

            writerUsers = new FileWriter("users.txt", true);
            writerUsers.write("employer"+","+getId() + "," + getName() + "," + getPassword() + "," + geteMail() + "," + getLocation() + "\n");

        } catch (IOException ex) {
            System.out.println("error file opening");
        } finally {

            if (writerUsers != null) {
                try {
                    writerUsers.close();
                } catch (IOException e) {
                    System.out.println("error file closing");
                }
            }
        }
    }

    public void addEmployerToFile() {
        FileWriter writerEmployers = null;
        try {
            writerEmployers = new FileWriter("employers.txt", true);
            writerEmployers.write(getId() + "," + getName() + "," + getPassword() + "," + geteMail() + "," + getLocation() + "\n");

        } catch (IOException ex) {
            System.out.println("error file opening");
        } finally {

            if (writerEmployers != null) {
                try {
                    writerEmployers.close();
                } catch (IOException e) {
                    System.out.println("error file closing");
                }
            }
        }
    }
}
