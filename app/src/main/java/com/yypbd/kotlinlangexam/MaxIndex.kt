/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

package com.yypbd.kotlinlangexam

/**
 * Created by yypbd on 2017-09-02.
 */

fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty())
        return null

    var maxValue = a[0]
    var result = 0

    for (i in a.indices) {
        if(a[i] >= maxValue) {
            maxValue = a[i]
            result = i
        }
    }

    return result
}
