/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */

package com.yypbd.kotlinlangexam

/**
 * Created by yypbd on 2017-09-02.
 */

fun isPalindrome(s: String): Boolean {
    // Write your solution here

    if(s.length < 2)
        return true

    var i = 0
    do {
        if( s[i] != s[s.length - i - 1] )
            return false

        i += 1
    } while(i < s.length / 2)

    return true
}
