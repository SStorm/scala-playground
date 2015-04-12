package io.github.sstorm

import scala.util.Random

/**
 * Copyright (C) 2014 AlertMe.com Ltd
 */
object RandomIntGenerator {

  val rand = new Random

  def generate(count: Int): Array[Int] = {
    Array.fill(count)({
      rand.nextInt(1000)
    })
  }

}
