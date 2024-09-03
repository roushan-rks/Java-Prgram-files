class aks
{
    public static void main(String[] args)
     {
        int num1 = 6;// int type has assigned a value to variable name num1
        //num1++; for increment the value of num1
        //num--; for decrement the value of num1
        //int result = num1++;it is a post increment where it first fetch the value and then increment it
        int result = ++num1;//in is pre increment where it increment the value fast and then fetch the value
        System.out.println(result);
    }
}