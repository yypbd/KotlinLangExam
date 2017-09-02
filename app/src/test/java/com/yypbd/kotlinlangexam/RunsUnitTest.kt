package com.yypbd.kotlinlangexam

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by yypbd on 2017-09-02.
 */

fun test_runs(expected: Int, vararg data: Int) {
    // assertEquals(expected, runs(data), "\ndata = ${Arrays.toString(data)}")
    assertEquals(expected, runs(data))
}

class RunsUnitTests {
    @Test fun testRuns1() {
        test_runs(0)
    }

    @Test fun testRuns2() {
        test_runs(1, 1)
    }

    @Test fun testRuns3() {
        test_runs(3, 1, 2, 3)
    }

    @Test fun testRuns4() {
        test_runs(3, 1, 2, 2, 3)
    }

    @Test fun testRuns5() {
        test_runs(3, 1, 1, 2, 3)
    }

    @Test fun testRuns6() {
        test_runs(1, 1, 1, 1, 1)
    }

    @Test fun testRuns7() {
        test_runs(3, 1, 1, 1, 0, 1, 1)
    }

    @Test fun testRuns8() {
        test_runs(3, 1, 1, 1, 0, 1)
    }

    @Test fun testRuns9() {
        test_runs(5, 1, 0, 1, 0, 1)
    }
}
