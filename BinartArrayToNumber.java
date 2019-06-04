import java.util.List;
import java.lang.Math.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int sum = 0;
        for(int i = 0; i < binary.size(); i++){
           sum += binary.get(i) * Math.pow(2, binary.size() - i - 1);
      }
      return sum;
    }
}