package com.exam.imam.modul

import com.exam.imam.R

data class ButtonItem (
    val image: Int,
    val title:String
)

val Item= listOf(
    ButtonItem(R.drawable.plane_flight_transport_airplane_airport_icon_209613,"E-Customs Declaration"),
    ButtonItem(R.drawable.barcode_icon_138897,"IMEI"),
    ButtonItem(R.drawable.ic_store_128_28857,"TPB"),
    ButtonItem(R.drawable.box_icon_155728,"Pabean"),
    ButtonItem(R.drawable.smoking_cigar_cigarette_smoke_tobacco_medical_and_hehcare_cigarettes_icon_255612,"Cukai"),
    ButtonItem(R.drawable.truck_icon,"Manifes"),
)
