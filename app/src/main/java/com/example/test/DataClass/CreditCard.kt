package com.example.test.DataClass

data class CreditCard(

    val name: String,
    val cardNumber: String,
    val expiryDate: String,
    val oasisID: Int,
)



class Person (

    val name: String,
    val age: Int,
    val salary: Int,
    val creditCard: CreditCard,

    )


//fun showPerson(){

//    print("$CreditCard ")
//
//
//}
