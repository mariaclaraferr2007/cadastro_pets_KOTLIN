package com.example.cadastropets22300570.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cadastropets22300570.model.PetModel

interface PetDao {
    @Insert
    fun insertUser(usuario: PetModel): Long
    @Update
    fun updateUser(usuario: PetModel): Int
    @Delete
    fun deleteUser(usuario: PetModel): Int
    @Query("SELECT * FROM Pet WHERE id_pet = :id")
    fun get(id: Int): PetModel
    @Query("SELECT * FROM Pet")
    fun getAll(): List<PetModel>

}