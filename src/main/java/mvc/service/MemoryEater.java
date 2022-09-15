package mvc.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MemoryEater {

    public void eatMemory(int memoryEatDelayInMs) {
        List<byte[]> oneMBObjectList = new ArrayList<>();
        int index = 1;
        while (true) {
            // 1MB each loop, 1 x 1024 x 1024 = 1048576
            byte[] objectOneMB = new byte[1048576];
            oneMBObjectList.add(objectOneMB);
            Runtime rt =Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", index++, rt.freeMemory());
            try {
                Thread.sleep(memoryEatDelayInMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
