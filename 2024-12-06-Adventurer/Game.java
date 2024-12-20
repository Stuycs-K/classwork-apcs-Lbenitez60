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
    String[] actions = new String[] {"a","sp","su"};
    String[] actionnames = new String[] {"attacked","special attacked","supported"};
    while(true){
      System.out.println(player.getName()+", "+player.getHP()+"/"+player.getmaxHP()+" HP , "+ player.getSpecial()+"/"+player.getSpecialMax()+" "+player.getSpecialName());
      System.out.println(enemy.getName()+", "+enemy.getHP()+"/"+enemy.getmaxHP()+" HP , "+ enemy.getSpecial()+"/"+enemy.getSpecialMax()+" "+enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String type = userInput.nextLine();
      if(type.equals("quit")){
        System.out.println("Coward!");
        return;
      }
      else if(type.equals("a")){
        System.out.println(player.attack(enemy));
      }
      else if(type.equals("sp")){
        System.out.println(player.specialAttack(enemy));
      }
      else if(type.equals("su")){
        System.out.println(player.support());
      }
      else{
        System.out.println("invalid input");
        continue;
      }
      if (enemy.getHP()<=0){
        System.out.println("You won!");
        return;
      }
      int enemyattackindex = (int)(Math.random()*3);
      if(enemyattackindex==0){
        enemy.attack(player);
        System.out.println("enemy "+ actionnames[enemyattackindex]);
      }
      if(enemyattackindex==1){
        enemy.specialAttack(player);
        System.out.println("enemy "+ actionnames[enemyattackindex]);
      }
      if(enemyattackindex==2){
        enemy.support();
        System.out.println("enemy "+ actionnames[enemyattackindex]);
      }
      if (player.getHP()<=0){
        System.out.println("You have been defeated!");
        return;
      }
    }
  }
}
