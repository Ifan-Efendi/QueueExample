import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Membuat Queue
        Queue<String> queue = new LinkedList<>();

        // Menambahkan item ke Queue
        queue.add("Antrian 1");
        queue.add("Antrian 2");
        queue.add("Antrian 3");
        queue.add("Antrian 4");
        queue.add("Antrian 5");

        // Mencetak Queue
        System.out.println("Queue: " + queue);

        // Menghapus item pertama dari Queue
        String item = queue.remove();
        System.out.println("Removed item: " + item);

        // Print update Queue
        System.out.println("Updated queue: " + queue);
    }
}