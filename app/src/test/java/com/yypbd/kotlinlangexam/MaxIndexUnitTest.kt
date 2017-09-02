package com.yypbd.kotlinlangexam

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by yypbd on 2017-09-02.
 */

fun test_maxIndex(expected: Int?, vararg data: Int) {
    // assertEquals(expected, indexOfMax(data), "\ndata = ${Arrays.toString(data)}")
    assertEquals(expected, indexOfMax(data))
}

class MaxIndexUnitTests {
    @Test fun testNull() {
        test_maxIndex(null)
    }

    @Test fun testIndexOfMaximum1() {
        test_maxIndex(0, 0)
    }

    @Test fun testIndexOfMaximum2() {
        test_maxIndex(1, -1, 0)
    }

    @Test fun testIndexOfMaximum3() {
        test_maxIndex(0, -1, -2)
    }

    @Test fun testIndexOfMaximum4() {
        test_maxIndex(1, 1, 3, 2, 1)
    }

    @Test fun testIndexOfMaximum5() {
        test_maxIndex(2, 1, 3, 4, 1)
    }

    @Test fun testIndexOfMaximum6() {
        test_maxIndex(2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
    }

    @Test fun testIndexOfMaximum7() {
        test_maxIndex(2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)
    }
}
