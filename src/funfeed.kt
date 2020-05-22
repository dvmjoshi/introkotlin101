import  java.util.*
fun randomDay(): String {
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}
fun elephantFood(day:String):String {
    var food=""
    when(day){
        "Monday" -> food="Banana"
        "Tuesday"-> food="Mango"
        "Wednesday"->food="Sugarcane"
        "Thursday"->food="Vegetables"
        "Friday"->food="Pineapple"
        "Saturday"->food="Apple"
        "Sunday"->food="Guava"
        else-> "nothing"
    }
    return food
}
fun shouldWaterChange(day: String,temperature :Int =22,dirtyLevel:Int =12):Boolean{
  return  when{
      temperature>30 -> true
      dirtyLevel > 15 ->true
      day=="Sunday"->true
      else ->false
  }

}
fun feedTheElephant(){
    var day=randomDay()
    val food=elephantFood(day)
    println(" Today Day is $day and Elephant will eat $food")
    println("Today is $day and water need to be change :${shouldWaterChange(day)}")
}
fun main(){
    feedTheElephant()
}