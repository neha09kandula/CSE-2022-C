class Main {
  int x=5;
  int y=x+1;
  public static void main(String[] args) {
    // calling the constructor without any parameter
    Main obj1 = new Main();
    Main obj2 = new Main();
    System.out.println("Value of x: " + obj1.x);
    System.out.println("Value of y: " + obj2.y);
  }
}