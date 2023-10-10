




// This is the main function

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main{
    public static void main(String[] args){

        
        Scanner scanner = new Scanner(System.in);

        String FileName = InputFunction.InputNum(scanner);
        System.out.println(FileName);
        // This section is to read the file data and find the count , and make a array of that size
        int Count = Reader.Count(FileName);
        ObjectClass[] Objectarray = new ObjectClass[Count];
        



        Reader.ReadFile(FileName,Objectarray);
         
       

        
       
        
        //  this section is to read the data of from the array
        
        
        System.out.println("Enter 1 for Data Analysis,Enter 2 for GroupAnlysis,Enter 0 to Exit ");
        int Exit = scanner.nextInt();
        scanner.nextLine();
        while(Exit != 0){
            if (Exit == 1){
                ObjectClass[] Netarray = Objectarray;
                ObjectClass[] ScoredArray = Objectarray;
                ObjectClass[] AgainstArray = Objectarray;
                // This is to print the highest net goals
                System.out.println("The Highest net goal of the team is:"+ Netarray[Netarray.length-1].GetTeamName()+ "  " + Netarray[Netarray.length-1].NetGoals());
                // This section of the code is for data sorting of net goals
                InputFunction.NetGoalSorting(Netarray);
                InputFunction.GoalScoredSorting(ScoredArray);
                InputFunction.GoalAgainstSorting(AgainstArray);
        
        
                // This section of the code is for data sorting of goal scored 
        
        
                // This section of the code is for data sorting of goal Against 
                System.out.println("##########NetgoalsSorting##########\n");
                Sorting.DataAnalysis(Netarray);
                System.out.println("##########GoalsScoredSorting##########\n");
                Sorting.DataAnalysis(ScoredArray);
                System.out.println("##########GoalsAgainstSorting##########");
                Sorting.DataAnalysis(AgainstArray);

            }
            else if(Exit == 2){
                ObjectClass[] Netarray = Objectarray;
                System.out.println("Which group do you wish to Perform analysic for :(A,B,C OR D??)");
                String CheckString = scanner.nextLine();
                

                Sorting.GroupSorting(Netarray,Count,CheckString);

            }
            else{
                System.out.println("Enter a Valid Input(1(Data Analysis),2(Group Analysis),0(To exit))");
                

            }
            System.out.println("Do you still wish to perform Analysis? Enter 1 for Data Analysis,Enter 2 for GroupAnlysis,Enter 0 to Exit ");
            Exit = scanner.nextInt();
            scanner.nextLine();

        }
        
        


         
        scanner.close();
        

       
        
    }
        



}
