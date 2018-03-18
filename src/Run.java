import java.util.Arrays;

public class Run {
    /* Testing Sort.java */
    public static void main(String[] args) {

        int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        double[] doubleNumbers = {21.32, 74.23, 98.11, 582.23, 2.1, 90.124, 52.32};
        String[] words = {"doubt", "route", "found", "fuel", "well-groomed", "kindly", "add", "pumped", "plantation", "shortWord", "shortWordLonger", "_test"};
        String[] wordsBackup = words.clone();


        System.out.println("Int array unsorted: < " + Arrays.toString(numbers));
        Sort.selSort(numbers);
        System.out.println("Int array sorted: > " + Arrays.toString(numbers));
        System.out.println("");
        System.out.println("Double array unsorted: < " + Arrays.toString(doubleNumbers));
        Sort.selSort(doubleNumbers);
        System.out.println("Double array sorted: > " + Arrays.toString(doubleNumbers));
        System.out.println("");
        System.out.println("Words length array unsorted: < " + Arrays.toString(words));
        Sort.selSortStringLength(words);
        System.out.println("Words length array sorted: > " + Arrays.toString(words));
        System.out.println("");
        System.out.println("Words alpha array unsorted: < " + Arrays.toString(wordsBackup));
        Sort.selSortStringAlpha(wordsBackup);
        System.out.println("Words alpha array sorted: > " + Arrays.toString(wordsBackup));

        /*  Default output:

            Int array unsorted: < [45, 32, 128, 42, 9, 83, 52, 96, 1, 75]
            Int array sorted: > [1, 9, 32, 42, 45, 52, 75, 83, 96, 128]

            Double array unsorted: < [21.32, 74.23, 98.11, 582.23, 2.1, 90.124, 52.32]
            Double array sorted: > [2.1, 21.32, 52.32, 74.23, 90.124, 98.11, 582.23]

            Words length array unsorted: < [doubt, route, found, fuel, well-groomed, kindly, add, pumped, plantation, shortWord, shortWordLonger, _test]
            Words length array sorted: > [add, fuel, found, route, doubt, _test, pumped, kindly, shortWord, plantation, well-groomed, shortWordLonger]

            Words alpha array unsorted: < [doubt, route, found, fuel, well-groomed, kindly, add, pumped, plantation, shortWord, shortWordLonger, _test]
            Words alpha array sorted: > [_test, add, doubt, found, fuel, kindly, plantation, pumped, route, shortWord, shortWordLonger, well-groomed]

         */

    }
}
