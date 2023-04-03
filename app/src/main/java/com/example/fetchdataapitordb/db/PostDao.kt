package com.example.fetchdataapitordb.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fetchdataapitordb.models.ModelPostlist
import com.example.fetchdataapitordb.models.ModelPostlistItem

//
//@Dao
//interface PostDao {
//
//    @Insert
//    suspend fun addPoastes(postes: ModelPostlist)
//
//    @Query("SELECT * FROM poste")
//    suspend fun getPoastes(postes: ModelPostlist)
//}

@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPoastes(postes: List<ModelPostlistItem>)

    @Query("SELECT * FROM poste")
    suspend  fun getAllPosts(): List<ModelPostlistItem>
}
