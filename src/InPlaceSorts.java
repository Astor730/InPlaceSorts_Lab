public class InPlaceSorts
{
    public static void selectionSort(double[] arr)
    {
        int minPos=0;
        for(int curPos = 0;curPos<arr.length-1; curPos++)
        {
            minPos = curPos;
            for(int i =curPos; i<arr.length;i++)
            {
                if(arr[minPos]>arr[i])
                {
                    minPos=i;
                }
                doubleSwap(arr,curPos,minPos);
            }
        }
    }
    public static void bubleSort(String [ ] arr){
        boolean confirm = false;
        while(confirm != true){
            confirm = true;
            for(int i=0; i <arr.length-1;i++){
                if(arr[i].compareTo(arr[i+1]) > 0){
                    stringSwap(arr,i,i+1);
                    confirm = false;
                }
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        for(int curCheck = 0; curCheck <arr.length-2;curCheck++)
        {
            if(arr[curCheck]>arr[curCheck+1])
            {
                for(int i =curCheck; i>=0;i--)
                {
                    if (arr[i] > arr[i+1])
                    { intSwap(arr,i,i+1);}
                }
            }
        }
    }
    public static void doubleSwap(double[] arr, int i,int j)
    {
        double a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void intSwap(int[] arr, int i, int j)
    {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void stringSwap(String[]arr,int i, int j){
        String a = arr[j];
        String b = arr[i];
        arr[j] = b;
        arr[i] = a;
    }
    public static double[] randDouble(int count)
    {
        double[] big = new double[count];
        for(int i = 0; i<big.length;i++)
        {
            big[i] = Math.random()*10001;
        }
        return big;
    }
    public static int[] randInt(int count)
    {
        int[] big = new int[count];
        for(int i = 0; i<big.length; i++)
        {
            big[i] = (int) (Math.random()*10001);
        }
        return big;
    }
    public static String[] randomStringArr(int num, int length){
        String [] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
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

