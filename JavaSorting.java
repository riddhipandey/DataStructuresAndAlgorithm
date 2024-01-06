public class JavaSorting{
    public static void main(String args[]){
        System.out.println("Hello Sorting");
        System.out.println(5&7);
        System.out.println(5|7);

        // BubbleSort();
    }

    public static void BubbleSort(){
        int a[] = {5,4,1,3,2};
        int temp=0;int counter=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                counter++;
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
            
        }
        System.out.print("Counter="+counter);
    }
}