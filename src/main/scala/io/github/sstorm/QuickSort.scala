package io.github.sstorm

/**
 * Copyright (C) 2014 AlertMe.com Ltd
 */
object QuickSort extends Sorter {

  def sort(input: Array[Int]): Array[Int] = {
    if (input.size < 2) return input

    val pivot = input(input.size / 2)
    var left = Array.empty[Int]
    var right = Array.empty[Int]
    for (i <- 0 until input.size) {
      if (input(i) < pivot) {
        left = left :+ input(i)
      } else if (input(i) > pivot) {
        right = right :+ input(i)
      }
    }
    (sort(left) :+ pivot) ++ sort(right)
  }
}
