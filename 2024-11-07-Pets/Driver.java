//When I overrided getName() for Bird, when using speak() for animal it used the
//animal getName(), and when using speak() for Bird it used the bird getName() override
//
//The third statement didnt work because you are trying to store an Animal object
//in the Bird variable type, but Animal is the parent class, and therefore doesn't
//meet the Bird class requirements.
public class Driver{
  public static void main(String[] args){
    Animal abc = new Animal ("oop",66,"bob");
    abc.speak();
    Bird bill = new Bird("squawk", 40, "bill", 3.3, "red");
    bill.speak();

    Animal a1 = new Animal("hi", 99, "tree");
    Bird b1 = new Bird ("bye", 3, "bush", 12.8, "green");
    // Bird b2 = new Animal("rawr", 23, "clint");
    Animal a2 = new Bird("beep", 42, "Clara", 1.1, "purple");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
