package ro.upt.greenspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ViewHomes : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ViewHomesScreen()
    }
  }
}

@Composable
fun ViewHomesScreen() {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(Color(0xFFd1d5ca)), // Light background
    contentAlignment = Alignment.Center
  ) {
    Column(
      modifier = Modifier
        .padding(horizontal = 16.dp)
        .background(
          brush = Brush.horizontalGradient(
            colors = listOf(
              Color(0xFF77B97F),
              Color(0xFF5A8A64)
            )
          ),
          shape = RoundedCornerShape(16.dp)
        )
        .padding(50.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "App Logo",
        modifier = Modifier
          .padding(bottom = 16.dp)
          .size(150.dp)
          .shadow(30.dp, shape = RoundedCornerShape(100.dp))
      )

      Text(
        text = "View Homes",
        modifier = Modifier.padding(bottom = 30.dp),
        style = TextStyle(
          fontSize = 30.sp,
          fontWeight = FontWeight.Bold,
          brush = Brush.horizontalGradient(
            colors = listOf(
              Color(0xFF1B5E20),
              Color(0xFF4E342E)
            )
          )
        )
      )

      // Buttons for "Home 1," "Home 2," and "Home 3"
      Button(
        onClick = { /* Handle Home 1 action */ },
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 15.dp)
          .height(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(12.dp)
      ) {
        Text(
          text = "Home 1",
          style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            brush = Brush.horizontalGradient(
              colors = listOf(
                Color(0xFF1B5E20),
                Color(0xFF4E342E)
              )
            )
          )
        )
      }

      Button(
        onClick = { /* Handle Home 2 action */ },
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 15.dp)
          .height(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(12.dp)
      ) {
        Text(
          text = "Home 2",
          style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            brush = Brush.horizontalGradient(
              colors = listOf(
                Color(0xFF1B5E20),
                Color(0xFF4E342E)
              )
            )
          )
        )
      }

      Button(
        onClick = { /* Handle Home 3 action */ },
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 15.dp)
          .height(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(12.dp)
      ) {
        Text(
          text = "Home 3",
          style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            brush = Brush.horizontalGradient(
              colors = listOf(
                Color(0xFF1B5E20),
                Color(0xFF4E342E)
              )
            )
          )
        )
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun ViewHomesScreenPreview() {
  ViewHomesScreen()
}