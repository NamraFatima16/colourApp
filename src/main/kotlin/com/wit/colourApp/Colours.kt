package com.wit.colourApp;

class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        // return the colours list
        return colours;
    }

    fun numberOfColours (): Int{
        // return the size of the colours list
        return colours.size;
    }

    fun firstColour() : String{
        // return the first colour in the list
        return colours.first()
    }

    fun lastColour() : String{
        // return the last colour list
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        // return the colours in alphabetical order
        return  colours.sorted()
    }

    fun coloursInAllCapitals() : List<String>{
        // return the colours in ALL CAPS
        //found from there
        //https://kotlinlang.org/docs/collection-transformations.html
        return colours.map { it.uppercase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        // return the colours starting with the letter passed as a parameter
        val stringC = mutableListOf<String>()
        for (strColour in colours ){
            if(strColour.startsWith(letter,true)) {

                stringC.add(strColour)
            }

        }
        return stringC
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        // return the colours that have exactly the same number of chars as the number passed as a parameter
        val sizeC = mutableListOf<String>()
        for(szColour in colours){
            if (szColour.length == size){
                sizeC.add(szColour)
            }

        }
        return sizeC

    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //  return the colours that have less chars than the number passed as s parameter
        val sizeLs = mutableListOf<String>()
        for(szColour in colours){
            if (szColour.length < size){
                sizeLs.add(szColour)
            }

        }
        return sizeLs

    }



    fun isColourInTheList(colour : String) : Boolean{
        // return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        for(str in colours){
            if(str.equals(colour,true)){
                return true
            }
        }
        return false
    }

    // Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.


     fun coloursInAllLowerCase() : List<String>{
      // return the colours in ALL Lower CASE
       //found from there
     //https://kotlinlang.org/docs/collection-transformations.html
       return colours.map { it.lowercase() }
    }

    fun coloursWithMoreCharsThan(size: Int) : List<String>{
        //  return the colours that have more chars than the number passed as s parameter
        val sizeLs = mutableListOf<String>()
        for(szColour in colours){
            if (szColour.length > size){
                sizeLs.add(szColour)
            }

        }
        return sizeLs

    }

    fun coloursInReverseAplhabeticOrder() : List<String>{
        // return the colours in reverse alphabetical order
        return  colours.sorted().reversed()
    }



}