import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTests {

    @Test
    public void coveredTest() {
        assertEquals(4, new MyClass().covered(1, 2));
    }
}
