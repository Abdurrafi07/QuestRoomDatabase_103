package com.example.p7mvvmdb.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.p7mvvmdb.data.dao.MahasiswaDao
import com.example.p7mvvmdb.data.entity.Mahasiswa

// Mendefinisikan database dengan tabel Mahasiswa
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        // Memastikan bahwa nilai variabel Instance selalu sama di semua thread
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, // Class database
                    "KrsDatabase" // Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}