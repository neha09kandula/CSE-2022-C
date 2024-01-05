class B extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){ 
    try{
    	Thread.sleep(100);
    	}
    catch(InterruptedException e){
    	System.out.println(e);
    	}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  B t1=new B();    
  B t2=new B();    
     
  t1.start();    
  t2.isAlive();
  System.out.println("t2 got exceuted");  
 }    
}    
