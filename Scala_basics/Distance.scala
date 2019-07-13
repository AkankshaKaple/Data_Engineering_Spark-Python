object Distance {
  def getDistance(x : Int, y : Int): Unit ={
    try
    System.out.println("Distance between " + x  +" and " + y + " is : "+ (x - y))
    catch {
      case e : Exception =>
        System.out.println("Could not execute because : " + e)
    }
  }

  def main(args: Array[String]): Unit = {
    getDistance(90, 10)
  }
}
