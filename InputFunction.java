import java .util .Scanner;




public class InputFunction {
    public static int InputNum(){ 
        Scanner scanner = new Scanner (System.in);
        System.out.print("How many team data are you planning to enter?");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
        

    }
    public static int InputUser(int number){
        for (int i = 0 ; i < number ;i++) {
            Scanner scanner = new Scanner (System.in);
            String TeamName;
            String TeamCode;
            int GoalMade;
            int Goalfor;
            String Group;
            System.out.print("Enter Team name");
            TeamName = scanner.nextLine();
            System.out.print("Enter Team code");
            TeamCode = scanner.nextLine();
            System.out.print("Enter GoalMade");
            GoalMade = scanner.nextInt();
            System.out.print("Enter Goalfor");
            Goalfor = scanner.nextInt();
            System.out.print("Enter Group");
            Group = scanner.nextLine();
            scanner.close();










        }


    }
}
