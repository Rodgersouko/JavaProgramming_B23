package day27_Recap;

public class uniqueElement {
    public static void main(String[] args) {
        int[] numbers={1,2,1,3,3,4,5,5,6,6,6,7,8};

        int count = 0;
        int fstUniqe = 0;

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    //System.out.println(count + " "+numbers[j]);
                }
            }
            if (count == 1) {
                fstUniqe = numbers[j];
                break;

            }
        }
    }
}
