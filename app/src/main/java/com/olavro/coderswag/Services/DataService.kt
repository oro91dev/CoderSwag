package com.olavro.coderswag.Services

import com.olavro.coderswag.Model.Category
import com.olavro.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
            )

    val hoodies = listOf(
            Product("Devslopes shirt Black","$18", "shirt01"),
            Product("Devslopes Badge Light Gray","$20", "shirt02"),
            Product("Devslopes Logo Shirt Red","$22", "shirt03"),
            Product("Devslopes Hustle","$22", "shirt04"),
            Product("Kickflip Studio", "18", "shirt05")
    )
}