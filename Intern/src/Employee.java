
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Employee extends User {

    private String university;
    private String department;
    private double gpa;

    public Employee(int id, String name, String password, String eMail, String location, String university, String department, double gpa) {
        super(id, name, password, eMail, location);
        this.department = department;
        this.university = university;
        this.gpa = gpa;
    }

    public Employee(int id, String name, String password, String eMail, String location) {
        super(id, name, password, eMail, location);
    }

    public Employee() {
    }
    
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    void addUserToFile() {

        FileWriter writerUsers = null;

        try {

            writerUsers = new FileWriter("users.txt", true);
            writerUsers.write("employee" + "," + getId() + "," + getName() + "," + getPassword() + "," + geteMail() + "," + getLocation() + "\n");

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
   

    public void addEmployeeToFile() {
        FileWriter writerEmployees = null;

        try {
            writerEmployees = new FileWriter("employees.txt", true);
            writerEmployees.write(getId() + "," + getName() + "," + getPassword() + "," + geteMail() + "," + getLocation() + "," + getUniversity() + "," + getDepartment() + "," + getGpa() + "\n");

        } catch (IOException ex) {
            System.out.println("error file opening");
        } finally {

            if (writerEmployees != null) {
                try {
                    writerEmployees.close();
                } catch (IOException e) {
                    System.out.println("error file closing");
                }
            }
        }
    }
}
