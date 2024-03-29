
package com.ben.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
    public static void main(String args[]) {
        List<Integer> failFastList = new ArrayList<>();
        failFastList.add(10);
        failFastList.add(20);
        failFastList.add(30);
        failFastList.add(40);
        int indexFlag = 0;
        Iterator it = failFastList.iterator();
        while (it.hasNext()) {
            if (++indexFlag == 2) {    
                //failFastList.remove(indexFlag);
            	it.remove();
            }
            System.out.println(it.next());
        }
    }
}