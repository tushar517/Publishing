package com.tushar517.demolibrary.commonUtils

import android.content.Context
import android.widget.Toast

class ShowToast {
    fun showToast(msg:String,mContext: Context){
        Toast.makeText(mContext,msg,Toast.LENGTH_LONG).show()
    }
}