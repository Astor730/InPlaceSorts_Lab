public class Runner
{
    public static void main(String[] args){
        //Create a random array of integers,double and strings
         int[] intBefore = InPlaceSorts.randInt(10);

         double[] doubleBefore = InPlaceSorts.randDouble(10);

         String[] stringBefore = InPlaceSorts.randomStringArr(10,10);

        //Prints out array of integers out before you sort
        System.out.println("This is your list of integers");
        System.out.println("Before: ");
        for (int num:intBefore)
        {
            System.out.println(num+" ");
        }
        System.out.println();

        //Sort Calls the insertion sort
        InPlaceSorts.insertionSort(intBefore);

        //Prints integer array out after you sort
        System.out.println("After: ");
        for (int num:intBefore)
        {
            System.out.println(num+" ");
        }
        System.out.println();

        //Prints out array of doubles before we sort.
        System.out.println("This is your list of doubles");
        System.out.println("Before: ");
        for (double num1:doubleBefore)
        {
            System.out.println(num1+" ");
        }
        System.out.println();

        //Sort Calls the insertion sort
        InPlaceSorts.selectionSort(doubleBefore);

        //Prints double array out after you sort
        System.out.println("After: ");
        for (double num1:doubleBefore)
        {
            System.out.println(num1+" ");
        }
        System.out.println();

        //Prints out array of doubles before we sort.
        System.out.println("This is your list of doubles");
        System.out.println("Before: ");
        for (String num2:stringBefore)
        {
            System.out.println(num2+" ");
        }
        System.out.println();

        //Sort Calls the insertion sort
        InPlaceSorts.bubleSort(stringBefore);

        //Prints double array out after you sort
        System.out.println("After: ");
        for (String num2:stringBefore)
        {
            System.out.println(num2+" ");
        }
        System.out.println();
    }
}
