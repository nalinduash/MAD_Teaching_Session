package com.example.kuppi.s4.complete.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.kuppi.s4.complete.InventoryApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for ItemEditViewModel
//        initializer {
//            ItemEditViewModel(
//                this.createSavedStateHandle()
//            )
//        }
//        // Initializer for ItemEntryViewModel
//        initializer {
//            ItemEntryViewModel()
//        }
//        // Initializer for ItemDetailsViewModel
        initializer {
            ItemEntryViewModel()
        }
//        // Initializer for HomeViewModel
//        initializer {
//            HomeViewModel()
//        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [InventoryApplication].
 */
fun CreationExtras.inventoryApplication(): InventoryApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)