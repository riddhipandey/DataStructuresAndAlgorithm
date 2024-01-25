import java.util.*;
public class BackTracking{

    public static void main(String args[]){
        System.out.println("Hello Recursion and Backtracking!");
        // printPermutation("ABC", "");
        // int myArray[] = {6,3,9,5,2};
        // printArray(myArray); 
        // mergeSort(myArray,0,myArray.length-1);
        // printArray(myArray);
        // int maze[][] = {    { 1, 0, 0, 0 },
        //                     { 1, 1, 0, 1 },
        //                     { 0, 1, 0, 0 },
        //                     { 1, 1, 1, 1 } };
        // System.out.print("Total possible ways = " + ratInMaze(maze,0,0,3));
        List<String> lst = new ArrayList<>();
        lst = paranthsesCombination("", 1,1, lst);
        for (var key : lst) {
            System.out.print(key + " ");
        }
    
    }
    public static List<String> paranthsesCombination(String str, int O, int C,List<String> lstStr){  
        if(O+C == 0){
            lstStr.add(str);
            return lstStr;
        }

        if(O==C){
            paranthsesCombination(str+"(", O-1, C,lstStr);
        }else{
            if(O>0)
            paranthsesCombination(str+"(", O-1, C,lstStr);
            if(C>0)
            paranthsesCombination(str+")", O, C-1,lstStr); 
        }

        return lstStr;
    }


    public static int ratInMaze(int[][] a, int row, int col, int n){
        // System.out.println("Row = " + row + "Col = " + col);
        //Base Condition
        if(row == 2 || row < 0 || col== 2 || col < 0 ){
            return 1;
        }else if(row==3 || col == 3 || row == -1 || col == -1){
            return 0;
        }
        //Right choice
        int r = ratInMaze(a,row,col+1,n); 
        //Left choice
        // int l = ratInMaze(a,row,col-1,n);
        // //Up choice
        // int u = ratInMaze(a,row-1,col,n);
        //Down choice
         int   d = ratInMaze(a,row+1,col,n);
        return r+d;
    }

    static void mergeSort(int[] a, int si, int ei) {
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(a,si,mid); //left part
        mergeSort(a,mid+1,ei); //right part
        merge(a,si,mid,ei);
    }

    static void merge(int[] a,int si,int mid,int ei) {
        int[] temp = new int[ei-si+1];
        printArray(temp);
        System.out.println("si = " +si + " " + "mid = " +mid + " "+"ei = " +ei);
        int i = si; int j = mid+1; int k =0;
        while(i<=mid && j<= ei){
            if(a[i]<a[j]){
                temp[k] = a[i];
                i++;k++;
            }else{
                temp[k] = a[j];
                j++;k++;
            }
        }
        //left part
        while(i<=mid){
            temp[k++] = a[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = a[j++];
        }
        // // copy temp to original array
        for(k=0, i=si;k<temp.length;k++,i++){
            a[i] = temp[k];
            // System.out.println(temp[k]);
        }
    }
    
    //#region print  in an array
    public static void printArray(int[] a){
        int length=a.length;
        for(int i=0;i<length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    //#endregion



    public static void printPermutation(String str, String ansStr){
        if(str.length() == 0){
            System.out.println(ansStr);
            return;
        }
        for(int i=0;i<str.length(); i++){
            System.out.println("Inside before for loop = " + i);
            // System.out.println("Inside for loop before recursion power of x value= " + powerOfX); 
            char currtStr = str.charAt(i);
            // System.out.println("Inside for loop currentString at = " + i + currtStr);
            String newStr = str.substring(0,i) + str.substring(i+1);
            // System.out.println("Inside for loop new String at = " + i + newStr);
            printPermutation(newStr, ansStr+currtStr);
            System.out.println("Inside after for loop = " + i);
        }
    }
}