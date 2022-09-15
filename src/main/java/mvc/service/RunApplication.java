package mvc.service;

public class RunApplication {

    public static void main(String[] args) {
        MemoryEater memoryEater = new MemoryEater();
        int memoryEatDelayInMs = 10;
        if (args.length != 0) {
            memoryEatDelayInMs = Integer.parseInt(args[0]);
        }
        memoryEater.eatMemory(memoryEatDelayInMs);
    }
}
