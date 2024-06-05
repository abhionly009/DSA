public class FindNonRepeatativeLetter {
    public static void main(String[] args) {


        String givenString = "abcbcds";

        char [] arr = givenString.toCharArray();
        System.out.println(arr.length);
        for (int i=0;i<arr.length-1;i++){

            for (int j=i+1;j<arr.length-1;j++){

                if (arr[i] != arr[j]){
                    System.out.println(arr[j] +" i -->" +j);
                }

            }

        }

    }
}
