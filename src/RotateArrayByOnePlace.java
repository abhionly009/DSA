public class RotateArrayByOnePlace {

    public static void rotateArray(int arr[], int n){

        int temp = arr[0];

        for (int i=0;i<n-1;i++){
            System.out.println( i +"--->"+arr[i]);

                arr[i]= arr[i+1];

        }
        arr[n-1] =temp;

        System.out.println("-----------------------");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr [] = {2,3,7,9,1};

        rotateArray(arr, 5);
    }

}
