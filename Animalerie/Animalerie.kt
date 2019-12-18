import java.util.*

class Animalerie {

    var listeAnimaux = mutableSetOf<Animal>()

    fun add2(toto : Animal){
        //listeAnimaux.add(type)
        listeAnimaux.add(toto)
    }

    fun affiche(){
        for (animal in listeAnimaux){
            animal.quiSuisJe()
        }
    }


}