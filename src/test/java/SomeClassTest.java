import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeClassTest {

    @Test
    void someTest() {
        assertThat(new SomeClass()).isNotNull();
    }
}