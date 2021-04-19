public class Job{
    private int employerID ;
    private static int id = 13 ;
    private String company;
    private String job_location;
    private String job_department;
    private String job_role;
    private String startTime;
    private String finishTime;

    
    public Job(String company, String job_location, String job_department, String job_role, String startTime, String finishTime) {
        id++ ;
        this.company = company;
        this.job_location = job_location;
        this.job_department = job_department;
        this.job_role = job_role;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public Job() {
    }
    
    
    
    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob_location() {
        return job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }

    public String getJob_department() {
        return job_department;
    }

    public void setJob_department(String job_department) {
        this.job_department = job_department;
    }

    public String getJob_role() {
        return job_role;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }  

    @Override
    public String toString() {
        return "Job{" + "company=" + company + ", job_location=" + job_location + ", job_department=" + job_department + ", job_role=" + job_role + ", startTime=" + startTime + ", finishTime=" + finishTime + '}';
    }

    public int getEmployerID() {
        return employerID;
    }

    public void setEmployerID(int employerID) {
        this.employerID = employerID;
    }
    
    
}
