package com.example.p7mvvmdb.repository

import com.example.p7mvvmdb.data.dao.MahasiswaDao
import com.example.p7mvvmdb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs(
    private val mahasiswaDao : MahasiswaDao
):RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }
}