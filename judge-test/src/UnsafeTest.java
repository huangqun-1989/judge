import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author huangqun
 */
public class UnsafeTest {

    private static final Unsafe UNSAFE;

    static {
        try {
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            UNSAFE = (Unsafe) unsafeField.get(null);
        } catch (Exception ex) { throw new Error(ex); }
    }

    public static void main(String[] args) {

        UnsafeTest obj = new UnsafeTest();

        ReentrantLock lock = new ReentrantLock();

        CountDownLatch countDownLatch = new CountDownLatch(3);


        int expect = 10;
        int update = 20;

        boolean result = UNSAFE.compareAndSwapInt(obj, 0, expect, update);

        System.out.println("===" + result);


    }
}
