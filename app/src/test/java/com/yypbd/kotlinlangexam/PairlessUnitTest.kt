package com.yypbd.kotlinlangexam

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by yypbd on 2017-09-02.
 */

fun test_pairless(expected: Int?, vararg data: Int) {
    val actual = findPairless(data)
    // assertEquals(expected, actual, "\ndata = ${Arrays.toString(data)}")
    assertEquals(expected, actual)
}

class PairlessUnitTests {
    @Test fun testPairless1() {
        test_pairless(0, 0)
    }

    @Test fun testPairless2() {
        test_pairless(1, 0, 1, 0)
    }

    @Test fun testPairless3() {
        test_pairless(5, 5, -1, -1, 0, 0)
    }

    @Test fun testPairless4() {
        test_pairless(3, 1, 3, 1, 1, 1)
    }

    @Test fun testPairless5() {
        test_pairless(1, 2, 3, 1, 2, 3)
    }
}
