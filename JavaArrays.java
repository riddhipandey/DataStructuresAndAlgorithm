import java.util.*;

class JavaArrays{
    public static void main(String args[]){
        System.out.println("Hello Array!");
        // int index = BinarySearch(10);
        // if(index!=-1){
        //     System.out.println("Key Found at index" +index);
        // }else{
        //     System.out.println("Key not found");
        // }
        printSubArray();

    }
    public static void printSubArray(){
        int myArray[]={2,4,6,8,10,8}; int sum=0, largestSum=0,smallestSum=111110;
        for (var i = 0; i < myArray.length; i++) {
            for(int j=i;j<myArray.length;j++){
                System.out.print("{");
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(myArray[k]+",");
                    sum=sum+myArray[k];
                }
                if(largestSum<sum){
                    largestSum=sum;
                }
                if(smallestSum>sum){
                    smallestSum=sum;
                }
                System.out.print("|sum="+sum+"}");
                System.out.println();
            }  
            System.out.println(); 
        }
        System.out.println("largest="+largestSum+"|smallest="+smallestSum);
    }

    public static void pairArrayElements(){
        int myArray[]={2,4,6,8,10};
        for (var i = 0; i < myArray.length; i++) {
            for(int j=i+1;j<myArray.length;j++){
                System.out.print("("+myArray[i]+","+myArray[j]+")");
            }   
        }
    }

    public static void reverseArray(){
        int myArray[]={2,3,5,6,8,1,6,5,8,3,5,9};
        int start=0,end = myArray.length-1,temp=0;

        while(start<end){
            temp=myArray[start];
            myArray[start] = myArray[end];
            myArray[end]=temp;
            start++;end--;
        }

        for (var i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ",");
        }
    }

    public static int BinarySearch(int key){
        int myArray[] ={2,4,6,8,10,12,14,16,19};
        int start=0,end=myArray.length-1, mid=0;

        while(start<=end){
            mid=(start+end)/2;

            if(key==myArray[mid]){
                return mid;
            }
            else if(key>myArray[mid]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }

        // for(int i=0;i<myArray.length;i++){
        //     if(key==myArray[mid]){
        //         return mid;
        //     }
        //     else if(key>myArray[mid]){
        //         start=mid+1;
        //         mid=(start+end)/2;
        //     }
        //     else{
        //         end = mid-1;
        //         mid =(start+end)/2;
        //     }
        // }
        return -1;
    }

    public static void LargestNumber(){
        int myArray[] ={2,4,6,8,10,12,14,16,19};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (var i = 0; i < myArray.length; i++) {
            if(largest<myArray[i]){
                largest=myArray[i];
            }   
        }
        for (var i = 0; i < myArray.length; i++) {
            if(smallest>myArray[i]){
                smallest=myArray[i];
            }   
        }

        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
        
    }
}