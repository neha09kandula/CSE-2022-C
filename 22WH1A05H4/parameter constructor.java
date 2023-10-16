class para {
private int number;
public para(int num) {
this.number=num;
}
public void displaynumber() {
System.out.println("The number is:"+number);
}
public static void main(String args[]) {
para obj = new para(40);
obj.displaynumber();
}
}