import java.util.ArrayList;

public class Job {

    private String name;
    private String email;
    private String company;
    private String title;
    private String startdate;
    private String enddate;
    private ArrayList<String> jobs;

    public Job() {
    }

    public Job(String name, String email, ArrayList<String> jobs) {
        this.name = name;
        this.email = email;
        this.jobs = jobs;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }
/*
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
*/
    public String displayTxt(){
        String result="";
        for(String job:jobs){
            result=""+result+job;
        }
    String display ="Name: "+getName()+"\nEmail: "+getEmail()+"\nJobs: ";

        return display;
    }
}
