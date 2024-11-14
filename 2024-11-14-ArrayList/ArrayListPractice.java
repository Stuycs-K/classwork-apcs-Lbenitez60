import java.util.ArrayList;

public class ArrayListPractice{

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> result = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      result.add(""+(int)(Math.random()*11));
      if (result.get(i).equals("0"))
        result.set(i,"");
    }
    return result;
  }
  public static void replaceEmpty( ArrayList<String> original){
    for (int i=0; i < original.size();i++) {
    if (original.get(i).equals("")) {
      original.set(i,"Empty");
    }
  }
}
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  ArrayList<String> result = new ArrayList<String>(original.size());
  //return a new ArrayList that is in the reversed order of the original.
  for(int i=original.size(); i< original.size;)
}
}
