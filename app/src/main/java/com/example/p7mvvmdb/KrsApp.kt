package com.example.p7mvvmdb

import android.app.Application
import com.example.p7mvvmdb.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    // Fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        // Membuat instance ContinerApp
        containerApp = ContainerApp(this)
        // instance adalah object yang dibuat dari class
    }
}