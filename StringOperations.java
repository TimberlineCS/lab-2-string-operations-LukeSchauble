//Luke Schauble
//AP Computer Science
//August 28, 2020
public class StringOperations{
  public static void main(String args[]){
    String word = "chelsea";
    int a = word.length();
    int half = a/2;
    String firstHalf= word.substring(0,half);
    String secondHalf= word.substring(half);
    System.out.print(secondHalf);
    System.out.print(firstHalf);
    
  }

}
