class hope
{
    public static void main(String a[])
    {
        int num [] [] = new int [3][4];//declare a 2d array with 3 rows and 4 columns
         for (int i=0;i<3;i++)//it helps to create a row of 3 array of 3 times
         {
            for (int j=0;j<4;j++)//it creates a array of 4 columns
            {
             System.out.print(num[i][j] + " ");
            }
            System.out.println();
         }
    } 
}
