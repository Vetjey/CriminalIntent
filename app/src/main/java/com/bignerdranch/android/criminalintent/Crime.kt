package com.bignerdranch.android.criminalintent

import java.util.*

class Crime {
    var Id:UUID = UUID.randomUUID()
    var Title:String = ""
    var Date = java.util.Date()
    var Solved = false
}