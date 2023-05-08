class QuickSort {
    static void quickSortStatic(char items[]) {
        quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char items[], int left, int right) {
        int i = left;
        int j = right;

        char x = items[(left + right) / 2];
        char y = 0;

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) quicksort(items, left, j);
        if (i < right) quicksort(items, i, right);
    }

    public static void main(String[] args) {
        char[] data = { 'a', 'b', 'z', 'w' };
        QuickSort.quickSortStatic(data);
        System.out.println(data);
    }
}