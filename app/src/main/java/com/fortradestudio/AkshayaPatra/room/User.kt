package com.fortradestudio.AkshayaPatra.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,
    var name:String,
    var vendorName:String,
    var phoneNumber:String,
    var projectId:String,
    var category:String,
    var address:String,
    var distance:String
)