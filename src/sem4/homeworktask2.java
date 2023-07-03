package sem4;
import java.util.LinkedList;

public class homeworktask2 {

    public class Queue<T> {
        private LinkedList<T> queue = new LinkedList<>();

        public void enqueue(T element) {
            queue.addLast(element);
        }

        public T dequeue() {
            return queue.pollFirst();
        }

        public T first() {
            return queue.peekFirst();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int size() {
            return queue.size();
        }
    }
}
