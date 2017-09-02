/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */

package com.yypbd.kotlinlangexam

/**
 * Created by yypbd on 2017-09-02.
 */

fun sum(a: IntArray): Int {
    // Write your solution here

    var result: Int = 0
    for (value in a)
        result += value

    return result
}
