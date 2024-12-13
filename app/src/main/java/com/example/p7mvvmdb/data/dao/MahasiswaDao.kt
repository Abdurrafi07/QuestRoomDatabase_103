package com.example.p7mvvmdb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.p7mvvmdb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Query("select * from mahasiswa")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}