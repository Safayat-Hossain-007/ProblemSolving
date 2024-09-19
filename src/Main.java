import java.util.*;
public class Main {
    public static int FirstRepeatingElement(int [] array, int ArraySize){
        for(int i=0;i<ArraySize;i++){
            for(int j=i+1;j<ArraySize;j++){
                if(array[i] == array[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array ={10, 5, 3, 4, 3, 5, 6};
        int ArraySize = array.length;
        int result = FirstRepeatingElement(array,ArraySize);
        if(result == 1){
            System.out.println("First repeating element found and it's : "+ array[result]);
        }else{
            System.out.println("No repeating element found");
        }
    }
}