//find unique element in array not solved yet
package arrays;

public class Dupicate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 3, 2};

        boolean[] seen = new boolean[arr.length]; // To track seen values

        for (int i = 0; i < arr.length - 1; i++) {
            if (!seen[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        seen[j] = true;
                        System.out.print(arr[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}
