package loginsystem;
import java.util.Scanner;
public class RonquilloAshleyHope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] users = new String[100][2];
        int usercount = 0;
        boolean running = true;
        while (running) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println("If you dont have an account register first");
            System.out.print("Choose in the option: ");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.println("\n LOGIN YOUR ACCOUNT");
                    System.out.print("Enter Username: ");
                    String LoginName = scan.nextLine();
                    System.out.print("Enter Password: ");
                    String LoginPass = scan.nextLine();
                    boolean loginSuccess = false;
                    for (int i = 0; i < usercount; i++) {
                        if (users[i][0] != null &&
                            users[i][0].equals(LoginName) &&
                            users[i][1].equals(LoginPass)) {
                            loginSuccess = true;
                            break;
                        }
                    }
                    if (loginSuccess) {
                        System.out.println("Hello " + LoginName + "!");
                    } else {
                        System.out.println("Username or Password is Incorrect please try again!");
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.println("\n REGISTER AN ACCOUNT");
                    System.out.print("Enter Username: ");
                    String Username = scan.nextLine();
                    boolean usernameExist = false;
                    for (int i = 0; i < usercount; i++) {
                        if (users[i][0] != null &&
                            users[i][0].equals(Username)) {
                            usernameExist = true;
                            break;
                        }
                    }
                    if (usernameExist) {
                        System.out.println("Username already Exist! Try again");
                        System.out.println();
                        break;
                    }
                    System.out.print("Enter Password: ");
                    String Password = scan.nextLine();
                    System.out.print("Confirm Password: ");
                    String ConfirmPassword = scan.nextLine();
                    if (!Password.equals(ConfirmPassword)) {
                        System.out.println("Password does not match! Try again");
                        System.out.println();
                        break;
                    }
                    users[usercount][0] = Username;
                    users[usercount][1] = Password;
                    usercount++;
                    System.out.println("\n Registration Success");
                    break;
                case "3":
                    System.out.println("Goodbye");
                    running = false;
                    break;
                default:
                    System.out.println("\n Invalid option please try again. Choose 1,2,3.");
            }
        }
        scan.close();
    }
}