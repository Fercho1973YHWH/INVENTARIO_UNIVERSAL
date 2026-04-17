package com.example.inventario_universal.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.inventario_universal.data.dao.*
import com.example.inventario_universal.data.entities.*

@Database(entities = [Producto::class, Venta::class, Compra::class, Gasto::class, Proveedor::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productoDao(): ProductoDao
    abstract fun ventaDao(): VentaDao
    abstract fun compraDao(): CompraDao
    abstract fun gastoDao(): GastoDao
    abstract fun proveedorDao(): ProveedorDao
}