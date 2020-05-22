package abstractandinterface

fun main(){
    val jeep=jeep(140)
    val  ford=ford()
    print("jeep offroad car color is :${jeep.color} and price is ${jeep.price}\n")
    jeep.speed()
    print("jeep offroad car color is :${ford.color} and  type is  : ${ford.type}\n")
    ford.speed()
}