import java.util.*;

class Patterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = sc.nextInt();
        // System.out.println("Enter no of cols");
        // int m = sc.nextInt();
        diamond(n);
    }
    //#region diamond
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+i-1; j++){
                if(j>=n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n+i-1; j++){
                if(j>=n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //#endregion

    //#region hollowRhombus
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            // for(int j=1; j<=n-i; j++){
            //     System.out.print("  ");
            // }
            for(int j=1; j<=(2*n-i); j++){
                if((i==1 && j>n-i+1)||i==n||j==n-i+1||j==(2*n-i)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //#endregion

    //#region solidRhombus
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n-i); j++){
                if(j>=n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //#endregion

    //#region butterfly
    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i<=n/2){
                    if(j<=i || j>= n-i+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j<=n-i+1 || j>= i){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                }
                
            }
            System.out.println();
        }
    }
    //#endregion

    //#region FloyedsTriangle
    public static void zeroAndOneTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
    //#endregion

    //#region FloyedsTriangle
    public static void FloyedsTriangle(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    //#endregion

    //#region invertedHalfPyramidNumber
    public static void invertedHalfPyramidNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //#endregion

    //#region invertedHalfPyramid
    public static void invertedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=(n-i+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //#endregion


    //#region HollowRectangle
    public static void hollowRectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //#endregion


    //#region 1st Pattern(HalfPyramidCharacter)
    
    public static void HalfPyramidCharacter(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    //#endregion
    //#region 1st Pattern(HalfPyramid)
    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //#region 1st Pattern(InvertedStarOrQuarterRhombush)
    public static void InvertedStarOrQuarterRhombush(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //#endregion

    //#region 1st Pattern(quarterRhombush)
    public static void starOrQuarterRhombush(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //#endregion
}