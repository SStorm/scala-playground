package io.github.sstorm

/**
 * Copyright (C) 2014 AlertMe.com Ltd
 */
trait Sorter {
  def sort(p: Array[Int]) : Array[Int]

  def timeAndSort(p: Array[Int]) : Array[Int] = {
    val before = System.currentTimeMillis()
    val sorted = sort(p)
    val after = System.currentTimeMillis()
    println("[" + this.getClass.getSimpleName + "] Sorting took: " + (after - before) + "ms")
    sorted
  }
}
