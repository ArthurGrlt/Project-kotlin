fun main(){

    var jeSuisUnChien: Animal = Chien()
    jeSuisUnChien.parler()
    jeSuisUnChien.quiSuisJe()


    var animalerie = Animalerie()
    var poppy: Animal  = Chat()
    var rex: Animal = Chien()
    animalerie.add2(poppy)
    animalerie.add2(rex)

    animalerie.affiche()

}