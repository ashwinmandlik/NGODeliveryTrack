package com.fortradestudio.AkshayaPatra.recyclerAdapter

import androidx.recyclerview.widget.DiffUtil
import com.fortradestudio.AkshayaPatra.retrofit.VendorEntity
import java.util.*

class AddressDiffUtils(
    val newList: List<VendorEntity>,
    val oldList:List<VendorEntity>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].Sn==newList[newItemPosition].Sn
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].Address.trim()==newList[newItemPosition].Address.trim()
    }

}