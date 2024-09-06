class loop
{
    public static void main(String[] args)
     {
        int i = 1;//initialize a variable i and taking the value 1
        while(i<=4)//used while loop taht runs up to less then 4 and equal to 4
        {
            System.out.println("Hi" + i);//print the value hi with taking the value of i
            int j = 1;//initialize the variable j with value 1
            while (j<=3)//j value run up to less then 3 or equal to 3
            {
                System.out.println("Hello" + j);//printing the hello1,2,3 according to the j value
                j++;//increments j by 1 each time
            }
            i++;//increments i by 1 each time
        }
        System.out.println("Bye" + i);
    }
}