import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    static Random random = new Random(700000000);
    public static void main(String[] args) {
        int res = random.nextInt(8 +1);
        int choose;

        CustomerService service = new CustomerServiceImpl();

        System.out.println("Welcome to the Online Reservation!");
        System.out.println("Enter number 1 and Enter your contact");

        choose = reader.nextInt();
        reader.nextLine();

        boolean end = true;
            while (end){
                        System.out.println("Enter your First Name: ");
                        String fn = reader.nextLine();
                        service.fname(fn);
                        System.out.println("Enter your Last Name: ");
                        String ln = reader.nextLine();
                        service.lname(ln);
                        System.out.println("Enter your phone Number: ");
                        String pn = reader.nextLine();
                        service.pnumber(pn);
                        System.out.println("Your set Number: " + res);
                        System.out.println();
                        System.out.println("Enter Which day do you want!");
                        System.out.println("1) Monday, 2) Tuesday, 3) Wednesday, 4) Thursday, 5) Friday, 6) Saturday, 7) Sunday");
                        int chooseday = reader.nextInt();
                        switch(chooseday){
                            case 1:
                                System.out.println("Monday");
                                break;
                            case 2:
                                System.out.println("Tuesday");
                                break;
                            case 3:
                                System.out.println("Wednesday");
                                break;
                            case 4:
                                System.out.println("Thursday");
                                break;
                            case 5:
                                System.out.println("Friday");
                                break;
                            case 6:
                                System.out.println("Saturday");
                                break;
                            case 7:
                                System.out.println("Sunday");
                                break;
                            default:
                                System.out.println("Default");
                        }
                        System.out.println();
                        System.out.println("Enter Which Time do you want!");
                        System.out.println("1) 12:00-13:00, 2) 13:00-14:00, 3) 14:00-15:00, 4) 15:00-16:00, 5) 16:00-17:00, 6) 17:00-18:00, 7) 18:00-19:00");
                        int choosedate = reader.nextInt();
                        switch (choosedate){
                            case 1:
                                System.out.println("12:00-13:00");
                                break;
                            case 2:
                                System.out.println("13:00-14:00");
                                break;
                            case 3:
                                System.out.println("14:00-15:00");
                                break;
                            case 4:
                                System.out.println("15:00-16:00");
                                break;
                            case 5:
                                System.out.println("16:00-17:00");
                                break;
                            case 6:
                                System.out.println("17:00-18:00");
                                break;
                            case 7:
                                System.out.println("18:00-19:00");
                                break;
                            default:
                                System.out.println("Default");
                        }
                        System.out.println();
                        System.out.println("Thank you for the Reservation!");
                        end = false;
                        break;
                }
            }

        }

