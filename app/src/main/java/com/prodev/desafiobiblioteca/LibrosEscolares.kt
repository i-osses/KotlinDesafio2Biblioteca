package com.prodev.desafiobiblioteca

    data class LibrosEscolares(
        val bookname: String, val isbn: String, val year: Int, val editorial: String, val pages: Int, val price: Int, val autor:String, val digital: String
    )
val book1 = LibrosEscolares(
    "Sidarta",
    "A1",
    1900,
    "Ercilla",
    300,
    10000,
    "James N",
    "D"
)
val book2 = LibrosEscolares(
    "The doors of perception",
    "A2",
    1971,
    "Elekctra",
    200,
    25000,
    "Aldous Huxley",
    "D"
)
val book3 = LibrosEscolares(
    "Easy without books",
    "A3",
    2020,
    "House Editorial",
    300,
    990,
    "William Blacke",
    "I"
)
val book4 = LibrosEscolares(
    "Student book",
    "A4",
    1990,
    "New Editorial",
    270,
    21000,
    "New Autor",
    "D"
)
