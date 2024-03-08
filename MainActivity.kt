package com.exam.imam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.imam.modul.BottomBarItem
import com.exam.imam.modul.ButtonItem
import com.exam.imam.ui.theme.ImamTheme
import com.exam.imam.ui.theme.UiButton
import com.exam.imam.ui.theme.ImamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImamTheme {
                uix()
                Tampil()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Tampil() {
    ImamTheme {
        uix()
    }
}

@Composable
fun uix(
    modifier: Modifier=Modifier
){
    Scaffold (
        bottomBar ={ BottomBar()}
    ){innerPadding->
        Column (
            modifier =modifier.padding(innerPadding)
        ){
            Banner()
            BlankBox()
        }
    }
}

@Composable
fun Banner(
    modifier: Modifier=Modifier
){
    Box(modifier = modifier){
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp))
        {
            Image(painter = painterResource(id = R.drawable.banner_atas), contentDescription ="banner image", contentScale = ContentScale.Crop, modifier = Modifier.height(220.dp) )
            Row (modifier= Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 24.dp), horizontalArrangement = Arrangement.spacedBy(16.dp))
            {
                UiButton(
                    ButtonItem(
                        R.drawable.analysis_analytics_magnifier_search_locate_magnifyng_glass_icon_153884,
                        "Tracking"
                    ),
                )
                UiButton(
                    ButtonItem(R.drawable.calculator_icon, "Hitung Pungutan"),
                )
                UiButton(
                    ButtonItem(
                        R.drawable.banking_finance_business_money_credit_card_payment_method_icon_251684,
                        "Kurs Pajak"
                    ),
                )
                UiButton(
                    ButtonItem(R.drawable.book, "BTKI Lartas"),
                )

            }
            Row (modifier= Modifier
                .fillMaxWidth()
                .padding(start = 28.dp, end = 28.dp, top = 24.dp), horizontalArrangement = Arrangement.spacedBy(32.dp))
            {
                UiButton(
                    ButtonItem(
                        R.drawable.plane_flight_transport_airplane_airport_icon_209613,
                        "E-Customs"
                    ),
                )
                UiButton(
                    ButtonItem(R.drawable.barcode_icon_138897, "  IMEI  "),
                )
                UiButton(
                    ButtonItem(
                        R.drawable.ic_store_128_28857,
                        "      TPB      "
                    ),
                    modifier = Modifier.size(40.dp)
                )
                UiButton(
                    ButtonItem(R.drawable.box_icon_155728, "Pabean"),
                )

            }

            Row (modifier= Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 24.dp, bottom = 24.dp), horizontalArrangement = Arrangement.spacedBy(40.dp))
            {
                UiButton(
                    ButtonItem(
                        R.drawable.smoking_cigar_cigarette_smoke_tobacco_medical_and_hehcare_cigarettes_icon_255612,
                        "Cukai"
                    ),
                )
                UiButton(
                    ButtonItem(R.drawable.truck_icon, "Manifes"),
                )
            }
        }
        Box(modifier = modifier
            .fillMaxWidth()
            .height(220.dp), contentAlignment = Alignment.BottomCenter){
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(8.dp)
                    .background(MaterialTheme.colorScheme.primary))
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(8.dp)
                    .background(MaterialTheme.colorScheme.secondaryContainer))
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(8.dp)
                    .background(MaterialTheme.colorScheme.primary))
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(8.dp)
                    .background(MaterialTheme.colorScheme.primary))
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(8.dp)
                    .background(MaterialTheme.colorScheme.primary))
            }
        }
    }
}

@Composable
fun BlankBox(modifier: Modifier=Modifier){
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.LightGray))
}

@Composable
fun BottomBar(
    modifier: Modifier=Modifier
){
    NavigationBar (
        containerColor = MaterialTheme.colorScheme.background,
        contentColor =  MaterialTheme.colorScheme.secondary,
        modifier=modifier
    ){
        val navigationItems= listOf(
            BottomBarItem(
                title = "Home",
                icon= Icons.Default.Home
            ),
            BottomBarItem(
                title = "Notification",
                icon= Icons.Default.Notifications
            ),
            BottomBarItem(
                title = "Profil",
                icon= Icons.Default.AccountCircle
            ),
        )
        navigationItems.map {
            NavigationBarItem(
                selected = it.title==navigationItems[0].title,
                onClick = {  },
                icon = { Icon(imageVector = it.icon,contentDescription = null) },
                label={Text(it.title)}
            )
        }
    }
}
