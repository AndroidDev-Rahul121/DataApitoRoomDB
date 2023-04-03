package com.example.fetchdataapitordb.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fetchdataapitordb.models.ModelPostlistItem


@Database(entities = [ModelPostlistItem::class], version = 1)
abstract class PosteDatabase : RoomDatabase() {

    abstract fun postDao() : PostDao

    companion object{

        @Volatile
        private var INSTANCE: PosteDatabase? = null

        fun getDatabase(context: Context): PosteDatabase{
            if (INSTANCE == null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context,PosteDatabase::class.java, "posteDB").build()
                }
            }
            return INSTANCE!!
        }
    }
}