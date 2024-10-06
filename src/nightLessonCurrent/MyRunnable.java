package nightLessonCurrent;

import java.util.stream.IntStream;

public class MyRunnable {

    private static final int CREATED_THREAD_AMMOUNT = 3;

    public static void main(String[] args) {

        final Runnable task = () -> System.out.println(Thread.currentThread().getName() + " final Runnable task ");
        startThread(task);
//        final Runnable taskCreatedThread = () ->
//                range(0, CREATED_THREAD_AMMOUNT)
//                        .forEach(i -> startThread(task));
//        startThread(taskCreatedThread);

    }

    private static void startThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
    }

    private static IntStream range(int firstPol, int secondPol) {
            return IntStream.range(firstPol, secondPol);
        }
    }


