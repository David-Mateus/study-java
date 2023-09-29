package com.company;

class SearchBinary {
    public int searchBinary(int[] array, int item) {
        int baixo = 0;
        int alto = array.length - 1;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = array[meio];

            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        SearchBinary ob = new SearchBinary();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.searchBinary(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}




