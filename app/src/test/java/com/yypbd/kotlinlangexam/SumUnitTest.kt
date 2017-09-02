package com.yypbd.kotlinlangexam

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by yypbd on 2017-09-02.
 */

fun test_sum(expectedSum: Int, vararg data: Int) {
    assertEquals(expectedSum, sum(data))
}

class SumUnitTest {
    @Test fun testSum1() {
        test_sum(0)
    }

    @Test fun testSum2() {
        test_sum(1, 1)
    }

    @Test fun testSum3() {
        test_sum(-1, -1, 0)
    }

    @Test fun testSum4() {
        test_sum(6, 1, 2, 3)
    }

    @Test fun testSum5() {
        test_sum(6, 1, 1, 1, 1, 1, 1)
    }
}

