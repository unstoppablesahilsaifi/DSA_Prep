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
                                                                    
MATRIX h   1  2  3  4
           5  6  7  8     // find krna h ki 1 s 16 tak jaane ki kitne raaste h.
           9 10 11 12
           13 14 15 16
                                                                    3
Approach-> pehle base case bnana-> kisi bhi tarah s col 4 pe phuch gye to raste ek h hoga 4 s sidha 16 pe or agar kisi tarah row 13 pe phuch gye to bhi rasta ek hi bchega
           13 s sidha 16
                                         
