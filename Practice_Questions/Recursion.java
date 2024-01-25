public class Recursion{
    public static void main(String args[]){
    //    System.out.println("Sum is = "+sumOfDigits(12456)); 
    //    System.out.println("Reversed String is = "+reverseString("Riddhi","")); 
    // String str = "RiddhiihddiR";
    // System.out.println("String is = "+isPalindrome(str,0,str.length()-1)); 
    // int[] a = {1,2,3,4,6};
    // System.out.println("Sum is = "+sumOfArrayElement(a, 0)); 
    // System.out.println("Right Position is = "+josephus(7,3)); 
    // genBalancedParantheses("",4,4);
    // subsequenceStrings("abc", "");
    // String[] codes = {"","","abc","def","ghi",""};
    // letterCombinations(codes, "234", "");
    // printPermutations("ABC", "");
    System.out.println("Possible pieces are = "+ropeCutting(15,16,8,7)); 
    }

    //#region ropeCutting problem
    static int ropeCutting(int n, int a, int b, int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }

        int x = ropeCutting(n-a,a,b,c);
        int y = ropeCutting(n-b,a,b,c);
        int z = ropeCutting(n-c,a,b,c);
        

        return Math.max(x,Math.max(y,z))+1;
    }
    //#endregion


    //#region print permutations of String ABC
    static void printPermutations(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        // System.out.println("I value outside=  " +index + "   STR Length = "+ str.length());
        // System.out.println("------------------------------------------------------------");
        for(int i =0; i<str.length(); i++){
            // System.out.println("I value inside =  " +i + "   STR Length = "+ str.length());
            char ch = str.charAt(i); // i==0, A  b
            String newStr = str.substring(0,i) + str.substring(i+1); // BC c
            printPermutations(newStr, ans+ch);
        }
    }
    //#endregion


    //#region Generate letter combinations of phone no
    static void letterCombinations(String[] codes, String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        int key = Character.getNumericValue(str.charAt(0)); //2 from 234
        String newString = str.substring(1); // remaining is 34 from 234
        for(int i = 0; i<codes[key].length(); i++){
            letterCombinations(codes, newString, ans + (codes[key].charAt(i))); // ans = ; //a from abc
        }
    }
    //#endregion


    //#region Generate subSequence of string
    static void subsequenceStrings(String str, String ans){
        if(str.length() == 0){
            if(ans==""){
                System.out.print("null");
            }else{
                System.out.print(ans + " ");
            }
            return;
        }
        char ch = str.charAt(0);
        subsequenceStrings(str.substring(1), ans+ch);
        subsequenceStrings(str.substring(1), ans);
    }
    //#endregion


    //#region Generate balanced paranthses
    static void genBalancedParantheses(String str, int O, int C){
        if(O==0 && C==0){
            System.out.print(str + " ");
        }
        if(O==C){
            genBalancedParantheses(str+"(", O-1,C);
        }else{
            if(O<C && O>0)
            genBalancedParantheses(str+"(", O-1,C);
            if(C>O && C>0)
            genBalancedParantheses(str+")", O,C-1);
        }
    }
    //#endregion


    //#region reverse a string
    static int josephus(int n, int k){
        if(n==1){
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
    //#endregion

    //#region reverse a string
    static int sumOfArrayElement(int[] a, int i){
        if(i > a.length-1){
            return 0;
        }
        return a[i]+sumOfArrayElement(a, i+1);
    }
    //#endregion

    //#region reverse a string
    static boolean isPalindrome(String str, int i, int l){
        if(i>=l){
            return true;
        }
        if(str.charAt(i) != str.charAt(l)){
            return false;
        } 
        return isPalindrome(str, i+1, l-1);
    }
    //#endregion

    //#region reverse a string
    static String reverseString(String str, String rev){
        if(str.length()==0){
            return rev;
        }
        return reverseString(str.substring(1),str.charAt(0)+rev);
    }
    //#endregion

    //#region sum of all digit
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        //  ;
        // sum = sum + (n%10);
        // System.out.println(sum);
        return sumOfDigits(n/10) + (n%10);
    }
    //#endregion
}