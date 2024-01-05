package cse225d8;
class M extends Thread{ 
	public void run(){    
		  for(int i=1;i<=5;i++){    
		   try{    
		    Thread.sleep(500);    
		   }
		   catch(Exception e){
			   System.out.println(e);
			   }    
		  System.out.println("Thread is running"+" "+ i );    
		  }    
		 } 
	public static void main(String args[]){    
	 M t1=new M();    
	 M t2=new M();    
	 M t3=new M();    
	 t1.start();    
	 try{    
	  t1.join();    
	 }catch(Exception e){System.out.println(e);}    
	    
	 t2.start();    
	 t3.start();    
	 }    
}