package lab3;

public class Task {
    public static void main(String[] args) {
        System.out.println("Semaphore list:");
        SemaphoreList<Integer> semaphoreList = new SemaphoreList<>();
        semaphoreList.add(5);
        System.out.println("Added 5");
        System.out.println("Size: " + semaphoreList.size());
        System.out.println(semaphoreList.get(semaphoreList.size() - 1));

        System.out.println("\nSynchronized set:");
        SyncSet<String> syncSet = new SyncSet<>();
        syncSet.add("abc");
        System.out.println("'abc' string added");
        syncSet.add("a");
        System.out.println("'a' string added");
        syncSet.add("a");
        System.out.println("'a' string added");
        syncSet.add("bb");
        System.out.println("'bb' string added");
        System.out.println("Set contains 'a' string " + syncSet.contains("a"));
        System.out.println("Set size: " + syncSet.size());
    }
}
