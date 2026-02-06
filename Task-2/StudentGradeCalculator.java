//Student Grade Calculator
import java.util.*;
class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of subjects:");
        boolean isFailed=false;
        int totalsubjects=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=totalsubjects;i++)
        {
            System.out.println("\nEnter marks for subject "+ i +":");
            int marks=sc.nextInt();
            if(marks>100 || marks<0){
                System.out.println("\nInvalid marks! Enter between 0 and 100.");
                i--;
                continue;
            }
            if(marks<34){
                System.out.println("\nStudent failed in the subject "+ i);
                isFailed=true;
            }
            totalmarks+=marks;
        }
        System.out.println("\nTotal marks="+totalmarks);
        double percentage=(double)totalmarks/totalsubjects;
        System.out.println("\n Average percentage="+percentage+"%");
        if(isFailed){
            System.out.println("\n Student Failed since student is unable to clear each subject3");
        }
        else if(percentage>=90)
        {
            System.out.println("\nGrade=A");
        }
        else if(percentage>=80 && percentage<90)
        {
            System.out.println("\nGrade=B");
        }
        else if(percentage>=65&&percentage<80)
        {
            System.out.println("\nGrade=C");
        }
        else if(percentage>=50&&percentage<65)
        {
            System.out.println("\nGrade=D");
        }
        else if(percentage>=34&&percentage<50)
        {
            System.out.println("\nGrade=E");
        }
        else{
            System.out.println("Student Failed");
        }
        sc.close();
    }}
