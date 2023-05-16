package Asem4.h3;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LockSet<Integer> set = new LockSet<>();
        SemaphoreMap<String, Integer> map = new SemaphoreMap<>();
        HashSet<Integer> unsafeSet = new HashSet<>();
        HashMap<String, Integer> unsafeMap = new HashMap<>(1000);

        Thread one = new Thread(() -> {
            for (int i = 0; i < 499; i++){
                set.add(i);
                map.put(" ", i);
                unsafeSet.add(i);
                unsafeMap.put(" ", i);
            }
        });
        Thread second = new Thread(() -> {
            for (int i = 499; i < 1000; i++){
                set.add(i);
                map.put(" ", i);
                unsafeSet.add(i);
                unsafeMap.put(" ", i);
            }
        });
        one.start();
        second.start();
        try{
            Thread.sleep(3);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("LockSet set = " + set.size());
        System.out.println("SemaphoreMap map = " + map.size());
        System.out.println("HashSet unsafeSet = " + unsafeSet.size());
        System.out.println("HashMap unsafeMap = " + unsafeMap.size());

    }
}
