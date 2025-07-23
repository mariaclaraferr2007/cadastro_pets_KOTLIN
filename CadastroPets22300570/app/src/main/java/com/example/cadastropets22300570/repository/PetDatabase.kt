package com.example.cadastropets22300570.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.cadastropets22300570.dao.PetDao
import com.example.cadastropets22300570.model.PetModel

@Database(entities = [PetModel::class], version = 1)
abstract class PetDatabase: RoomDatabase() {

    abstract fun usuarioDAO(): PetDao//Referência de UsuarioDAO, pois iremos selecionar essa classe por meio da instancia do banco

    companion object{
        private lateinit var INSTANCE: PetDatabase

        fun getDataBase(context: Context): PetDatabase{
            if(!::INSTANCE.isInitialized) {
                synchronized(PetDatabase::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, PetDatabase::class.java, "usuariodb").addMigrations(
                            MIGRATION_1_2, MIGRATION_2_3).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }



        private val MIGRATION_1_2: Migration = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

    }
}


