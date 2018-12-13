
package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListExample {

    public static void main(String[] args) {
    
        List list = new ArrayList();
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(4);
      
        System.out.println(Collections.binarySearch(list, 7));
        //System.out.println(list.get(3));
        
    }
    
}
