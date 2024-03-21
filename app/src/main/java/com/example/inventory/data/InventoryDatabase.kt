package com.example.inventory.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class InventoryDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao

    companion object {
        /*
        * this value is never cached because @Volatile
        * all reads and writes are from the main memory
        * changes made by one thread to Instance are immediately visible to all other threads
        * */
        @Volatile
        var Instance: InventoryDatabase? = null

        fun getDatabase(context: Context): InventoryDatabase {
            /*
            * wrapping the code to get the database inside a synchronized block
            * means that only one thread of execution at a time can enter this block of code
            * which makes sure the database only gets initialized once
            * */
            return Instance ?: synchronized(this) {
                // Getting the database
                Room.databaseBuilder(
                    context,
                    InventoryDatabase::class.java,
                    "item_database"
                )
                    .fallbackToDestructiveMigration() // destroy and rebuild the data base if entity changes
                    .build() // create the database instance and initialize it
                    .also {
                        Instance = it // keeps the reference to the recently created db
                    }
            }
        }

    }
}