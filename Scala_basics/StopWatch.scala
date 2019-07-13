import scala.concurrent.duration._

object StopWatch {

  def stopwatch_demo(): Unit ={
    val start: Float = System.nanoTime()
    for (i <-1 to 10 ){
      print(" "+i)
    }
    println()
    val stop = System.nanoTime()
    println(stop - start)
    println((stop-start).nanos)
  }

  def main(args: Array[String]): Unit = {
    stopwatch_demo()
  }
}
