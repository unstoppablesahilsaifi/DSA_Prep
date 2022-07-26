//From  Anuj Bhaiyaa Channel
/* Recursion in 3 steps | Recursion Algorithms Basics - Part 1 |
When a function calls itself that is recusrion */

ex- 1.  void printhello() {
    2.      print("Sahil");               // Output m infinte time Sahil print hoga kyuki line 2 s Sahil print ho jayga or line 3 per jayga to ye khud ko call krega to
    3.      print();                      // fir Sahil print hoga or aise hi print krta rhega.
    4.      }

// what if we need to print as per user inout times.
ex-   void printhello(int n) {
             if(n==0)
             {
                 return;
             }
          print("Sahil");          // Is case m kya hoga ki user s input ja rha h 5, to function m 5 jayga, check krega ki 5=0 h ya nhi, agar h to vha s hi exit ho jayga
          print(n-1);              // agar nahi h to Sahil print hoga and user ka input 5 h na, to function 5-1 mtlb ki 4 k parameter ka sath khud ko call krega 
          }                        // isi tarah 5 baar sahil print ho jayga and jab n=0 ho jayga to programm exit ho jayga

void main()
{
  printhello(5);
}
