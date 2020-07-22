package optionalbaitapcaidatthuattoantimkiemnhiphansudungdequy;

public class BinarySearch1 {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int binarySearch1(int[] list , int low, int high, int key){
//        int high = list.length-1;
//        int low = 0;
        if (high >= low){
            int mid = (low + high)/2;
            if (list[mid] == key)
                return mid;
            if (list[mid] > key)
                return binarySearch1(list, low , mid-1, key);
            return binarySearch1(list,mid+1, high,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch1(list, 0, list.length-1,  2));
        System.out.println(binarySearch1(list, 0, list.length-1,  11));
        System.out.println(binarySearch1(list, 0, list.length-1,  79));
        System.out.println(binarySearch1(list, 0, list.length-1,  1));
        System.out.println(binarySearch1(list, 0, list.length-1,  5));
        System.out.println(binarySearch1(list, 0, list.length-1,  80));
    }
}
