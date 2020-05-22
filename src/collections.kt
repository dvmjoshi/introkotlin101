fun mapNoOfGadgets(){
    val gadgets= mutableMapOf("laptop" to 1)
    gadgets.put("go pro" ,2)
    println(gadgets.toString())
}
fun hashTour(){
    val travelList = hashMapOf("NorthAmerica" to "usa","Asia" to "India","Europe" to "Germany")
    println(travelList.get("Asia"))
    println(travelList["Europe"])
    println(travelList.getOrDefault("Africa","You have to go their but where "))
}

fun  main(){
    val list = listOf(2,3,44,5)
    print(list.sum())
    val  list2= listOf("dvm","mac","coolguy","pusp")
    print(list2.sumBy { it.length })
    for (a in list2.listIterator()){
        println("\n$a")
    }
    hashTour()
    mapNoOfGadgets()
}