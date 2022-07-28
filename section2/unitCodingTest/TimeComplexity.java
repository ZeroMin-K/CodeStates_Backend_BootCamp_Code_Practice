package section2.unitCodingTest;

public class TimeComplexity {
    public int O_1_algorithm(int[] arr, int index) {
        return arr[index];
    }
    public void O_n_algorithm(int n) {
        for(int i =0 ; i < n; i++) {
            // do something for 1 second
            // ...
        }
    }

    public void O_n_algorithm2(int n) {
        for(int i = 0; i < n * 2; i++) {
            // do something for 1second
            // ...
        }
    }

    public void O_quadratic_algorithm(int n) {
        for(int i =0 ; i < n; i++) {
            for (int j =0 ; j < n; j++) {
                // do something for 1 second
                // ...
            }
        }
    }

    public void O_quadratic_algorithm2(int n) {
        for(int i =0 ; i < n; i++) {
            for (int j =0 ; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    // do something for 1 second
                    // ...
                }
            }
        }
    }

    // exponential algorithm
    public int fibonacci(int n) {
        if(n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
