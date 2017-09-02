package com.yypbd.kotlinlangexam

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by yypbd on 2017-09-02.
 */

fun test_palindrome(expected: Boolean, data: String) {
    val actual = isPalindrome(data)
    // assertEquals(expected, actual, "\ndata = \"$data\"")
    assertEquals(expected, actual)
}

class PalindromeUnitTests {
    @Test fun testEmptyString() {
        test_palindrome(true, "")
    }

    @Test fun testChar() {
        test_palindrome(true, "a")
    }

    @Test fun testPositive1() {
        test_palindrome(true, "aba")
    }

    @Test fun testPositive2() {
        test_palindrome(true, "abba")
    }

    @Test fun testPositive3() {
        test_palindrome(true, "abbabba")
    }

    @Test fun testPositive4() {
        test_palindrome(true, "abbaabba")
    }

    @Test fun testNegative1() {
        test_palindrome(false, "ab")
    }

    @Test fun testNegative2() {
        test_palindrome(false, "abab")
    }

    @Test fun testNegative3() {
        test_palindrome(false, "abaa")
    }
}
