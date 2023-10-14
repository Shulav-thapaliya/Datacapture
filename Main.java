




// This is the main function

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main{
    public static void main(String[] args){

        
        Scanner scanner = new Scanner(System.in);
        // This section of the code is to take input from the user and store that input into a csv file 
        String FileName = InputFunction.InputNum(scanner);
        System.out.println(FileName);
        // This section is to ask the user for the file for further analysis
        System.out.println("Please enter the name of the file for further analysis");
        String AnalysisFile = scanner.nextLine();
        int Count = Reader.Count(AnalysisFile);
        ObjectClass[] Objectarray = new ObjectClass[Count];
        

        // This section is to read the file ,store the file into an array 
        
        Reader.ReadFile(AnalysisFile,Objectarray);
         
       

        
       
        
        //  this section is to read the data of from the array and ask the user for Individual or Group analysis
        
        
        System.out.println("Enter 1 for Data Analysis,Enter 2 for GroupAnlysis,Enter 0 to Exit ");
        int Exit = scanner.nextInt();
        scanner.nextLine();
        while(Exit != 0){
            if (Exit == 1){
                ObjectClass[] Netarray = Objectarray;
                ObjectClass[] ScoredArray = Netarray;
                ObjectClass[] AgainstArray = ScoredArray;
                // This is to print the highest net goals
                System.out.println("The Highest net goal of the team is:"+ Netarray[(Netarray.length)-1].GetTeamName()+ "  " + Netarray[(Netarray.length)-1].NetGoals());
                // This section of the code is for data sorting of net goals
                InputFunction.NetGoalSorting(Netarray);
                InputFunction.GoalScoredSorting(ScoredArray);
                InputFunction.GoalAgainstSorting(AgainstArray);
        
        
                // This section of the code is for data sorting of goal scored 

                System.out.println("Net goals");
                for (int i = 0 ;i < Netarray.length;i++){
                    System.out.println(Netarray[i].NetGoals());

                }
                System.out.println("Goalscored");
                for (int i = 0 ;i < ScoredArray.length;i++){
                    System.out.println(ScoredArray[i].GoalScored());

                }
                System.out.println("Goalsagainst");
                for (int i = 0 ;i < AgainstArray.length;i++){
                    System.out.println(AgainstArray[i].GoalAgainst());

                }

        
        
                // This section of the code is for data sorting of goal Against 
                System.out.println("                 NetgoalsSorting               \n");
                System.out.print(' ');
                System.out.print(' ');
                Sorting.DataAnalysis(Netarray);
                System.out.print(' ');
                System.out.println("           GoalsScoredSorting           \n");
                System.out.print(' ');
                System.out.print(' ');
                Sorting.DataAnalysis(ScoredArray);
                System.out.print(' ');
                System.out.println("            GoalsAgainstSorting             \n");
                Sorting.DataAnalysis(AgainstArray);
                System.out.print(' ');

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
