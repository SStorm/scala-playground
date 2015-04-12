package io.github.sstorm

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val generated = RandomIntGenerator.generate(100000)
    QuickSort.timeAndSort(generated)
    BubbleSort.timeAndSort(generated)
  }

}