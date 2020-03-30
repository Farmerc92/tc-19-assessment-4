package rocks.zipcode.io.assessment4.generics;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Map<SomeType, Integer> map = new HashMap<>();
        for(SomeType obj : array){
            if (map.containsKey(obj))
                map.put(obj, map.get(obj) + 1);
            else
                map.put(obj, 1);
        }
        for (SomeType obj : map.keySet()){
            if (map.get(obj) % 2 == 1){
                return obj;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Integer> map = new HashMap<>();
        for(SomeType obj : array){
            if (map.containsKey(obj))
                map.put(obj, map.get(obj) + 1);
            else
                map.put(obj, 1);
        }
        for (SomeType obj : map.keySet()){
            if (map.get(obj) % 2 == 0){
                return obj;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(SomeType obj : array){
            if (obj.equals(valueToEvaluate))
                count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        @SuppressWarnings("unchecked")
        SomeType[] buffer = (SomeType[]) Array.newInstance(array[0].getClass(), array.length);
        int j = 0;
        for (int i = 0; i < buffer.length; i++) {
            if (predicate.apply(array[i]))
                buffer[j++] = array[i];
        }
        @SuppressWarnings("unchecked")
        SomeType[] output = (SomeType[]) Array.newInstance(array[0].getClass(), j);
        for (int i = 0; i < j; i++) {
            output[i] = buffer[i];
        }
        return output;
    }
}
