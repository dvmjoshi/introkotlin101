package generics
fun main(){
    genericeg()
}
fun genericeg(){
    val adventure= AdventureList<Hiking>(Hiking())
    adventure.needAdventure.hikingAdventure()
    println(" I need adventure :${adventure.needAdventure.needed}")
//    val adventure1=AdventureList("cycling in trails")
//    println(adventure1)
//    val adventure3=AdventureList(null)
//    if(adventure3.needAdventure==null){
//        println("\n Have to work for another adventure")
//
//    }
    val adventure4=AdventureList(GoBackToMountains())
    adventure4.needAdventure
}

open class NeedAdventure(var needed:Boolean)
class  Hiking:NeedAdventure(true){
    fun hikingAdventure(){
        needed=true
    }
}
class GoBackToMountains:NeedAdventure(true)
class DoMountainCycling:NeedAdventure(true){
    fun withMtb(){
        needed=true
    }
}
class  AdventureList<T:NeedAdventure>(val needAdventure:T){
    fun newadventure(){
        check(!needAdventure.needed){
            "needed new adventure"
        }
        println("$needAdventure")
    }

}
