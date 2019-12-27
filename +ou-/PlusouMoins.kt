fun main(){
    plusOuMoins()

}


fun plusOuMoins(): Unit{

    var test: Boolean = false
    println("Entre un chiffre à deviner")
    val getValue =  readLine()

    val number = getValue!!.toInt()
    var compteur: Int = 0



    while(!test){

        println("Entre ta proposition")
        val getProp = readLine()
        val numberProp = getProp!!.toInt()


        when(numberProp){
            number -> {
                test = true
                println("Bravo tu as trouvé le chiffre en $compteur essaies")
            }

            //+/-5
            in (number-5)..number->{
                println("t'es brulant, tente au dessus")
                compteur++
            }
            in number..(number+5)->{
                println("t'es brulant, tente en dessous")
                compteur++
            }

            //+/-10
            in (number-10)..number->{
                println("t'es chaud, tente au dessus")
                compteur++
            }
            in number..(number+10)->{
                println("t'es chaud, tente en dessous")
                compteur++
            }

            //+/-20
            in (number-20)..number->{
                println("t'es froids, tente au dessus")
                compteur++
            }
            in number..(number+20)->{
                println("t'es froids, tente en dessous")
                compteur++
            }

            //+/-99
            in (number-999)..number->{
                println("t'es gelé, tente au dessus")
                compteur++
            }
            in number..(number+999)->{
                println("t'es gelé, tente en dessous")
                compteur++
            }

        }
    }

}