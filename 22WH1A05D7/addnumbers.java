class main{
 public int addnumbers (int x, int y){
  int sum = x + y;
  return sum;
 }
 public static void main(String args[])
 { 
  int num1 = 15;
  int num2 = 25;
  main obj = new main();
  int result = obj.addnumbers(num1,num2);
  System.out.println("sum is :" + result);
  }
} 
