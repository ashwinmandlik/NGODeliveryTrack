package com.fortradestudio.AkshayaPatra.retrofit

import com.google.gson.annotations.SerializedName

data class VendorEntity(
    @SerializedName("delivery_to")
    val Address: String,
    @SerializedName("KitchenName")
    val Customer_Name: String,
    @SerializedName("Project Status")
    val PO_Status: String,
    @SerializedName("Delivery ID")
    val Project_ID: String,
    val Sn: String,
    @SerializedName("State")
    val Vendor_Name: String

)