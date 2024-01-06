import java.util.*;

class BasicPrograms{
    static int counter = 0;
    public static void main(String args[]){
        System.out.println("Hello Basic Programs!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        // System.out.println(isPrime(n));
        // System.out.println("Counter : "+counter);
    }

    //#region sumOfDigits
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum= sum+(num%10);
            num = num/10;
        }
        System.out.println(sum);
        return sum;
    }
    //#endregion

    //#region isPalindrome
    public static boolean isPalindrome(int num){
        int reverseNum=0, originalNumber=num;
        while(num>0){
            reverseNum= reverseNum*10+(num%10);
            num = num/10;
        }
        System.out.println(reverseNum);
        if(reverseNum==originalNumber){
            return true;
        }
        else{
            return false;
        }
    }
    //#endregion

    //#region isEven
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    //#endregion

    //#region DecimalToBinary
    public static int decimalToBinary(int decimalNum){
        int pow=0, binaryNum=0;
        while(decimalNum>0){
            binaryNum+= (decimalNum%2)*Math.pow(10,pow);
            pow++;
            decimalNum=decimalNum/2;
        }
        return binaryNum;
    }
    //#endregion

    //#region BinaryToDecimal
    public static int binaryToDecimal(int binaryNum){
        int pow=0, decimalNum=0;
        while(binaryNum>0){
            decimalNum+= (binaryNum%10)*Math.pow(2,pow);
            pow++;
            binaryNum = binaryNum/10;
        }
        return decimalNum;
    }
    //#endregion

    //#region Prime in a Range 
    public static void primeInRange(int n){ 
        for(int i=2;i<=n; i++){ // sqroot for optimized approach
            if(isPrime(i)){
                System.out.print(i+", ");
            }      
        }
    }
    //#endregion

    //#region isPrime
    //only for n>=2
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }  
        else{
            for(int i=2;i<=Math.sqrt(n); i++){ // sqroot for optimized approach
                  counter++;  
                if(n%i==0){
                    return false;
                }      
            }
        }
        return true;

    }
    //#endregion
}