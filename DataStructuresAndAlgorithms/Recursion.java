public class Recursion{

    public static void main(String args[]){
        System.out.println("Hello Recursion!");
        // printInc(10);
        //System.out.println("Factorial = " + factorial(15));
        //  System.out.println("Sum = " + sum(5));
        // System.out.println("Fibonacci = " + fibonacci(8));
        // fibonacciSeries(15);
        // int myArray[] = {2,3,4,6,7};
        // System.out.println(findElement(myArray,0,7));
        // int myArray1[] = {2,3,4,6,7,2,5,6,2,7,8,9,1};
        // System.out.println(findLasOccurence(myArray1,0,2));
        // System.out.println("power value is " + calcPower(2,3));
        // System.out.println("No of ways = "+tilingProblem(7));
        // StringBuilder sb = new StringBuilder();
        // System.out.println("new string = "+ removeDuplicates("aappnnacollegecollege",sb,0));
         printCombinations("","");
        // String ansStr = "234";
        // String ansStr2 = ansStr.substring(2);
        // System.out.println("String = "+ansStr2);
        
    } 
    static String[] codes = {"","", "abc","def", "ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printCombinations(String str, String ansStr){
        //Base condition
        if(str.length()==0){
            System.out.print(ansStr + " ");
            return;
        }
        //recursion
        int key = str.charAt(0) - '0'; //int 2 3
        String newStr = str.substring(1);// 34
        for(int i=0; i<codes[key].length(); i++){
            String currChar=Character.toString(codes[key].charAt(i)); //a e
            printCombinations(newStr, ansStr+currChar);
        }

    }

    static int[] a = new int[25];
    public static StringBuilder removeDuplicates(String str,StringBuilder ansStr, int index){
        //base condition
        if(index == str.length()){
            System.out.println("New string without duplicate is = "+ansStr);
            return ansStr;
        }
        //recursion
        char ch = str.charAt(index);
        
        if(a[ch-'a'] != -1){
            ansStr.append(ch);
            a[ch-'a'] = -1;
        }

        return removeDuplicates(str, ansStr, index+1);
        
    }
    // static int v = 0, h = 0;
    public static int tilingProblem(int n){
        if(n<=1){
            return 1;
        }
        //vertical choice
        // System.out.println("No of Vertical ways = "+v);
        int v = tilingProblem(n-1);

        // System.out.println("No of Horizontal ways = "+h);
        //horizontal choice 
        int h = tilingProblem(n-2);
        

        return v+h;
    }

    public static int powerOfX = 0, counter = 0;
    // #region calculate x^n 
    public static int calcPower(int x, int pow){
        if(pow==0){
            return 1;
        }
        for(int i=0; i<2; i++){ //0 1
            counter++;
            System.out.println("Inside for loop before recursion = " + i);
            System.out.println("Inside for loop before recursion power of x value= " + powerOfX); 
            System.out.println("Inside for loop before recursion power value= " + pow);
            System.out.println("---------------------------------------------------------------------");
            powerOfX = x * calcPower(x, pow-1);  // pow of x =0  2          pow = 3 2 1 
            System.out.println("Inside for loop after recursion = " + i); //0
            System.out.println("Inside for loop after recursion power of x value= " + powerOfX); //2
            System.out.println("=======================================================================");
        }
        // System.out.println("Outside for loop counter = " +counter);
        // System.out.println("before recursion power of x value= " + powerOfX);
        // System.out.println("before recursion power value= " + pow);
        // powerOfX = x* calcPower(x, pow-1);
        // System.out.println("after recursion power of x value= " + powerOfX);
        System.out.println("Counter value = " + counter);
        return powerOfX;
    }
    // #endregion

    // #region find last occurance of an element in an array 
    public static int findLasOccurence(int[] a, int i, int key){
        if(i==a.length){
            return -1;
        }

        int isFound = findLasOccurence(a, i+1, key);
        if(isFound == -1 && key==a[i]){
            System.out.println("recursion if count = " +i);  
            return i;
        }
        return isFound;
    }
    // #endregion


    // #region find first occurance of an element in an array 
    public static int findElement(int[] a,int i, int key){
        if(i==a.length){
            return -1;
        }

        if(key==a[i]){  
             return i;
        }
        return findElement(a, i+1, key);
    }
    // #endregion

    // #region check if array is sorted or not 
    public static boolean isSorted(int[] a, int i){
        if(i==a.length-1){
            return true;
        }

        if(a[i]>a[i+1]){  
             return false;
        }
        return isSorted(a, i+1);
    }
    // #endregion

    // #region print fibonacci series for given n 
    public static void fibonacciSeries(int n){
        int prev=0; int succ=1; int temp = 0;
        int numb = fibonacci(n);
        while(prev<=numb){
            System.out.print(prev + " ");
            temp = succ;
            succ = succ+prev;
            prev = temp;
            
        }
    
    }
    // #endregion


    // #region find nth fibonacci number
    public static int fibonacci(int n){
        if(n==1 ||n == 0){
            return n;
        }
        // System.out.println(fib_n);
        int fib_n = fibonacci(n-1) + fibonacci(n-2);
        
        return fib_n;
    }
    // #endregion

    // #region print sum of n natural numbers
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    // #endregion

    // #region print 1 to n in increasing order
    public static int factorial(int n){
        if(n==0){
            return 0;
        }
        return n*factorial(n-1);
    }
    // #endregion
    
    // #region print 1 to n in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
        
    }
    // #endregion

    //#region print n to 1 in decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    //#endregion
}