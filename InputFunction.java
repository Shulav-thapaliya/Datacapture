import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java .util .Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;






public class InputFunction {
    public static String InputNum(Scanner scanner){ 
        
        
       
        int check = 0;

        // This section to ask how many team to register
        
        System.out.print("How many team data are you planning to enter?");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        System.out.print(userInput);

        
        
        // This section is to ask the enter the file name
        
        System.out.print("Enter name of the csv file to store the data ");
        String FileName = scanner.nextLine();

        
        
        

        
       // This section is to check take input and store into a file
        for(int i = 0; i<userInput;i++ ){
            
            
            try(PrintWriter pw = new PrintWriter(new FileWriter(FileName, true))){
                
                if(check == 0){
                    pw.println("Team Name,Team Code,Goals For,Goals Against,Group");
                    check = 1;

                
                }
                int exceptionResolved =0;
                
                // This is for the team name
                while(exceptionResolved == 0){
                    try{
                    System.out.print("Enter Team name\n");
                    String TeamName = scanner.nextLine();
                    
                   
                    if(TeamName.isBlank()){
                        System.out.println("Enter a valid team name11");
                        throw new IllegalArgumentException("Team name cannot be empty");
                    }
                    pw.print(TeamName+",");
                    exceptionResolved = 1;
                    }catch(IllegalArgumentException e){
                        System.out.println("Enter a valid team name");
                    }

                }
                
                
                // This is for the team code {
            
                while(exceptionResolved == 1){
                    try{
                        System.out.print("Enter Team Code\n");
                        String TeamCode = scanner.nextLine();
                        
                    
                        if (TeamCode.isEmpty()){
                            throw new IllegalArgumentException("Team code  cannot be empty!!");

                        }
                        pw.print(TeamCode+",");
                        exceptionResolved = 2;
                    }catch(IllegalArgumentException e){
                        System.out.println("Enter a valid team code.");
                    }
                    
                }
                // This is for the Goals scored
                
                while(exceptionResolved == 2){
                    try{
                        System.out.print("Enter Goal scored\n");
                        int GoalScored = scanner.nextInt();
                        System.out.println(GoalScored);
                    
                        if(GoalScored < 0 ){
                            throw new IllegalArgumentException("Goal scored cannot be negative!!");
                        }
                        pw.print(GoalScored+",");
                        exceptionResolved = 3;

                    }catch(IllegalArgumentException e){
                        System.out.println("Enter a valid Goalscored.");
                    }

                }
                
                
                
                // This is for the goals scored against 
                while(exceptionResolved == 3){
                    try{
                        System.out.print("Enter Goal scored against\n");
                        int GoalAgainst = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(GoalAgainst);
                        if(GoalAgainst < 0 ){
                            throw new IllegalArgumentException("Goal scored cannot be negative!!");
                        }
                        pw.print(GoalAgainst+",");
                        exceptionResolved = 4;
                    }catch(IllegalArgumentException e){
                        System.out.println("Enter a valid GoalAgainst.");
                    }

                }

                
                
                
                // This is for the group 
                while(exceptionResolved == 4){
                    try{
                        System.out.print("Enter Group");
                        String Group = scanner.nextLine();
                        System.out.println(Group);
                        if (!Group.equals("A") && !Group.equals("B") && !Group.equals("C") && !Group.equals("D")) {
                            throw new IllegalArgumentException("Invalid group. Please enter A, B, C, or D.");
                        }
                        pw.print(Group+"\n");
                        exceptionResolved = 5;
                    }catch(IllegalArgumentException e){
                        System.out.println("Enter a valid Group name");
                    }

                }
                
                
               

               
                
                
                
               




            }catch(IOException e){
                e.printStackTrace();

            }
        }
        
        return FileName;
    }
    
    public static void NetGoalSorting(ObjectClass[] ArrayList){
        int arraylength = ArrayList.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0 ;i < arraylength - 1; i++){
                if(ArrayList[i].NetGoals() > ArrayList[i+1].NetGoals()){
                        ObjectClass Holder = ArrayList[i];
                        ArrayList[i] = ArrayList[i+1];
                        ArrayList[i+1] = Holder;
                        swapped = true;

                    }
                
                    

            }
                

        
        } while (swapped);
    }

    public static void GoalScoredSorting(ObjectClass[] ArrayList){
        int arraylength = ArrayList.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0 ;i < arraylength - 1; i++){
                if(ArrayList[i].GoalScored() > ArrayList[i+1].GoalScored()){
                    ObjectClass Holder = ArrayList[i];
                    ArrayList[i] = ArrayList[i+1];
                    ArrayList[i+1] = Holder;
                    swapped = true;

                }

            }
        } while (swapped);

       
    }
    
    
    
    public static void GoalAgainstSorting(ObjectClass[] ArrayList){
        int arraylength = ArrayList.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0 ;i < arraylength - 1; i++){
                if(ArrayList[i].GoalAgainst() > ArrayList[i+1].GoalAgainst()){
                    ObjectClass Holder = ArrayList[i];
                    ArrayList[i] = ArrayList[i+1];
                    ArrayList[i+1] = Holder;
                    swapped = true;

                }

            }
        } while (swapped);

       
    }    

       
    

}
     
     
        



    

    



        


