import java.util.*;

class VariablesAndDataTypes{
    public static void main(String args[]){
        System.out.println("Hello Variables and Data Types!");
        Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c = sc.nextInt();

        // System.out.println(avgOfNumbers(a,b,c));

        // System.out.println("Enter side of Square");
        // int side = sc.nextInt();
        // System.out.println(areaOfSquare(side));

        // System.out.println("Enter Pencil Price");
        // float pencilP = sc.nextFloat();
        // System.out.println("Enter Pen Price");
        // float penP = sc.nextFloat();
        // System.out.println("Enter Eraser Price");
        // float eraserP = sc.nextFloat();
        // System.out.println("Total Bill is : "+calculateBill(pencilP,penP,eraserP));
        int $ = 15;
        guessDataType();
    }

    public static void guessDataType(){
        byte b = 4;
        char c='a';
        short s = 512;
        int i=1000;
        float f= 3.14f;
        double d=99.97;
        
        double result = (f*b)+(i%c)-(d*s); 
        System.out.println(result);
    }
    public static float calculateBill(float pencilP, float penP, float eraserP){
        float totalBill = pencilP+penP+eraserP;
        float totalBillWithGST =totalBill + (totalBill*18)/100;
        return totalBillWithGST;
    }

    public static int areaOfSquare(int side){
        int area = (side*side);
        return area;
    }

    public static float avgOfNumbers(int a, int b, int c){
        float avg=(a+b+c)/3f;
        return avg;
    }
}