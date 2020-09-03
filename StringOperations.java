//Luke Schauble
//AP Computer Science
//August 28, 2020
public class StringOperations{
  public static void main(String args[]){
    String word = "chelsea";
    int x = word.length();
    int half = x/2;
    String firstHalf= word.substring(0,half);
    String secondHalf= word.substring(half);
    System.out.print(secondHalf);
    System.out.println(firstHalf);
    //Challenge 2
    String a = "    ________\n";
    String b = "   /_______/\\\n";
    String c = "   \\ \\    / /\n";
    String d = " ___\\ \\__/_/___\n";
    String e = "/____\\ \\______/\\\n";
    String f = "\\ \\   \\/ /   / /\n";
    String g = " \\ \\  / /\\  / /\n";
    String h = "  \\ \\/ /\\ \\/ /\n";
    String i = "   \\_\\/  \\_\\/\n";
    System.out.print(a+b+c+d+e+f+g+h+i);
  }
}