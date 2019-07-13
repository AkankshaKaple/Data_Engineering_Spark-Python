object TableOfTwo {
  def table(n : Int): Unit ={
    var i = 0
    for ( i <- 1 to n){
      println(i + " * " + " 2 " + " = " + i * 2)
    }
  }
  def main(args: Array[String]): Unit = {
    table(10)
  }
}
