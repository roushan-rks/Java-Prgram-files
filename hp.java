class Calculator//created a new class name Calculator

    
     {
        public int add (int n1, int n2)//taken two parameters n1,n2 which can be accessed from outside the class
        {
            int r = n1 + n2;//sum of n1 and n2 and store it into variable r
            return r;//return the result of r 
        }
    }

    public class hp//new class named hp
    {
        public static void main(String[] args)
         {
          int num1=4;//integer variable num1 and give the value 4
          int num2=5;//integer variable num2 and give the value 5
          Calculator  calc = new Calculator();//create new instance of a calculator class and assign it to a variable calc
          int result = calc.add(num1,num2); //we called add method on the calc object and store it into a variable result
          System.out.println("The result is: " + result);//print result
        }
    }