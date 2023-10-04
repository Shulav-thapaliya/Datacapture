import java .util .Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;






public class InputFunction {
    public static int InputNum(){ 
        
        
        Scanner scanner = new Scanner (System.in);
        int check = 0;

        // This section to ask how many team to register
        System.out.print("How many team data are you planning to enter?");
        int userInput = scanner.nextInt();
        scanner.nextLine();
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
                
                // This is for the team name
                System.out.print("Enter Team name\n");
                String TeamName = scanner.nextLine();
                System.out.println(TeamName);
                // This is for the team code 
                System.out.print("Enter Team Code\n");
                String TeamCode = scanner.nextLine();
                System.out.println(TeamCode);
                // This is for the Goals scored
                System.out.print("Enter Goal scored\n");
                int GoalScored = scanner.nextInt();
                System.out.println(GoalScored);
                // This is for the goals scored against 
                System.out.print("Enter Goal scored against\n");
                int GoalAgainst = scanner.nextInt();
                scanner.nextLine();
                System.out.println(GoalAgainst);
                // This is for the group 
                System.out.print("Enter Group");
                String Group = scanner.nextLine();
                System.out.println(Group);
                //  this is to write into the csv file

                pw.print(TeamName+",");
                pw.print(TeamCode+",");
                pw.print(GoalScored+",");
                pw.print(GoalAgainst+",");
                pw.print(Group+"\n");




            }catch(IOException e){
                e.printStackTrace();

            }
        }
        scanner.close();
        return userInput;
    }
    
        

}

    
            
           

            

           


            










        
       
        



    

    // public class ObjectClass {
    //     private String TeamName;
    //     private String TeamCode;
    //     private int GoalMade;
    //     private int Goalfor;
    //     private String Group;

    //     public ObjectClass(String TeamName,String TeamCode,int GoalMade,int Goalfor,String Group){
    //         this.TeamName = TeamName;
    //         this.TeamCode = TeamCode;
    //         this.GoalMade = GoalMade;
    //         this.Goalfor = Goalfor;
    //         this.Group = Group;
    //     }


    // }



        


