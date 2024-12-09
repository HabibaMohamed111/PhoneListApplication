import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneList n1 = new PhoneList();



        while(true){

            System.out.println("1- ADD New Contact");
            System.out.println("2- Delete  Contact");
            System.out.println("3- Search about Contact");
            System.out.println("4- display your Contacts");
            System.out.println("5- To Exit ");
            System.out.println("please select your choice : ");


            int choice=in.nextInt();
            in.nextLine();
            if(choice==5)break;
            switch (choice){
                case 1:
                    System.out.println("Enter Name and PhoneNumber: ");
                    n1.addContact(in.nextLine(),in.nextLine());
                    break;
                case 2:
                    System.out.println("Enter Name which you want to delete his contact :");
                    n1.deleteContact(in.nextLine());
                    break;
                case 3:
                    System.out.println("Enter Name which you want to search about this contact  : ");
                    n1.searchContact(in.nextLine());
                    break;
                case 4:
                    n1.displayList();
                    break;
                default:
                    System.out.println("Valid Choice, please try again!");
            }
        }



    }
}
