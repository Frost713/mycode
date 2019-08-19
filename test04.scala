package com.keduox

/**
  * @author Frost
  * @date 2019/8/20  0:33
  */
object test04 {
  def main(args: Array[String]): Unit = {
   val test1 = new test
    val t1 = for (i <- 0 to (100)) yield {
      ("AAU5313" + i, "3.5G" + i, "0" + i, 7 + 1)
      }
    val sb =new StringBuffer
    for (i<-t1){
      println(sb.append("\"").append(i._1).append("\","))
    }
  }
}
