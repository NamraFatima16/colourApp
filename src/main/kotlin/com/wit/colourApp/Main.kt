//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments in the two classes.  Follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
//  5. NOTE that you should not change the function names, parameters or return types when working on the fixes - to
//     do so will also result in a reduced mark.
package com.wit.colourApp

private val colours = Colours()

fun main(args: Array<String>) {

    // Use String templates i.e. ${} to insert the method calls into the actual println string.
    // tidy up the printing layout so that it is neat and has a nicer UI - you can choose what you would like to do
    //     here, maybe add breaks, lines, tabs, dividers, etc., whatever you think for making it nicer / easier to read.
    println("----------------------------------------------------------------------------------------------------")
    println("1. The list is:\n\t${colours.getAll()}")
    println("----------------------------------------------------------------------------------------------------")
    println("2. The List has ${colours.numberOfColours()} elements stored ")
    println("----------------------------------------------------------------------------------------------------")
    println("3. ${colours.firstColour()} is the first colour in the list")
    println("----------------------------------------------------------------------------------------------------")
    println("4. ${colours.lastColour()} is the last colour in the list")
    println("----------------------------------------------------------------------------------------------------")
    println("5. Sorted list is:\n\t${colours.coloursInAlphabeticOrder()}")
    println("----------------------------------------------------------------------------------------------------")
    println("6. CAPITALISED list is:\n\t${colours.coloursInAllCapitals()}")
    println("----------------------------------------------------------------------------------------------------")
    println(
        "7. Colours starting with specific letter [ B was chosen ]" +
                "\n\t${colours.coloursStartingWithLetter('B')}"
    )
    println("----------------------------------------------------------------------------------------------------")
    println(
        "8. Colours with a specific number of chars [ 6 was chosen]" +
                "\n\t${colours.coloursWithSpecificNumberOfChars(6)}"
    )
    println("----------------------------------------------------------------------------------------------------")
    println("9. The following colours have less than 6 chars\n\t${colours.coloursWithLessCharsThan(6)}")
    println("----------------------------------------------------------------------------------------------------")
    println("10. True or false, is blue in the list? ${colours.isColourInTheList("blue")} ")
    println("----------------------------------------------------------------------------------------------------")
    println("11. The list of colours, each printed on a new line is:")
    //  Write Code here (below this comment) to print the list in this format:
    //    Colour: Red
    //    Colour: Orange
    //    ...
    //    Colour: Silver
    for (colour in colours.getAll()) {
        println("Colour: $colour")
    }
    println("----------------------------------------------------------------------------------------------------")
    // for the three additional functions you wrote in Colours.kt, print the returned value here.
    println("12. lowercase list is:\n\t${colours.coloursInAllLowerCase()}")
    println("----------------------------------------------------------------------------------------------------")
    println("13. The following colours have more than 4 chars\n\t${colours.coloursWithMoreCharsThan(4)}")
    println("----------------------------------------------------------------------------------------------------")
    println("14. Reverse sorted list is:\n\t${colours.coloursInReverseAlphabeticOrder()}")
    println("----------------------------------------------------------------------------------------------------")

}