package com.sid.callbridge.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CallMonitorService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
