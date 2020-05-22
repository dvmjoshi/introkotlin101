fun updateData(data:Int ,operation:(Int)->Int):Int{
    return operation(data)

}
fun increaseData(value: Int)=value+1
fun main(){
    var a = 10
    val multiply={mul:Int-> mul*2}
    print(multiply(a))
val add :(Int)->Int={plus->plus+2}
    println("\n${updateData(20,add)}")
    //Normal function calling
    print("\n${updateData(20,::increaseData)}")

}