package nightLessonCurrent.PrimerParalel;

import java.util.Comparator;
import java.util.stream.IntStream;

public class RunnerNight {
    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;

    private static final int FROM_SECOND_FIRST_THREAD = 501;
    private static final int TO_SECOND_FIRST_THREAD = 1000;

    public static void main(String[] args) {
        TaskSUmNumbers taskSUmNumbers = new TaskSUmNumbers(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        Thread thread = new Thread(taskSUmNumbers);
        thread.start();

    }

    private static final class TaskSUmNumbers implements Runnable {

        private static final int INITIAL_VALUE = 0;
        //private final int INITIAL_VALUE = 0;

        private final int fromNUmber;
        private final int toNUmber;
        private int resultNumber;

        public TaskSUmNumbers(final int fromNUmber, final int toNUmber) {
            this.fromNUmber = fromNUmber;
            this.toNUmber = toNUmber;
            this.resultNumber = INITIAL_VALUE;
        }


//        @Override
//        public void run() {
//            IntStream.rangeClosed(this.fromNUmber, this.toNUmber).forEach(i -> this.resultNumber += i);
//            System.out.println(this.resultNumber);
//
//        }

        @Override
        public void run() {
            IntStream.rangeClosed(fromNUmber, toNUmber).forEach(i -> resultNumber += i);
            System.out.println(resultNumber);


        }
    }
}

