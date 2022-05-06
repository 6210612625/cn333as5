package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#4CAF50","Mobile"),
            TagDbModel(2, "#F06292","Home"),
            TagDbModel(3, "#2196F3","Work"),
            TagDbModel(4, "#FFFFFF","office"),
            TagDbModel(5, "#E57373","Emergency"),

            )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
