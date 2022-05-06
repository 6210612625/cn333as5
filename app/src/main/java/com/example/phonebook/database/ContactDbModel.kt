package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_family") val isFamily: Boolean,




    ) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Anuradee", "0988948586", false, false, 1, false,false),
            ContactDbModel(2, "Bank", "0834567324", false, false, 2, false,false),
            ContactDbModel(3, "Cream", "0823145654", false, false, 3, false,false),
            ContactDbModel(4, "Kot", "086578986", false, false, 4, false, false),

        )
    }
}
