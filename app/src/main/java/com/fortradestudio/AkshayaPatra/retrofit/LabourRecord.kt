package com.fortradestudio.AkshayaPatra.retrofit

import com.google.gson.annotations.SerializedName

data class LabourRecord(
    @SerializedName("delivered _to")
    val Address: String,

    val Category: String,
    @SerializedName("Delivery_person_name")
    val Labor_Name: String,
    @SerializedName("delivery_ID")
    val PID: String,
    @SerializedName("Time In")
    val Time_In: String,
    @SerializedName("Time out")
    val Time_out: String,
    @SerializedName("State")
    val Vendor_Name: String,
    val date: String,
    @SerializedName("Phone number")
    val phNo:String,
    @SerializedName("clocked out")
    val clockedOut:String,
    @SerializedName("UPLI")
    val upli:String,

    @SerializedName("Distance")
    val Distance:String,
)