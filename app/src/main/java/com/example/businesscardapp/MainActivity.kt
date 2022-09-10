package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colors.background
                    color = Color(0xFF00222c)
                ) {
                    ActionBusinessCard()
                }
            }
        }
    }
}
@Composable
fun ActionBusinessCard() {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF003c4d))) {
        Column(
            Modifier.fillMaxWidth().weight(3f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            CompanyInformation()
        }
        Column(
            Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            ContactInformation()
        }
    }
}
@Composable
fun CompanyInformation() {
    val image = painterResource(id = R.drawable.android_logo)
    Image(painter = image, contentDescription = null,
        modifier = Modifier.size(width = 120.dp, height = 120.dp))
    Text(text= stringResource(R.string.fullname), fontSize = 36.sp, color = Color.White)
    Text(text= stringResource(R.string.title),
        fontWeight = FontWeight.Bold,
        color = Color(0xFF48dc9a),
        modifier = Modifier.padding(top = 8.dp)

    )
}
@Composable
fun ContactInformation() {
    Divider(color = Color.LightGray)
    Spacer(modifier = Modifier.height(8.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 60.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Rounded.Call, tint = Color(0xFF48dc9a),
            contentDescription = null)
        Text(text= stringResource(R.string.phone_num),
            color = Color.White,
            modifier = Modifier.padding(start = 10.dp))
    }
    Spacer(modifier = Modifier.height(8.dp))
    Divider(color = Color.LightGray)
    Spacer(modifier = Modifier.height(8.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 60.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Rounded.Share,
            tint = Color(0xFF48dc9a),
            contentDescription = null)
        Text(text= stringResource(R.string.social_share),
            color = Color.White,
            modifier = Modifier.padding(start = 10.dp))
    }
    Spacer(modifier = Modifier.height(8.dp))
    Divider(color = Color.LightGray)
    Spacer(modifier = Modifier.height(8.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 60.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Rounded.Email,
            tint = Color(0xFF48dc9a),
            contentDescription = null)
        Text(text= stringResource(R.string.email),
            color = Color.White,
            //color = MaterialTheme.colors.secondary,  // You Can Also use MaterialTheme Color
            modifier = Modifier.padding(start = 10.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
        BusinessCardAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ActionBusinessCard()
        }
    }
}