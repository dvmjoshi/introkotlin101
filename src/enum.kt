enum class Continent (val location:String){
    Africa("Middle"),Antarctica("SouthPole"),Asia("East"),Europe("North"),
    NorthAmerica("West"),SouthAmerica("SouthWest"),Australia("SouthEast")
}
fun  main(){
    println(Continent.Europe.name)
    println(Continent.Australia.ordinal)
    println(Continent.Asia.location)
}
