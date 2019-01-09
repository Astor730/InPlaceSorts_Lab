public class InPlaceSorts
{
    public static void selectionSort(int[] arr)
    {
        int minPos=0;
        int minVal=0;
        for( int curPos = 0;curPos<arr.length-1; curPos++)
        {
            minPos = curPos;
            minVal = arr[curPos];
            for(int i =0; i<arr.length;i++)
            {
                if(minVal>arr[i])
                {
                    minVal=arr[i];
                    minPos=i;
                }
                swap(arr,arr[curPos],arr[minPos]);
            }
        }
    }
}









































        public static void swap(int[]arr,int i, int j){
            int a = arr[j];
            int b = arr[i];
            arr[j] = b;
            arr[i] = a;
        }

        public static void bubleswap(int [ ] arr){
            boolean confirm = false;
            while(confirm != true){
                confirm = true;
                for(int i=0; i <arr.length-1;i++){
                    if(arr[i] < arr[i+1]){
                    }
                    if(arr[i] > arr[i+1]){
                        swap(arr,i,i+1);
                        confirm = false;
                    }
                }
            }
        }
        public static boolean checkSum(int [] before,int []after){
            int w = 0;
            for(int i =0 ; i < before.length;i++){
                w += before[i];
            }
            int z = 0;
            for(int n = 0; n < after.length;n++){
                z += after[n];
            }
            if (w != z){
                return false;
            }
            return true;
        }
        public static boolean sortCheck(int [] arr){
            boolean inOrder = true;
            for (int i = 0; i < arr.length; i ++){
                if( arr[i] > arr[i+1]){
                    inOrder = false;
                }
            }
            return inOrder;
        }
    }

