package io.github.sstorm

/**
 * Copyright (C) 2014 AlertMe.com Ltd
 */
object BubbleSort extends Sorter {

  def sort(arr : Array[Int]) : Array[Int] = {
    var didChanges = true
    var iterations = 0
    while (didChanges) {
      iterations = iterations+1
      didChanges = false
      for (i <- 0 until arr.length-1) {
        if (arr(i) > arr(i+1)) {
          didChanges = true
          val higher = arr(i+1)
          arr(i+1) = arr(i)
          arr(i) = higher
        }
      }
    }
    arr
  }
}
