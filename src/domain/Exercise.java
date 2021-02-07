
package domain;
/**
 * @see
 * @author God
 */
import java.util.HashMap;
import java.util.Map;

public class Exercise {
    
  
    public static int Calculate(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i:arr){
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
             map.put(i, 1);
            }
        }
        
        int maxresult = 1;
        int resultating = 0;
        
        for (Map.Entry<Integer, Integer> currentEntry : map.entrySet()) {
            if (currentEntry.getValue() > maxresult) {
                maxresult = currentEntry.getValue();
                resultating = currentEntry.getKey();
            }
        }
        return resultating;
}
    
}