import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    //username
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);
    //object setup
    Adventurer player = new Mage(userName,100);
    Adventurer enemy = new CodeWarrior("Enemy",100);
    //loop
    System.out.println("Game started!");
    System.out.println("-------------");
    while(true){
      System.out.println(player.getName()+", "+player.getHP()+"/"+player.getmaxHP()+" HP , "+ player.getSpecial()+"/"+player.getSpecialMax()+" "+player.getSpecialName());
      System.out.println(enemy.getName()+", "+enemy.getHP()+"/"+enemy.getmaxHP()+" HP , "+ enemy.getSpecial()+"/"+enemy.getSpecialMax()+" "+enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String type = userInput.nextLine();
      if(type.equals("quit")){
        System.out.println("Coward!");
        return;
      }
      else if(type.equals("a")){}
      else if(type.equals("sp")){}
      else if(type.equals("su")){}
      else{
        System.out.println("invalid input");
      }
    }
  }
}
