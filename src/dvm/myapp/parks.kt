package dvm.myapp

fun buildNatureParks(){
    val myPark=NationalPark()
    myPark.showData()
    myPark.location="uttarakhand,India"
    myPark.showData()
    val name =NationalPark(name="Nanda Devi")
    name.showData()
    val tourist= NationalPark(numberOfTourist = 10)
    print("No of tourist in year 2019 is ${tourist}\n")
    tourist.showData()
    print("--------------------\n")
    val jim =JimCorbett(name = "Jimcorbett",location = "uttarakhand",area = 2500,tourist = 200)
    jim.showData()
}
fun  main(){
buildNatureParks()
}

