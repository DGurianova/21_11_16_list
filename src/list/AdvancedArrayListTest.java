package list;

import org.junit.jupiter.api.BeforeEach;

public class AdvancedArrayListTest extends CustomListTest {
    @BeforeEach
    public void init() {
        intList = new AdvancedArrayList<>();
        stringList = new AdvancedArrayList<>();
    }
}
