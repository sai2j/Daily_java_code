package inheritance2;

import java.util.Scanner;

public class StudentTracker {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter name");
                    String name = sc.nextLine();
                    System.out.println("enter id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("enter hardwork");
                    int hardWorkScore = Integer.parseInt(sc.nextLine());
                    System.out.println("enter task");
                    int taskcomplete = Integer.parseInt(sc.nextLine());
                    System.out.println("enter cAttendance");
                    double classAttendance = Double.parseDouble(sc.nextLine());
                    System.out.println("lAttendance");
                    double labAttandance = Double.parseDouble(sc.nextLine());

                   System.out.println("=== Placement Evaluation Menu ==="); 
                   System.out.println("1. View All Scores ");
                   System.out.println("2. Check Placement Probability");
                   System.out.println("3. Check Placement Eligibility");
                   System.out.println("4. Exit"); 
                   PlacementCandidate p1 = new PlacementCandidate(name, id, hardWorkScore, taskcomplete, classAttendance, labAttandance);
                   boolean condition = true;
                   while (condition) {
                   int choice = sc.nextInt();
                   switch(choice){
                    case 1->{
                              p1.evaluateCandidate();
                    }
                    case 2->{
                              p1.probility();
                    }
                    case 3->{
                              p1.Eligiblity();
                    }
                    case 4->{
                              System.out.println("exit the code");
                              System.exit(0);
                    }
                   }
          }
          }
}
