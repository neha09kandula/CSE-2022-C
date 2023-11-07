class Dad {
  int dadmoney;
  void dadproperty(){
    System.out.println("This is Dad's property");
  }
}

class Child extends Dad {
  int childmoney;
  void childproperty(){
    System.out.println("This is Child's property");
  }
}

class Grandchild extends Child {
  int grandchildmoney;
  void grandchildproperty(){
    System.out.println("This is Grandchild's property");
  }
}

class Main {
  public static void main(String[] args) {
    Dad d = new Dad();
    System.out.println(d.dadmoney);
    d.dadproperty();
  }
}
