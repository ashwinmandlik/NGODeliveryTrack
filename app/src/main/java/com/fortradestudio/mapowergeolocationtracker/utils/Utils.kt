package com.fortradestudio.mapowergeolocationtracker.utils

import android.app.Activity
import android.content.Context
import android.location.Address
import android.location.Geocoder

class Utils(private val activity: Activity) {

    companion object{
        private const val verifyPreference ="verification_preferences"
    }

    // to store in cache
    fun storeInCache(s:String,key:String){
        val preferences = activity.getSharedPreferences(verifyPreference,Context.MODE_PRIVATE)
        val editor = preferences.edit();
        editor.putString(key,s);
        editor.apply()
    }
    fun storeInCache(s:String,key:String,context: Context){
        val preferences = context.getSharedPreferences(verifyPreference,Context.MODE_PRIVATE)
        val editor = preferences.edit();
        editor.putString(key,s);
        editor.apply()
    }

    fun getFromCache(key: String):String?{
        val preferences = activity.getSharedPreferences(verifyPreference,Context.MODE_PRIVATE)
        return preferences.getString(key,null);
    }
    fun getFromCache(key: String,context: Context):Boolean?{
        val preferences = context.getSharedPreferences(verifyPreference,Context.MODE_PRIVATE)
        return preferences.getBoolean(key,false);
    }

    fun getLocationFromAddress(add : String):Address?{
        val coder = Geocoder(activity)
        val p1 = null
        val address = coder.getFromLocationName(add,5)
        if( address.isEmpty()){
            return null
        }
        return address[0]
    }

}