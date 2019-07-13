// trait is like interface in java. Here we write method declarations only and we implement them in another class

import scala.io.StdIn._

trait PowerOfTwo {
  def powerOfTwo_method(power : Int):Int
}

  class PowerOfTwo_class extends PowerOfTwo{

    var value1 : Int = 1
    def powerOfTwo_method(power: Int) :Int={
      var value =2
      if (power == 0){
        value = 1
      }
      else{
        for (_ <- 1 to power) {
          value = value * 2
        }
      }
      value
      }

  }

object PowerOfTwo_object {
  def main(args: Array[String]): Unit = {

    try {
      println("Enter the power of two you want : ")
      var power = readLine().toInt


      if (power > 31 || power < 0) {
        print("Invalid Input. Print again : ")
        power = readLine().toInt
      }

      val obj = new PowerOfTwo_class
      val value = obj.powerOfTwo_method(power)
      println(power + "th power of 2 is : " + value)
    }

    catch {
      case e: Exception =>
        System.out.println("Exception occurred :" + e)
        print("Invalid Input.")
      }

    }

  }
