package io.integral.starter.test;

import io.integral.starter.SomeClass;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeClassTest {

    @Test
    void someTest() {
        assertThat(new SomeClass()).isNotNull();
    }
}