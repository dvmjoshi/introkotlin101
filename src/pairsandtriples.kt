fun main(){
    val trail= "MTB is best " to "Cycling "
    println("${trail.first}way to ${trail.second}")
    val no=Triple(2,3,5)
    println(no.toString())
    print(no.toList())
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")
    val tour="Going to " to "Europe"
    val(a,b)=tour
    print("$a india via $b")
}