class miso
{
    public static void main(String[] args) 
    {
        int x = 4;
        int y = 9;
        int a = 5;
        int b = 1;
        //boolean result = x>y && a<b; false because if the both statement are false it gives the result false
       // boolean result = x>y && a>b; again it will give false because if one is true and other is false it result in false
       //boolean result = x<y && a<b;the solution is true .true + true = true
       //boolean result = x>y || a<b;the answer is false 
       boolean result = a>b;
       
        System.out.println(!result);//we used not operater that reverse the solution
    }
}