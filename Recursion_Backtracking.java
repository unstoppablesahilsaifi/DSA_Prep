//From  Anuj Bhaiyaa Channel
/* Recursion in 3 steps | Recursion Algorithms Basics - Part 1 |
When a function calls itself that is recusrion */

ex- 1.  void printhello() {
    2.      print("Sahil");               // Output m infinte time Sahil print hoga kyuki line 2 s Sahil print ho jayga or line 3 per jayga to ye khud ko call krega to
    3.      printhello();                      // fir Sahil print hoga or aise hi print krta rhega.
    4.      }

// what if we need to print as per user inout times.
ex-   void printhello(int n) {
             if(n==0)
             {
                 return;
             }
          print("Sahil");          // Is case m kya hoga ki user s input ja rha h 5, to function m 5 jayga, check krega ki 5=0 h ya nhi, agar h to vha s hi exit ho jayga
          printhello(n-1);         // agar nahi h to Sahil print hoga and user ka input 5 h na, to function 5-1 mtlb ki 4 k parameter ka sath khud ko call krega 
          }                        // isi tarah 5 baar sahil print ho jayga and jab n=0 ho jayga to programm exit ho jayga

void main()
{
  printhello(5);
}

// Real Code

public class Main {
public static void test(int n){
    if(n==0){
        return;
    }
    System.out.println("Sahil");           // Output would be 5 times Sahil
    test(n-1);
}
    public static void main(String[] args) {
    int n;
     test(5);
    }
}

/* 3 Steps for Recursion
i.   Find the Base case
ii.  Find the relation between the problem and sub-problems
iii. Generalise the problem.  */

// Q- Find the sum of n natural 
public class Main {
public static int summ(int n){
    if(n==1){
        return 1;
    }
    return n+summ(n-1);

}
    public static void main(String[] args) {
    int n;
     int add=summ(5);

        System.out.println(add);
    }
}
// O/P- 15


/* Q- Find a^b using recursion like a=3,b=4 means a^b -> 3^4=81

Now as per the 3 rules
1. If any number power is zero then the output would be 1. to hamara base case ye h ki jab bhi a ki power zero ho jaye to 1 return krdo
2. Problem h hamari to find a^b and sub problem hui a^b-1
//Leaf of faith s ho rha h sab ye ki maan lo bhai 3 ki power 4 h to 3 ki power 3 uske saame rakh do relation bnane k liye
   suppose 3^4(Ye nikalna h)        and        3^4-1(Ye dediya mtlb 3^3)
 Ab important baat suppose kro koi hmse khee ki agar m tumeh 3 ki power 3 dedu to 3 ki power 4 nikal doge?? m bolunga ha kyuki ek 3 ki or multiply krdo aa jayga result.
 3^4= 3^3 * 3
 
 3. Ab krna h generalise(the relation) -> mtlb -> ab aap a^b nikalne k liye kya kroge a^b-1 k andar multiply krdo a ki(a^b = a^b-1 * a)
    f(a,b)= f(a,b-1) * a
   */
class GFG {
 
    // Function to calculate N raised to the power P
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N = 2;
        int P = 3;
 
        System.out.println(power(N, P));
    }
}

O/P-8
    

**************************************8
/* 2nd video of anuj bhaiyaa
Q-1 Find the number of ways in n*m matrix
Ab suno bhai dyaan s, suppose ek matrix h   1  2  3
                                            4  5  6
                                            7  8  9
                                            // hme isme 1 s 9 tak jana h, to kitne raste ho sakte h , pehla to ye ki 1 s 2 pe jao for 3 pe fir 6 fir 9, dusra ye ki 1 s 2
                                            2 s 5, 5 s 6, 6 s 9 to aise kul 6 raaste ho sakte h, condition ye bn gai ki right or bottom m hi ja sakte h 
                   
                   2nd matrix example    1 2
                                         3 4   // isme 1 s 4 tak jane k do raste h bs ya to 1 2 4 ya fir 1 3 4.
                                         
                   3rd matrix example    1 2
                                         3 4
                                         5 6
                                         7 8  // isme total raste 4 h 1 s 8 tak jaane k, 1 2 4 6 8 ys fir 1 3 4 6 8 ya fir 1 3 5 6 8 ya fir 1 3 5 7 8
                                         
 Ab kaam ki baat suno-> suppose ek matrix h 1 2 3 or dusri matrix h 1
                                                                    2  // isme base case ye hoga ki 1 s 3 tak jaane k ek hi raasta h chahe row ho ya column chahe row 
                                                                    3  // k ref m kitne bhi col ho or col k ref m kitni bhi row ho rasta ek hi rhega mtlb answer ek hi hoga
                                                                    
MATRIX h   1  2  3
           4  5  6     // find krna h ki 1 s 12 tak jaane ki kitne raaste h.
           7  8  9
           10 11 12
                                                                    3
Approach-> pehle base case bnana-> kisi bhi tarah s col 3 pe phuch gye to raste ek h hoga 3 s sidha 12 pe or agar kisi tarah row 10 pe phuch gye to bhi rasta ek hi bchega
           10 s sidha 12
           
           n=4 (row)
           m=3 (column)
       (1)     ab agar hm kisi tarah row 10 per phuch gye to hmara portion reh jayga 1 2 3
                                                                                  4 5 6    // pehli matrix tak n=4 tha but ab ho jayga row=n-1
                                                                                  7 8 9    // is condition k liye function hoga f(n,m)-> f(n-1,m)
                                         
                                         
       (2)    ab agar hm kisi tarah col 3 per phuch gye to hamara portion reh jayag 1  2
                                                                                  4  5    //pehli matrix tak m=3 tha but ab ho jayga col=m-1
                                                                                  7  8    // is condition k liye function hoga f(n,m)-> f(n,m-1)
                                                                                  10 11
           ab bhaiyaaa baat h important ki agar total no of way find krna h to condition bc kuch bhi ho sakti h to ek kaam kro dono ko plus krdo.
           mtlb f(n,m)= f(n-1,m) + f(n,m-1)
           */
    
           
  ??ab dekho Code->
    
    int count(int n, int m)
    {
         if(n==1 || m==1)
         {
            return 1;
         }
    return count(n-1,m) + count(n,m-1)
    }
        

Main code
=>
class GFG {
 
    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    static int numberOfPaths(int m, int n)
    {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1)
            return 1;
 
        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
        // + numberOfPaths(m-1, n-1);
    }
 
    public static void main(String args[])
    {
        System.out.println(numberOfPaths(3, 3));
    }
}
 
++++++++++++++++++
/* Q-2 String palindrome check.
Analysis-> Suuppose there is a string ababa, that is plaindrome because if we reverse this the output will be same.
          what we can do is-> check if first and last is same then move to f+1 and l-1, now the pointer would be at bb, again check f and l is same,yes it is same,
          then again f+1 and l-1 now the pointer would be at middle one a or jab ye f and l same location per phuch jaynge to hme pta chal jayga ki charachter ek or same h.
          means palindrome number h.
          */
          
// Lets take an code example for abba
// https://www.youtube.com/watch?v=mEBEw_xScsE&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=10&t=94s
   boolean isPalin(String s, int f, int l)
        {
           if(l>=r)
           {
               return true;
           }                      //complexity hogi BigO(n), kyuki har character ko ek baar to check kr hi rhe ho.
           if(s[f]!=s[l])
           {
               return false;
           }
         return isPalin(s, f+1, l-1)
             
    }
    


Main code

class PalindromeCheck
{
    //My Method to check
    public static boolean isPal(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */
        return isPal(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }

    public static void main(String[]args)
    {
    	//For capturing user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        /* If function returns true then the string is
         * palindrome else not
         */
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
Output:

Enter the String for check:
qqaabb
qqaabb is not a palindrome
Output 2:

Enter the String for check:
cocoococ
cocoococ is a palindrome

         
+++++++++++++++++++++++++++++
By Apna College
// Program to print number
public class Main
{
    public static void pn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pn(n-1);
    }
	public static void main(String[] args) {
	    int n=5;
		pn(n);
	}
}
O/P- 5 4 3 2 1

// Program to find the sum of n natural number.
	
public class Main
{
    public static void printsum(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
          sout(sum);
	   return;
        }
        sum=sum+i
	printsum(i+1,n,sum);
    }
	public static void main(String[] args) {
	   
		printsum(1,5,0); // yaha per i=1 kyuki number 1 s startho rhe h or 5 mtlb 5 tak k number ka sum krna h and sum ko 0 se init krna pdega taki garbage val na de
		
	}
}

       
 /* Print factorial of a number.
   Ab bhai baat suno, suppose 5! find krna h to 5! ko hm 5 * 4! bhi likh sakte h, right?? mtlb scene ye h ki suppose kro n! find krna h to hm kaise bhi (n-1)! nikal le
   or usme n ki multiply krde jaise ki n!= n* (n-1)!   ====> 5!=5*4!    right????????
   Base case hmara yhi rhega ki n==1 ho jata h to O/P bhi 1 rhega.
   */
   
   class FactorialExample2{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  



// Print fibonacchi series using recursion
public class Fibo
{
	public static void fib(int a , int b, int n){
      if(n==0)
      {
      	return;
      }
            int c=a+b;  // ye hmari 3rd term ho gai

      System.out.println(c);
      fib(b,c,n-1); // ab yha p 0 and 1 to print ho chuka tha isliye ab b treat hoga a ki tarah and c treat hoga b ki tarah, or n-1 isliye kyuki is statement p ek
		    // value to print ho gai na.
	}
	public static void main(String args[])
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		fib(a,b,n-2); // n-2 isliye paas hua kuki suru ki 0 and 1 to print hmne kr diya to jitna n h usse n-2 to ho gya na
	}
}



// print a String in reverse





