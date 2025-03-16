package com.example.tweetsy.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tweetsy.R
import com.example.tweetsy.viewmodel.CategoryViewModel

@Composable
fun CategoryList(modifier: Modifier=Modifier,onClick : (category:String) -> Unit){
    val categoryViewModel : CategoryViewModel = hiltViewModel()
    val categories=categoryViewModel.category.collectAsState()
    if(categories.value.isEmpty()){
        Box(Modifier.fillMaxSize()){
            Text("Loading...",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
    else{
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier
        ) {
            items(categories.value.distinct()) {
                CategoryListItem(it,onClick)
            }
        }
    }
}

@Composable
fun CategoryListItem(category:String,onClick: (category: String) -> Unit){
    Box(
        modifier = Modifier
            .size(160.dp)
            .clickable {
                onClick(category)
            }
            .clip(RoundedCornerShape(20.dp))
            .paint(
                painterResource(id = R.drawable.category_bg),
                contentScale = ContentScale.Crop
            )
            .padding(4.dp),
        contentAlignment = Alignment.BottomCenter
    ){
        Text(
            text = category,
            fontSize = 20.sp,
            color= Color.Black,
            modifier = Modifier.padding(0.dp,10.dp),
            style = MaterialTheme.typography.bodySmall,
            textAlign = TextAlign.Center
        )
    }
}