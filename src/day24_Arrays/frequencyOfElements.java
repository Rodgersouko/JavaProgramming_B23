package day24_Arrays;

public class frequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4};
        for(int j =0 ; j < arr.length; j++){

        int element = arr[0];
        int count = 0;  // to score the frequency of element
        for(int i = 0 ; i < arr.length ;i++) {
            if(arr[i] == element){
                count++;

        }
        }
        if(count == 1){
            System.out.println(element);
        }
    }
}

}