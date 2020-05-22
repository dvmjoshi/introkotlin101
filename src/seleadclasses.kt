sealed class Continents
class Africa:Continents()
class NorthAmerica:Continents()

fun inWhichContinent(con:Continents):String{
return  when(con){
    is Africa->"Afrcia"
    is NorthAmerica->"NorthAmerica"
}

}

