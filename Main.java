package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {2,4,5,4,5,3412,4,2,5,42,42,54};
        quicksort(array, 0, array.length-1);
        for(int i: array){
            System.out.print(i + " ");
        }

    }
    private static void quicksort (int[] array, int start, int end){
        if(end <= start) {
            return;
        }
        int pivot = patition(array, start,end);
        quicksort(array, start, pivot -1);
        quicksort(array, pivot+1, end);
    }
    private static int patition(int[] array, int start, int end){
        int i = start - 1;

        for (int j = start; j<= end -1; j++) {
            if (array[j] < array[end]) {

                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}