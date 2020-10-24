import java.util.Arrays;

public class Question10 {

    public void reverseArray(int... arr){
        int[] revArr = new int[arr.length];
        for(int i=0; i <arr.length; i++){
            revArr[i] = arr[(arr.length -1)-i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
