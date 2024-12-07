public class Mage extends Adventurer{
  private int mana,maxMana;

  public Mage(String name){
      super(name, 10);
  }
  public Mage(String name, int hp){
      super(name,hp);
  }
  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "mana";
  }
  //accessor methods
  public int getSpecial(){
    return mana;
  }
  public void setSpecial(int n){
    if(n<=getSpecialMax())
      mana=n;
    else
      System.out.println("error: above max value");
  }
  public int getSpecialMax(){
    return maxMana;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    return "";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return "";
  }

  //heall or buff self
  public String support(){
    return "";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return "";
  }
}
