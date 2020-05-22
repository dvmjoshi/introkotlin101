data class Travel(val destinationType:String){

}
data class  Destination(val mountains:String,val coastside:String){

}

fun  LocationType(){
    val type1 =Travel("Mountains")
    println(type1)
    val  type2=Travel("CoastSide")
    println(type2)
    val type3=Travel("CoastSide")
    println(type3)
    println(type1.equals(type2))
    println(type3.equals(type2))
    val des=Destination("uttarkhand","Florida")
    println(des)
    val (mountains,coast)=des
    println("\n$mountains")
    println("\n$coast")
}
fun main(){
LocationType()
}