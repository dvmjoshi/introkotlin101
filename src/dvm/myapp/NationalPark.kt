package dvm.myapp

import java.time.Year

open class NationalPark(open var area:Int=630,
                        open var name :String="Nanda devi",
                        open var location:String="  Uttarakhand",
                        open var tourist:Int=10) {
    init {
        print("initializing ${name + location}\n")
    }
    constructor(numberOfTourist:Int):this(){
    val years :Int =numberOfTourist *365

    }
var touristInYear:Int
    get() = tourist*365
    set(value){
        tourist=value + 22
    }
fun showData(){
    print("area:${area}kmsq\n" +
            "name:$name\n" +
            "location:$location\n"+
    "number of tourist in 2019 : $touristInYear\n")
}
}
class  JimCorbett(override var name: String, override var location: String, override var tourist: Int, override var area: Int):NationalPark(name = name,
        location = location,area = area,tourist = tourist){

}