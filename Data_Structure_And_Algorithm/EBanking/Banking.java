package EBanking;
import java.util.Scanner;
public class Banking {
        public static void main(String[] args) {
            instructions();
            Scanner scanner= new Scanner(System.in);
            Scanner scanner2= new Scanner(System.in);
            fetchUserInput(scanner);
            fetchUserInput(scanner,"enter acct number: ");
            int command=0;
            do{
                command=fetchUserInput(scanner);
                switch (command){
                    case 1 ->{
                        String name=fetchUserInputText(scanner2,"Enter Full name");
                    }
                    case 2 ->{

                    }
                }
            }while (command!=0);
            //Read user option

        }

        static int fetchUserInput (Scanner scan, String message){
            System.out.print(message);
            return scan.nextInt();
        }
        static int fetchUserInput(Scanner scan){
            System.out.print("Enter command: ");
            return scan.nextInt();
        }

        static  String fetchUserInputText(Scanner s, String msg){
            System.out.print(msg+": ");
            return s.nextLine();
        }
        static void instructions() {
            String[] command = new String[6];
            command[0] = "1 : Create account";
            command[1] = "2 : Make deposit";
            command[2] = "3 : Withdrawals";
            command[3] = "4 : Transfer funds";
            command[4] = "5 : Transaction history";
            command[5] = "6 : Exit";
            System.out.println("Customers Support System");
            for (String cmd : command) {
                System.out.println(cmd);
            }
        }
}
