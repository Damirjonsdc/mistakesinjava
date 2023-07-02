import java.util.LinkedList;
public class homeworktask1 {

        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            long startTime = System.nanoTime();

            for (int i = 0; i < 10000; i++) {
                linkedList.add(i);
            }

            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println("Time taken to add 10000 elements to LinkedList: " + duration + " nanoseconds");
        }
    }

