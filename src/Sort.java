public class Sort {

    /*
        Sort arrays with selection sort.
        Olle Kaiser 03-19-18

        See Run.java or run Run.class to see examples on all the sorting methods!

        selSort(double[] or int[]), sort a number array with smallest > greatest
        selSortStringLength(String[]) sort a String array with String.length (smallest > greatest)
        selSortStringAlpha(String[]) sort a String array in alphabetical order.
     */

    public static void selSort(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            int foundElement = 0; /* Smallest element found through the search */
            int foundIndex = -1; /* Index of the element */
            for(int j = i; j < numbers.length; j++){
                /* Look for the smallest number in the array, from i (i.e position) */
                if(numbers[j] < foundElement || foundIndex < 0){
                    foundElement = numbers[j];
                    foundIndex = j;
                }
            }
            /* Check if the smallest element found is smaller than the current reference. */
            if(foundElement < numbers[i]){
                swap(numbers, foundIndex, i);
            }
        }
    }

    public static void selSort(double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            double foundElement = 0; /* Smallest element found through the search */
            int foundIndex = -1; /* Index of the element */
            for(int j = i; j < numbers.length; j++){
                /* Look for the smallest number in the array, from i (i.e position) */
                if(numbers[j] < foundElement || foundIndex < 0){
                    foundElement = numbers[j];
                    foundIndex = j;
                }
            }
            /* Check if the smallest element found is smaller than the current reference. */
            if(foundElement < numbers[i]){
                swap(numbers, foundIndex, i);
            }
        }
    }

    public static void selSortStringLength(String[] words){
        for(int i = 0; i < words.length; i++){
            int foundElement = 0; /* Smallest element found through the search */
            int foundIndex = -1; /* Index of the element */
            for(int j = i; j < words.length; j++){
                /* Look for the smallest number in the array, from i (i.e position) */
                if(words[j].length() < foundElement || foundIndex < 0){
                    foundElement = words[j].length();
                    foundIndex = j;
                }
            }
            /* Check if the smallest element found is smaller than the current reference. */
            if(foundElement < words[i].length()){
                swap(words, foundIndex, i);
            }
        }
    }
;

    public static void selSortStringAlpha(String[] words){
        for(int i = 0; i < words.length; i++){
            String foundElement = ""; /* Smallest element found through the search */
            int foundIndex = -1; /* Index of the element */
            for(int j = i; j < words.length; j++){
                /* Look for the smallest number in the array, from i (i.e position) */
                if(compareWords(words[j], foundElement) || foundIndex < 0){
                    foundElement = words[j];
                    foundIndex = j;
                }
            }
            /* Check if the smallest element found is smaller than the current reference. */
            if(compareWords(foundElement, words[i])){
                swap(words, foundIndex, i);
            }
        }
    }

    private static char[] alphabet = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static boolean compareWords(String first, String second){
        // Return true if the first word should be ordered first. (i.e they are in order)
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        /* Find the shortest word and save the length, to make sure we don't go out of bounds and make sure the shortest word is sorted first, ex. "test" < "testing" */
        boolean firstWordShortest = true;
        int length = first.length();
        if(first.length() > second.length()){
            firstWordShortest = false;
            length = second.length();
        }
        /* Compare the words from the first letter to the last if they equal on the first letters. tea < teb */
        for(int i = 0; i < length; i++){
            int indexA = indexOf(a[i], alphabet);
            int indexB = indexOf(b[i], alphabet);
            if(indexA > indexB) return false;
            if(indexB > indexA) return true;
        }
        return firstWordShortest;
    }

    public static int indexOf(char c, char[] arr){
        for(int i = 0; i < arr.length; i++){
            if(c == arr[i]) return i;
        }
        return -1;
    }


    private static int[] swap(int [] arr, int first, int second){
        /* Swap method for swapping two elements in an int array. Args: (array, first index, second index)*/
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
        return arr;
    }
    private static double[] swap(double [] arr, int first, int second){
        /* Swap method for swapping two elements in an int array. Args: (array, first index, second index)*/
        double tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
        return arr;
    }

    private static String[] swap(String [] arr, int first, int second){
        /* Swap method for swapping two elements in an int array. Args: (array, first index, second index)*/
        String tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
        return arr;
    }

}
