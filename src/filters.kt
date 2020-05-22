fun  main (){
val kist = listOf("DVM","PUSP","MAC","COOLGUY","PAWAN")
    println(kist.filter { it[0]=='P' })
    val eager = kist.filter { it[0]=='D' }
    println("\neager:$eager")
    val lazy=kist.asSequence().filter { it[0]=='P' }
    println("\nlazy:$lazy")
    val newList=lazy.toList()
    print("\n$newList")
val lazy2=kist.asSequence().filter { it[0]=='D' }.map {
    print("\naccess:$it")
it
}
    print("\n ${lazy2.toList()}")
}

