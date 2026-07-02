public class test {
    static void main(String[]ar) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = Binary(arr, target);
        System.out.println(ans);
    }
    static int Binary(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                st = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
