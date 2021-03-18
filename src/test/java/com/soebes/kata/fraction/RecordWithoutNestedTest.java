package com.soebes.kata.fraction;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

record RecordWithoutNestedTest() {

  record F2() {

    @Test
    @DisplayName("Record F2:test1")
    void test_1() {
      assertThat(true).isTrue();
    }

    @Test
    @DisplayName("Record F2:test2")
    void test_2() {
      assertThat(true).isTrue();
    }

  }

  record F1() {

    @Test
    @DisplayName("Record F1:test1")
    void test_1() {
      assertThat(true).isTrue();
    }

    @Test
    @DisplayName("Record F1:test2")
    void test_2() {
      assertThat(true).isTrue();
    }
  }

}
