package abstractandinterface

abstract  class offRoadcar{
abstract  val color :String
}
interface  SpeedOfCar{
    fun speed()
}
interface  priceOfCar{
    val  price:Int
}
 interface  carType{
     val type:String
 }
object type:carType{
    override  val type ="off road"
}

class  jeep (val speed:Int): offRoadcar() ,SpeedOfCar,priceOfCar{
    override  val  price=10_000_00
    override  val  color="\nmagic black"
    override fun speed() {
        print("Top is $speed")
    }
}
class ford:offRoadcar(),SpeedOfCar,carType by type{
    override  val   color="military green"
    override fun speed() {
        print("\nTop speed is 150")
    }
}