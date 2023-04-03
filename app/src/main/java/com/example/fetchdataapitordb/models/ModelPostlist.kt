package com.example.fetchdataapitordb.models

import androidx.room.Entity
import androidx.room.PrimaryKey

class ModelPostlist : ArrayList<ModelPostlistItem>()

@Entity(tableName = "poste")
data class ModelPostlistItem(
    val userId: Int,
    @PrimaryKey
    val id: Int,
    val title: String,
    val body: String
)