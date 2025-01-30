import java.util.Scanner;
public class Cgpacalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numbers of subjects:");
        int num=scanner.nextInt();
        double totalcredits=0;
        double totalGradepoints=0;
        for(int i=1;i<=num;i++){
            System.out.println("enter the credits for subjects"+i+":");
            double credit=scanner.nextInt();
            System.out.println("enter the grade point for subject"+i+":");
            double gradepoint =scanner.nextDouble(); 
            totalcredits +=credit;
            totalGradepoints +=credit*gradepoint;
        }
        double cgpa =totalGradepoints/totalcredits;
        System.out.println("CGPA):"+String.format("%2f",cgpa));
        scanner.close();
    }
}

