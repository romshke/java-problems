import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

class Worker implements Runnable {
    private final ReentrantLock lock;
    private final SharedData data;
    private final int n;

    public Worker(ReentrantLock lock, SharedData data, int n) {
        this.lock = lock;
        this.data = data;
        this.n = n;
    }

    @Override
    public void run() {
        // Write code here...
        lock.lock();
        try {
            data.jump(n);
        }  finally {
            lock.unlock();
        }
    }
}

// Do not change code below
class SharedData {
    private int currentPosition = 0;

    public void jump(int step) {
        currentPosition = step + currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int threadsCount = scanner.nextInt();

        ReentrantLock lock = new ReentrantLock();
        SharedData data = new SharedData();
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= threadsCount; i++) {
            Thread thread = new Thread(new Worker(lock, data, i));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(data.getCurrentPosition());
    }
}