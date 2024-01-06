import java.util.*;

public class JavaBasics{

    //#region Pattern
    public static void HollowPattern(){
        // int num = 0, div = 2;
       // System.out.println("Enter number");
       // num = sc.nextInt();
       // char patternChar = 'A';
       int row = 8, col=10;

       for(int line = 1; line <=row ; line++){
           for(int pattern=1; pattern<=col; pattern++){
               if(line ==1 || pattern == 1 || line == row || pattern == col)
                   System.out.print("*");
               else
               System.out.print(" ");
               // patternChar++;
           }
           System.out.println();
       }
       
   } 
   public static void StarPattern(){
    int row = 4, col = 4, num = 7;

    for(int i = 1; i<=num; i++){
        for(int j=1;j<=num;j++){
            if(j>=num+1-i){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

   } 
   public static void NumberPattern(){
    int row = 4, col = 4, num = 7;

    for(int i = 1; i<=num; i++){
        for(int j=1;j<=num+1-i;j++){
            System.out.print(j);
            // if(j>=num+1-i){
                
            // }
            // else{
            //     System.out.print(" ");
            // }
        }
        System.out.println();
    }

   }
   public static void FloyedsTriangle(){
    int row = 5, col = 4, num = 1;

    for(int i = 1; i<=row; i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0)
                System.out.print(1);
            else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
   }

   public static void ButterFly(){
        int row = 10, col = 4, num = 1;

        for(int i = 1; i<=row; i++){
            for(int j = 1; j <= row; j++){
                if(i<=(row/2)){
                    if(j<=i || j>= row-i+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else{
                    if(j<=row-i+1 || j>= i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        
   }

   public static void Solid_Rhombus(){
    int n=10;
    for(int i=1;i<=n;i++){
        for(int j = 1;j<=(2*n)-i;j++){
            if(j>=(n-i+1))
                System.out.print("* ");
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }


   }

   public static void Diamond(){
    int n =4;
    for(int i=1;i<=n;i++){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n;i>=1;i--){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }


   //#endregion

   public static void main(String args[]){
    Diamond();

    // System.out.print("Hello Riddhi!");

    // Scanner sc = new Scanner(System.in);
    // HollowPattern();
    //#region code

    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // System.out.println(a+b);
    // System.out.println(a*b);

    // System.out.println("Enter Income in Lacs");
    // int Income = sc.nextInt();
    // int Tax = 0;

    // if(Income<=5)
    //     System.out.println("Tax = " + (Income*0));
    // else if(Income>5 && Income <=10){
    //     System.out.println("Tax 10% \n" + (Income*0.2));
    // }
    // else{
    //     System.out.println("Tax 20% \n" + (Income*0.3));
    // }
    // float area = 3.14f*r*r;
    // System.out.println("Area = "+area);

    //#endregion 
        //#region greatest Number
        // System.out.println("Enter three numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a>b && a>c)
        //     System.out.println("greatest number = "+a);
        // else if(b>c){
        //     System.out.println("greatest number = "+b);
        // }
        // else{
        //     System.out.println("greatest number = "+c); 
        // }
        //#endregion     
    //#region sum of natural number
    // System.out.println("Enter number");
    // int num = sc.nextInt();
    // int sum = 0, counter =1;
    // while(counter<num) {
    //     sum +=counter;
    //     counter++;
    // }
    // System.out.println("sum ="+sum);
    //#endregion

    //#region reverse number
    // System.out.println("Enter number");
    // int num = sc.nextInt();
    // int reverseNumber = 0,lastdigit;
    // while(num>0){
    //     lastdigit = num%10;
    //     reverseNumber = (reverseNumber*10) + lastdigit;
    //     num = num/10;
    // }
    // System.out.print("reverseNumber =" + reverseNumber);

    //#endregion
     
    //#region print number till its multiple of 10
     
    //  int num = 0;
    //  while(true){
    //     System.out.println("Enter number");
    //     num = sc.nextInt();
    //     if(num%10 == 0)
    //         continue;
    //     System.out.print(num);
    //  }
     //#endregion

    //#region number is prime or not
     
    // int num = 0, div = 2;
    //    System.out.println("Enter number");
    //    num = sc.nextInt();
    //     while(num%div != 0 && div<=Math.sqrt(num)){
    //         div++;
    //     }
    //     if(div<num){
    //         System.out.print(num + "Not a prime" + div);
    //     }else{
    //         System.out.print(num + "Prime" + div);
    //     }
    //#endregion
    
    
}
}