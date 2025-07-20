// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    boolean a = false;
    boolean b = true;
    boolean c = true;

    System.out.println(!a && (a ^ b) && (!b ^ c) && (!a ^ !c));

  }
}
