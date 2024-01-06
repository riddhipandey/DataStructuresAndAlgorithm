class Arrays{
    public static void main(String args[]){
        System.out.println("Hello Arrays!");
        int myArray[] = {2,4,6,8,10}; 
        int myArrayTemp[] = {1,-2,6,-1,3}; 
        int kadane[] = {-2,-3,4,-1,-2,1,5,-3}; 
        int height[] = {4,2,0,6,3,2,5}; 
        int prices[] = {7,1,5,3,6,4}; 
        // int arrayLength = myArray.length; 
        // Scanner sc = new Scanner(System.in);
        // int index = binarySearch(myArray,10);
        // System.out.println(index);
        // if(index!=-1){
        //     System.out.println("key found at index " +index);
        // }
        // else{
        //     System.out.println("key not found");
        // }
        // int a[] = {2,4,6,8,10,12,14,16};
        // System.out.println("SMallest Number is : "+largestOrSmallestNumber(myArray,'s'));
        // System.out.println("Largest Number is : "+largestOrSmallestNumber(myArray,'l'));

        //printPairs(myArray);
        // reverseArray(myArray);
        // KadanesAlgo(kadane);
        // trappedRainWater(height);
        buyOrSell(prices);


    }

    //#region Buy or Sell stocks
    public static void buyOrSell(int[] a){
        int n = a.length; int currentP=0; int maxP = Integer.MIN_VALUE;
        int buyP=a[0], sellP=a[1];
        for (var i = 1; i < n-1; i++) {
            //Calculate Buy Price
            if(buyP>sellP)  {
                buyP = sellP;
            }
            //Calculate Sell Price
            if(sellP<a[i+1]){
                sellP=a[i+1];
            }
            //Calculate max profit
            currentP = sellP-buyP;
            if(maxP<currentP){
                maxP=currentP;
            }
        }
       System.out.println("Maximum Profit : " + maxP);
    }
    //#endregion


    //#region trapped Rain water
    public static void trappedRainWater(int[] a){
        int n=a.length;
        int leftArray[] = new int[n];
        int rightArray[] = new int[n];
        // int maxLeft =a[0]; int maxRight =a[n-1];

        //LeftSubArray Max
        leftArray[0] = a[0];
        for(int i=1;i<n;i++){
            if(leftArray[i-1]<a[i]){
                leftArray[i]=a[i];
            }else{
                leftArray[i] = leftArray[i-1];
            }
        }

        //RightSubArray Max
        rightArray[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(rightArray[i+1]<a[i]){
                rightArray[i]=a[i];
            }else{
                rightArray[i]=rightArray[i+1];
            }
        }

        //Calculate water trapped
        int trappedWater=0;int waterLevel=0;
        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(leftArray[i],rightArray[i]);
            trappedWater = trappedWater + (waterLevel - a[i]);
            
        }
        System.out.println("Trapped Water = "+trappedWater);
        
        for (int i = 0; i < n; i++) {
            System.out.print(leftArray[i] + " ");
            
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(rightArray[i] + " ");
            
        }
        
    }
    //#endregion


    //#region Kadane's Algorithm
    public static void KadanesAlgo(int[] a){
        int n = a.length; int currentSum=0; int maxSum = Integer.MIN_VALUE;
        for (var i = 0; i < n; i++) {
            currentSum += a[i];
            if(currentSum<0){
                currentSum = 0;
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }   
        }
       System.out.println("Maximum Sum : " + maxSum);
    }
    //#endregion

    //#region print subStrings in an array
    public static void subStringSum_prefixArray(int[] a){
        int n = a.length; int sum =0;int largestSum = Integer.MIN_VALUE;
        int[] prefixArray = new int [n];
        prefixArray[0] = a[0];
        for(int i=1; i<n; i++){
            prefixArray[i] = prefixArray[i-1] + a[i];
        }
        for(int i=0; i<n; i++){
            sum = 0;
            for(int j=i; j<n; j++){
                sum = i== 0 ? prefixArray[j] : (prefixArray[j]-prefixArray[i-1]);
                System.out.println("Substring sum : " +sum);
            }
            System.out.println(sum);
            if(largestSum<sum){
                largestSum = sum;
            }
        }
        System.out.println("Largest Sum = "+largestSum);

        for (int i = 0; i < n; i++) {
            System.out.print(prefixArray[i] + " ");
            
        }
    }

    //#region print subStrings in an array
    public static void subStrings(int[] a){
        int length=a.length;int sum =0, largestSum=Integer.MIN_VALUE, smallestSum = Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            for(int j=i; j<length; j++){
                sum=0;
                System.out.print("{");
                    for(int k=i;k<=j;k++){
                        System.out.print(a[k]+",");
                        sum += a[k];
                    }
                System.out.print("  |" + sum + "}");
                if(largestSum<sum){
                    largestSum=sum;
                }
                if(smallestSum>sum){
                    smallestSum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Largest Sum = "+largestSum);
        System.out.println("Smallest Sum = "+smallestSum);
    }
    //#endregion

    //#region print pairs in an array
    public static void printPairs(int[] a){
        int length=a.length;
        for(int i=0;i<length;i++){
            for(int j=i+1; j<length; j++){
                System.out.print("(" + a[i]+ "," + a[j] + ")");
            }
            System.out.println();
        }
    }
    //#endregion

    //#region reverse an array
    public static void reverseArray(int[] a){
        int start=0; int end = a.length-1; int temp = 0;
        while(start<end){
            temp=a[start];
            a[start] = a[end];
            a[end]=temp;
            start++; end--;
        }
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    //#endregion

    //#region binary search in array
    public static int binarySearch(int[] a,int key){
        int start=0; int end = a.length-1; int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(key==a[mid]){
                return mid;
            }else if(key<a[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    //#endregion

    //#region largest and smallest number in array
    public static int largestOrSmallestNumber(int[] a,char ch){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        if(ch =='l'){
            return largest;
        }else if(ch == 's'){
            return smallest;
        }
        else{
            return -1;
        }
            
    }
    //#endregion

    //#region linear search in array
    public static int linearSearch(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                return i;
            }
        }
        return -1;
    }
    //#endregion
}