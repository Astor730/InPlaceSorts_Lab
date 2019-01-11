public class Runner
{
    public static void main(String[] args){
        //Create a random array of integers
         int[] intBefore = InPlaceSorts.randInt(10);

         double[] doubleBefore = InPlaceSorts.randDouble(10);

        //Prints out array of integers out before you sort
        System.out.println("This is your list of integers");
        System.out.println("Before: ");
        for (int num:intBefore)
        {
            System.out.println(num+" ");
        }
        System.out.println();

        //Sort a String using swap and bubble swap
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

        //Prints double array out after ypu sort
        System.out.println("After: ");
        for (double num1:doubleBefore)
        {
            System.out.println(num1+" ");
        }
        System.out.println();


    }
}
