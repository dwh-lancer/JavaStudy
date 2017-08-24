package com.example.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dlancer on 2017/4/11.
 */

public class ArrayTest_8_5_4 {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,4,4,4};
        System.out.print(duplicateCount(a));
    }

    /**
     * 找出数组中重复元素最多的数
     * 存在的问题：当有多个数重复次数相同时，这里只能找到第一个。
     * @param a
     * @return
     */
    public static int duplicateCount(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
            //在hashmap中存着键值对，下一步比较值的大小。
            int maxKey = 0;
            int maxVal = 0;
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                int key = (Integer) entry.getKey();
                int val = (Integer) entry.getValue();
                if (val > maxVal) {
                    maxKey = key;
                    maxVal = val;
                }
            }
            return maxKey;
        }
}
