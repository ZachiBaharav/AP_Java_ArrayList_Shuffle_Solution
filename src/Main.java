/*

ArrayList  class

java.utilArrayList
Two main advantages over arrays:
1. Size: Can grow and shrink
2. Useful methods: Insert, remove

Cost: memory, time.


Methods:
You do NOT use the [] to index elements.
 get(index)
 set(index) = newElement
 add(index, newElement)
 add(newElement)
 size()
 remove(index)
 

Note: 
Array     ==>  a.length    final public instance variable
ArrayList ==>  a.size()    method
String    ==>  a.length()  method

Important: Only on Object
ArrayList<Type>: Introduced from 2004 to Java.

byte ->Byte
boolean -> Boolean
double -> Double
float -> Float
===
int -> Integer
char -> Character

auto-boxing, unboxing  (aka wrapping, unwrapping)

NOTE:
Maximum size:    get(int index)
==> int is signed 32 bits ==> 2^31-1 is max value ==> 2,147,483,647

*/
import java.util.ArrayList ;

public class Main {


    static public void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<Integer>() ;
        
        final int N = 20;
        // Can also define array-size here: Initial capacity
        // ArrayList<Integer> A = new ArrayList<Integer>(N) ;        
        
        // fill in the array
        fillArray(A,N);
        
        for (int ii=1; ii<=N+5; ++ii)
            System.out.println(ii + ": " + getNextItem(A));
    }


    static void fillArray(ArrayList<Integer> A, int N)
    {
        // ToDo: Fills the array starting from 1 and up.
        // A[0] = 1
        // A[1] = 2
        // etc.., All the way to the length of the array.
    
        // Your code here
        for (int ii=0; ii<N ; ++ii)
            A.add(ii+1);

        // A.set(30,5);        // OutOfBounds exception. Accesing unavailable location.
    }        

    

    // ToDo: 
    // The function getNextItem() returns a random number from the array, with the following
    // limitations:
    // 1. If it was called more then A.size() times, it return 0.
    // 2. Otherwise, it returns one number from the array, but with NO repeat.
    // Note 1: The array A can be modified in your function.
    

    static public int getNextItem(ArrayList<Integer> A)
    {        
        
        // Your code here
        // return 0 ;
        if (A.size() ==0 )
            return 0;
        
        int idx = (int)(Math.random()*A.size());
        // the chosen number!
        int out = A.get(idx);
        A.remove(idx);

        return out;
    }
    
    
}


// Two example outputs, N=20
/*

Output 1:

1: 18
2: 8
3: 10
4: 1
5: 6
6: 15
7: 14
8: 5
9: 2
10: 3
11: 20
12: 7
13: 11
14: 17
15: 4
16: 13
17: 12
18: 16
19: 19
20: 9
21: 0
22: 0
23: 0
24: 0
25: 0


Output 2:

1: 10
2: 16
3: 8
4: 13
5: 3
6: 7
7: 15
8: 1
9: 2
10: 6
11: 11
12: 18
13: 19
14: 20
15: 12
16: 14
17: 9
18: 4
19: 17
20: 5
21: 0
22: 0
23: 0
24: 0
25: 0


*/