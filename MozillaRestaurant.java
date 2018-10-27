import java.util.Scanner;
class Day{
    String day;
    void Monday(){
        System.out.println("**MONDAY**");
        System.out.println("MEAL                       PRIZE");
        System.out.println("------                     -------");
        System.out.println("CHIPS KUKU                 3450");
        System.out.println("KUKU PILAU                 2250");
        System.out.println("BIRRYANI                   5000");
        System.out.println("CHAPATI BEEF               1250");
        System.out.println("UGALI MATOKE                950");
        System.out.println("SUPERGHETTI KUKU           4950");
        System.out.println("UGALI KIENYEJI             1950");
        System.out.println("UGALI FISH                 5000");
        System.out.println("PEPENONO PIZZA             7550");
        System.out.println("COLD MANGO JUICE           450");
        System.out.println("***OFFER!!***WE CANT WAIT TO SERVE YOU *** BUTTON PILAU***!!!");
    } 
    void Tuesday(){
        System.out.println("**TUESDAY**");
        System.out.println("MEAL                       PRIZE");
        System.out.println("------                     -------");
        System.out.println("UGALI OMENA                650");
        System.out.println("UGALI FRIED EGGS           9000");
        System.out.println("LUSSAINA                   6050");
        System.out.println("BIRRYANI                   5000");
        System.out.println("BEEF PILAU                 2250");
        System.out.println("SUPERGHETTI FRIED MEAT     4950");
        System.out.println("UGALI KIENYEJI             1950");
        System.out.println("CHAPATI FISH               5000");
        System.out.println("SALINA PIZZA               7550");
        System.out.println("COLD LEMMON JUICE           550");
        System.out.println("***OFFER!!***WE CANT WAIT TO SERVE YOU  ***BUTTON PILAU***!!!");
    }
    void Wednesday(){
        System.out.println("**WEDNESDAY**");
        System.out.println("MEAL                       PRIZE");
        System.out.println("------                     -------");
        System.out.println("UGALI OMENA                650");
        System.out.println("UGALI FRIED EGGS           9000");
        System.out.println("LUSSAINA                   6050");
        System.out.println("BIRRYANI                   5000");
        System.out.println("BEEF PILAU                 2250");
        System.out.println("SUPERGHETTI FRIED MEAT     4950");
        System.out.println("UGALI KIENYEJI             1950");
        System.out.println("CHAPATI FISH               5000");
        System.out.println("SALINA PIZZA               5000");
        System.out.println("TANZANIAN NATIVE           700");
        System.out.println("***OFFER!!***WE CANT WAIT TO SERVE YOU  ***BUTTON PILAU***!!!");
    }
    void Thursday(){
        System.out.println("**THURSDAY**");
        System.out.println("MEAL                       PRIZE");
        System.out.println("------                    -------");
        System.out.println("UGALI OMENA                650");
        System.out.println("UGALI FRIED EGGS           9000");
        System.out.println("LUSSAINA                   6050");
        System.out.println("BIRRYANI                   5000");
        System.out.println("MUTTON PILAU               2250");
        System.out.println("SUPERGHETTI FRIED MEAT     4950");
        System.out.println("UGALI KIENYEJI             1950");
        System.out.println("CHAPATI FISH               5000");
        System.out.println("CHAPATI BEEF               1250");
        System.out.println("NATURAL ORANGE JUICE       650");
        System.out.println("WELCOME TO HAPPY AND SWEET THURSDAY");
        System.out.println("BIRRYANI**** IS ON ***OFFER ****TODAY");
        System.out.println("IT'S HAPPY AND SWEEET THURSDAY COS **BUTTON PILAU** IS ALSO ON****OFFER!!!");
    }
    void Friday(){
        System.out.println("**FRIDAY**");
        System.out.println("MEAL                       PRIZE");
        System.out.println("------                    -------");
        System.out.println("CHIPS KUKU                 3450");
        System.out.println("KUKU PILAU                 2250");
        System.out.println("BIRRYANI                   5000");
        System.out.println("CHAPATI BEEF               1250");
        System.out.println("UGALI MATOKE                950");
        System.out.println("SUPERGHETTI KUKU           4950");
        System.out.println("UGALI KIENYEJI             1950");
        System.out.println("UGALI FISH                 5000");
        System.out.println("PEPENONO PIZZA             7550");
        System.out.println("PASSION JUICE               750");
        System.out.println("***OFFER!!***WE CANT WAIT TO SERVE YOU***BUTTON PILAU***!!!");
    }
}
public class MozillaRestaurant{
    public static void main(String args[]){
        int choice;
        Scanner input=new Scanner(System.in);
    System.out.println("WELCOME TO MOZILLA RESTAURANT AND PIZZA IN CENTRE");
    System.out.println("***----------****-----------***------------******");
    System.out.println("PLEASE SELECT A DAY TO VIEW THE MEALS ON MENU!!\n1.MONDAY.\n2.TUESDAY.\n3.WEDNESDAY.\n4.THURSDAY.\n5.FRIDAY.");
     choice=input.nextInt();   
    Day ObjectDay=new Day();
  switch(choice){
    case 1:ObjectDay.Monday();break;
    case 2:ObjectDay.Tuesday();break;
    case 3:ObjectDay.Wednesday();break;
    case 4:ObjectDay.Thursday();break;
    case 5:ObjectDay.Friday();break;
    default:System.out.println("Invalid choice PLEASE Make  a valid SELECTION!!!");break;
  }
}
    }
