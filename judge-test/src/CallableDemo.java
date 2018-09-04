import java.util.concurrent.*;

public class CallableDemo {

    static class SumTask implements Callable<Long> {

        @Override
        public Long call() throws Exception {



            long sum = 0;
            for (int i = 0; i < 9000; i++) {
                sum += i;
            }


            throw new IllegalArgumentException("check exception");
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Start:" + System.nanoTime());
        FutureTask<Long> futureTask = new FutureTask<Long>(new SumTask());
        Executor executor=Executors.newSingleThreadExecutor();
        executor.execute(futureTask);
        System.out.println("================");
        System.out.println(futureTask.get());
        System.out.println("------------------------");
        System.out.println("End:" + System.nanoTime());
    }

}
