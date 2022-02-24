import java.util.Scanner;
  
class Microwave {
  public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);
   var UserTime = 0d;
   System.out.println("Choose either pizza, soup or sub");
   String UserItem = myObj.nextLine();
   if (UserItem.equals( "pizza")) {
     UserTime = 45;
  } else if (UserItem.equals("soup")) {
     UserTime = 105;
  } else if (UserItem.equals("sub")) {
     UserTime = 60;
  } else {
     System.out.println("You must input pizza, sub or soup");
  }
   
   System.out.println("How many are you putting in? (max 3)");
   String UserQuantity = myObj.nextLine();
   if (UserQuantity.equals("1")) {
   UserTime = UserTime;
  } else if (UserQuantity.equals("2")) {
    UserTime = UserTime * 1.5;
  } else if (UserQuantity.equals("3")) {
    UserTime = UserTime * 2;
  } else {
   System.out.println("You must input a number between 1 and 3");
  }
  System.out.println("This is how many seconds it will take to warm up your food: "+ UserTime);
 }
}
