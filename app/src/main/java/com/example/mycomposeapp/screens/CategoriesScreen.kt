package com.example.mycomposeapp.screens


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mycomposeapp.viewModels.CategoryViewModel

@Composable
    fun CategoryListView(){
        val categoryViewModel: CategoryViewModel = hiltViewModel()
        val category  =  categoryViewModel.categories.collectAsState()
        LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.SpaceAround){
            items(category.value){
                CategoryDetailView(it)
            }
        }

        }

    @Composable
    fun CategoryDetailView(text: String){
        Box(modifier = Modifier
            .padding(4.dp)
            .border(2.dp, Color.Gray)) {
            Text( text)

        }
    }