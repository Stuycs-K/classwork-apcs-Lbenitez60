public class Mage extends Adventurer{
  public Mage(String name){
      super(name, 10);
  }
  public Mage(String name, int hp){
      super(name,hp);
  }
  public String getSpecialName(){
    return "";
  }
  //accessor methods
  public int getSpecial(){
    return 0;
  }
  public void setSpecial(int n){

  }
  public int getSpecialMax(){
    return 0;
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
