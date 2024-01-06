public class Arrays{
    public static void main(String args[]){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {-1,0,1,2,-1,-4};
        threeDigitPairs(a2);
        // System.out.println(isDuplicate(a1));
    }

    public static void threeDigitPairs(int[] a){
        int n = a.length;
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(i!=j && i!=k && j!=k && (a[i]+a[j]+a[k]) == 0)
                    {
                            System.out.print(a[i]+ "" + a[j] +""+ a[k] + " ");
                    }
                }
            } 
            // System.out.println();           
        }
    }

    public static boolean isDuplicate(int[] a){
        int n = a.length;
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArray(int[] a){
        int n = a.length;
        for(int i=0; i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}