package com.example.binarchap6recyclerview

object Constant {

    private val honda = Mobil(
        merek = "Honda CRV",
        warna = "Hitam",
        kondisi = "Baru",
        harga = 450000000,
        tipe = "SUV"
    )
    private val suzuki = Mobil(
        merek = "Suzuki Ertiga",
        warna = "Silver",
        kondisi = "Baru",
        harga = 170000000,
        tipe = "Minivan"
    )
    private val toyota = Mobil(
        merek = "Toyota Camry",
        warna = "Hitam",
        kondisi = "Baru",
        harga = 650000000,
        tipe = "Sedan"
    )
    private val bmw = Mobil(
        merek = "BMW E30",
        warna = "Hitam",
        kondisi = "Bekas",
        harga = 130000000,
        tipe = "Sedan"
    )

    private val daihatsu = Mobil(
        merek = "Daihatsu Xenia",
        warna = "Putih",
        kondisi = "Baru",
        harga = 175000000,
        tipe = "Minivan"
    )

    private val mercedes = Mobil(
        merek = "Mercedes",
        warna = "Hitam",
        kondisi = "Bekas",
        harga = 230000000,
        tipe = "Sedan"
    )

    private val wuling = Mobil(
        merek = "Wuling Almaz",
        warna = "Merah",
        kondisi = "Baru",
        harga = 200000000,
        tipe = "SUV"
    )
    val mobils = listOf(
        honda, suzuki, toyota, bmw, daihatsu, mercedes, wuling
    )
}