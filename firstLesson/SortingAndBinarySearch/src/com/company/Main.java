package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 2 , 3, 20 , 1 ,70 ,14};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        System.out.println(binarySearch(arr, 20));

    }


    static void bubbleSort(int[] arr){
        boolean isSort = false;
        while (!isSort){
            isSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    isSort = false;
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = a;
                    break;
                }
            }
        }

    }


    static int binarySearch(int[] arr, int num){

        int first = 0;
        int last = arr.length - 1;


        while (first <= last){

            int middle = (first + last)/2;

            if (arr[middle] == num){
                return middle;
            }

            else if (arr[middle] < num){
                first = middle+1;
            }

            else if (arr[middle] > num){
                first = middle - 1;

            }

        }
        return -1;
    }


}

