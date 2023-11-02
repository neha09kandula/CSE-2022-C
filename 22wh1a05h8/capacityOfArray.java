class Arr
{
  public static void main(String[]args)
  {
    int[] array = new int[7];
    
    int capacity = array.length;
    System.out.println("the capacity of the array is: "+capacity);
    
    int length = 0;
    for(int i = 0; i<3; i++)
    {
      array[i] = i*i;
      length++;
    }
    System.out.println("the length of the array is: "+length);
  }
}
