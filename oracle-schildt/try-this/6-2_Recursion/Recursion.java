class Recursion {
    int factorial(int factor) {
        int result;

        if (factor == 1) {
            System.out.print("Fatores: 1 ");
            return 1;
        }
        result = factorial(factor - 1) * factor;
        System.out.print(factor + " ");
        return result;
    }

    int summing(int parcel) {
        if (parcel == 0) {
            return 0;
        }
        int result = summing(parcel - 1) + parcel;
        return result;
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        for (int i = 1; i <= 10; i++) {
            int result = recursion.factorial(i);
            System.out.println("Factorial (" + i + ") = " + result);
        }

        for (int i = 1; i <= 10; i++) {
            int result = recursion.summing(i);
            System.out.println("Soma " + result);
        }

    }
}
