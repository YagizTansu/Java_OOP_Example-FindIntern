public class Application implements IApplication{
    private int jobID;
    private Employee employee;

    public Application(int jobID , Employee employee) {
        this.employee = employee;
        this.jobID = jobID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    @Override
    public boolean gpa_query() {
        if(employee.getGpa() > 2.0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean grade_query(String grade) {
        if(grade.equals("3") || grade.equals("4")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean diciplinary_query(String option) {
        if (option.equals("YES")) {
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean english_query(String englishLevel) {
        if(englishLevel.equals("intermediate") || englishLevel.equals("advance")){
            return true;
        }else{
            return  false;
        }
    }  
}
