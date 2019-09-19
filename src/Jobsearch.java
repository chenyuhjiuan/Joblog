import java.util.ArrayList;
import java.util.Scanner;

public class Jobsearch {

    public static void main(String args[]){

        ArrayList<Job> jobs= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String input="";
        String name="";
        String email="";
        String company;
        String title;
        String startate;
        String endDate;

        while(true){
            System.out.println("Do you want to enter your name, (y/n)");
            input=sc.nextLine();

            if(input.equalsIgnoreCase("n"))
                break;;
            //Job job1=new Job();
            Job job =new Job();
            System.out.println("Please enter your name:");
            name=sc.nextLine();
            job.setName(name);

            System.out.println("Please enter your email");
            email=sc.nextLine();
            job.setEmail(email);

            while(true){
                Jobs job1= new Jobs();
                System.out.println("Please enter your company's name ");
                company=sc.nextLine();
                job1.setCompany(company);

                System.out.println("Please enter your title");
                title=sc.nextLine();
                job1.setCompany(title);

                System.out.println("Please enter your starting date on this position:");
                startate=sc.nextLine();
                job1.setStartdate(startate);

                System.out.println("Please enter your ending date");
                endDate=sc.nextLine();
                job1.setEnddate(endDate);
                //jobs.add(job1);

                System.out.println("Do you want to add anoterh job, (y/n)");
                input=sc.nextLine();

                if(input.equalsIgnoreCase("n"))
                    break;;

            }

            jobs.add(job);

        }
        for(Job j:jobs)
            System.out.println(j.displayTxt());
    }
}
