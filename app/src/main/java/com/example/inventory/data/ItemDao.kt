package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Insert(
        onConflict = OnConflictStrategy.IGNORE
    )
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    /*
    * It is recommended to use Flow in the persistence layer
    * Using Flow as return type, you receive a notification when the data in the database change
    * room runs the query on the background thread because the Flow data type (no explicit suspend function)
    * */
    @Query("SELECT * FROM item WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * FROM item")
    fun getAllItems(): Flow<List<Item>>

}