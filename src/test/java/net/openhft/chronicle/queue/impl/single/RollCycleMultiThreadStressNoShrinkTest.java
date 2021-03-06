package net.openhft.chronicle.queue.impl.single;

import org.junit.Test;

import java.io.IOException;

public class RollCycleMultiThreadStressNoShrinkTest extends RollCycleMultiThreadStressTest {

    @Test
    public void stress() throws InterruptedException, IOException {
        super.stress();
    }

    static {
        System.setProperty("chronicle.queue.disableFileShrinking", "true");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new RollCycleMultiThreadStressDoubleBufferTest().stress();
    }
}
