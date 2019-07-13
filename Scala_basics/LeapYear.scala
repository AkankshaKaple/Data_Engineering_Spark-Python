
import scala.io.StdIn._

object LeapYear {

  def main(args: Array[String]): Unit ={

    var year : Int = 0
    println("Enter the year as 4 digit number")
    year = readLine().toInt

    if (year.toString().length() == 4) {


      if (year % 100 == 0) {
        if (year % 400 == 0) {
          println("This is leap year")
          return
        }
        else println("This is not leap year")
        } else if (year % 4 == 0) {
          print("This is leap year")
          return
        }
        else println("This is not leap year")
    }
  }
}

