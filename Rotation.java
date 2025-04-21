## logic is simple  by creating temp array 


static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=n%d;// handling case if d>n;
        int[] temp=new int[n]; // creating  an temp array of size arr
        for(int i=0;i<n-d;i++){ // stored element of arr in temp[] from dth postion
            temp[i]=arr[d+i];   
        }
        for(int i=0;i<d;i++){ // now storing  starting element till to dth pos in temp 
            temp[n-d+i]=arr[i];
        }
        for(int i=0;i<n;i++){ //then copying the element temp to arr
            arr[i]=temp[i];
        }
        // add your code here
    }
