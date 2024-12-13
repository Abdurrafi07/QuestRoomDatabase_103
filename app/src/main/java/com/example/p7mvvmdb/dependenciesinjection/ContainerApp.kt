package com.example.p7mvvmdb.dependenciesinjection

import android.content.Context
import com.example.p7mvvmdb.data.database.KrsDatabase
import com.example.p7mvvmdb.repository.LocalRepositoryMhs
import com.example.p7mvvmdb.repository.RepositoryMhs

interface InterfaceContainerApp{
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy{
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}