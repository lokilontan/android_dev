package com.example.sendingdatademo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    val name:String,
    val studentID:Int
):Parcelable
