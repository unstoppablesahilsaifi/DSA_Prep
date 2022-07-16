// From Anuj Bhaiyya Youtube Channel
/* Time Complexity- Time taken by an algorithm as a function of the length of input.
a. f(n)=3n^2+5n -> Ingnore constants and focus on the maximum power then time complexity would be-> Big O(n^2)
b. f(n)=n+100log n -> n is greater beacuse if we make the graph of this function log n will always below the n it would be downgrading graph so TC would be Big O(n).
c. f(n)=1000000 -> for this type of function TC would be O(1) coz 100000 is a constant value.
Some other examples for O(n)=n/4, (n+100)/4, 5n+2log n
Some other examples for O(n^2)=5n^2+7n+2, 3n^2+2n, n^2/100
Note- Big O notation works on worst case because that vo case hi sabse jyada time lega,to idea ye hota h ki minimum kitna bhi time le algo but atmost(worst case) itna to
time legi hi legi.
+++For practice got to interview bit+++
*/

**********************************************************************************************************************************************************
/* From Vikas Prajapti's Notes
To analyze an algorithm we need some kind of syntax and that forms the base for asymptotic notation/analysis.
There are three types:
+ Worst case-> Defines the input for which the algorithm takes huge time.
            -> Input is the one for which the algorithm runs the slower.
            
+ Best Case-> Defines the input for which the algorithm takes lowest time.
           -> Input is the one for which the algorithm runs the fastest.

+ Average Case-> Provides a prediction about the running time of the algorithm
              -> Assumes that the input is random
              
++ Big O(1)-● Time complexity of a function (or set of statements) is considered as O(1) if it doesn’t contain loop, recursion, and call to any other non-constant
              time function.
● For example, swap() function has O(1) time complexity.

For example, the following loop is O(1). */

// Here c is a constant
for (int i = 1; i <= c; i++)
{
// some O(1) expressions
}

//++ Big O(n)-●	Time Complexity of a loop is considered as O(n) if the loop variables are incremented/decremented by a constant amount.
//          ●	For example following functions have O(n) time complexity.

// Here c is a positive integer constant
for (int i = 1; i <= n; i += c)
{
// some O(1) expressions
}

for (int i = n; i > 0; i -= c)
{
// some O(1) expressions
}

//++ Big O(n^2)-●	Time complexity of nested loops is equal to the number of times the innermost statement is executed.
//           ●	For example, the following sample loops have O(n2) time complexity 

for (int i = 1; i <=n; i += c)
{
    for (int j = 1; j <=n; j += c)
    {
    // some O(1) expressions
    }
}

//++ Big O(log n)- ●	Time Complexity of a loop is considered as O(Log n) if the loop variables are divided/multiplied by a constant amount.
 
for (int i = 1; i <=n; i *= c)
{
// some O(1) expressions
}
 
        and
        
for (int i = n; i > 0; i /= c)
{
// some O(1) expressions
}

//Note- ●	Binary Search has O(log n) time complexity.

//++ BigO (log(log n))- ●Time Complexity of a loop is considered as O(log(log n)) if the loop variables are reduced/increased exponentially by a constant amount.

//●	Here c is a constant greater than 1

for (int i = 2; i <=n; i = pow(i, c))
{
// some O(1) expressions
}

●	Here fun is sqrt or cuberoot or any other constant root

for (int i = n; i > 1; i = fun(i))
{
// some O(1) expressions
}

//++ BigO (n log n)- ●	Time Complexity of a loop is considered as O(n log n) if the inner loop variables are divided/multiplied by a constant amount and outer loop is
//                      executed for n times.


function(int n)
{
for( i = 1 ; i <= n ; i + + )
for( j = 1 ; j <= n ; j * = 2 ) 
print( “*” ) ;
}

**********************************************************************************************************************************************************************
/*+ Apni kaksha

Time Complexity

Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input.
Types of notations:

1. O-notation: It is used to denote asymptotic upper bound. For a given function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of
n”. It also known as worst case time complexity as it denotes the upper bound in which algorithm terminates.

2. Ω-notation: It is used to denote asymptotic lower bound. For a given function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of
g of n”. It also known as best case time complexity as it denotes the lower bound in which algorithm terminates.

3. Θ-notation: It is used to denote the average time of a program.

****Important Note***
a. Best case - Suppose koi array h jisme linear search krna h like- 2,5,7,9,6,1
   iske 2 search krna h, best case ye hoga ki suru m hi mil jaye, mtlb best case ye hua ki koi element jo search krna h vo suru m mil jaye iska mtlb content baat hui ki
   bhai suru m hi milega agar best case h to, iska mtlb constent baat hui to iski complexity Ω(1) hui kyuki best case ko omega Ω s denote krte h.

b. worst case ye hoga ki koi element last m mile yani k jitne element honge utni baar iterate krna pdega mtlb depends on size n, to complexity O(n) hogi kyuki worst
   case ko O s denote krte h.
   
c. Average case- average case mtlb chances of comparison devided by no of cases. mtlb-> ho sakta h koi element 1 psotion pe mile ho sakta h 2 pe ho sakta h 3 pe and
                 so on......
                 (1+2+3+4+....+n)/n = [n(n+1)/2]/n = (n+1)/2  to complexity hui theta θ(n) kyuki value ya constent ko hm neglect krte h. */
 
            
for (int i = 1; i <= n; ++i) {
  a=a+1;
}                                // to yha per do loop h uper vale ki complexity n hoga and neche vale ki m to complete complexity O(n+m) hogi.
 
  for(int j = 1; j <=m; ++j) {
    a=a+1;
  }
                 
// 2nd example

for (int i = 1; i <= n; ++i) {
  for(int j = 1; j <=m; ++j) {
    a=a+rand();                  // iski TC hogi Big O(nm).
  }
}
 
//3rd example
for (int i = 1; i <= n; ++i) {
  for(int j = 1; j <=m; ++j) {
    a=a+rand();                  // iski TC hogi Big O(nm+n)
  }
}
for (int i = 1; i <= n; ++i) {
  a=a+1;
}    
            
 /* How to comapre 2 algorithms
           n                   log n
 n=1->     1 unit time         0, coz log1 means o                        //logb 1 = 0, logb b = 1
 n=2->     2                   1, coz log 2 base 2 means 1
 n=1024->  1024                10,  coz log 2^10 base 2
 */

****************************************************************************************************************************************************************
// For Practice
// https://www.tutorialspoint.com/practice-questions-on-time-complexity-analysis-in-cplusplus
// https://www.geeksforgeeks.org/practice-questions-time-complexity-analysis/




