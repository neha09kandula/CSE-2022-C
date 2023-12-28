class trycatch {
    public static void main(String[] args)
    {
        int val1, val2;
        try
        {
            System.out.println("Try Block:: Start");
            val1 = 0;
            val2 = 25/val1;
            System.out.println("Try Blcok:: End");
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException:: Divide by zero!!");
        }
        System.out.println("Outside try-catch :: Rest of the code.");
    }
}