public class FindLargestNumberInArray {

    public static int getLargestNumber(int arr[]){
        int largest = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest ){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr [] = {8,10,5,7,9,18};
        System.out.println("Largest number in Array --->" + getLargestNumber(arr));
    }
}
