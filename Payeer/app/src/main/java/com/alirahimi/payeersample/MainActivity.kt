package com.alirahimi.payeersample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.payeersample.ui.theme.PayeerSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PayeerSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0XFF302C3C)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0XFF302C3C))
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Scaffold(
                            topBar = {
                                TopAppBar(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    title = {
                                        Text(text = "Payeer Account")
                                    },
                                    actions = {
                                        IconButton(onClick = {}) {
                                            Icon(
                                                Icons.Filled.Notifications,
                                                contentDescription = null
                                            )

                                        }

                                        IconButton(onClick = {}) {
                                            Icon(
                                                Icons.Default.AccountBox,
                                                contentDescription = null
                                            )

                                        }

                                        IconButton(onClick = {}) {
                                            Icon(Icons.Filled.Settings, contentDescription = null)

                                        }
                                    },
                                    backgroundColor = Color(0XFF302C3C),
                                    contentColor = Color.White

                                )

                            },

                            content = {

                                Surface(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(Color(0XFF302C3C))
                                ) {
                                    Column(modifier = Modifier.background(Color(0XFF302C3C))) {

                                        WalletItem(
                                            name = "Bitcoin",
                                            abbreviation = "BTC",
                                            image = painterResource(id = R.drawable.bitcoin),
                                            amount = 12.0,
                                            toUSD = 0.87
                                        )
                                        WalletItem(
                                            name = "Ethereum",
                                            abbreviation = "ETH",
                                            image = painterResource(id = R.drawable.ethereum),
                                            amount = 34.0,
                                            toUSD = 0.99
                                        )
                                        WalletItem(
                                            name = "Bitcoin Cash",
                                            abbreviation = "BCH",
                                            image = painterResource(id = R.drawable.bitcoincash),
                                            amount = 77.0,
                                            toUSD = 5.99
                                        )
                                        WalletItem(
                                            name = "Litecoin",
                                            abbreviation = "LTC",
                                            image = painterResource(id = R.drawable.litecoin),
                                            amount = 734.0,
                                            toUSD = 0.9
                                        )
                                        WalletItem(
                                            name = "Dash",
                                            abbreviation = "DASH",
                                            image = painterResource(id = R.drawable.dash),
                                            amount = 23.0,
                                            toUSD = 9.9
                                        )
                                        WalletItem(
                                            name = "Tether",
                                            abbreviation = "USDT",
                                            image = painterResource(id = R.drawable.tether),
                                            amount = 24.0,
                                            toUSD = 0.99
                                        )
                                        WalletItem(
                                            name = "Ripple",
                                            abbreviation = "XRP",
                                            image = painterResource(id = R.drawable.ripple),
                                            amount = 98.0,
                                            toUSD = 2.9
                                        )
                                        WalletItem(
                                            name = "Dogecoin",
                                            abbreviation = "DOGE",
                                            image = painterResource(id = R.drawable.dogecoin),
                                            amount = 65.0,
                                            toUSD = 1.4
                                        )
                                        WalletItem(
                                            name = "Tron",
                                            abbreviation = "TRX",
                                            image = painterResource(id = R.drawable.tron),
                                            amount = 88.0,
                                            toUSD = 7.9
                                        )

                                    }
                                }
                            },
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun WalletItem(
    name: String, abbreviation: String, image: Painter, amount: Double, toUSD: Double
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        elevation = 12.dp,
        shape = RoundedCornerShape(8.dp),
        contentColor = Color.White,
        backgroundColor = Color(0XFF302C3C),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 16.dp, start = 8.dp)
                    .weight(0.15f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CircleImageView(
                    painter = image,
                    size = 32.dp
                )
            }
            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.475f)
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = abbreviation,
                    color = Color.Gray
                )

            }


            Column(
                modifier = Modifier
                    .padding(top = 8.dp, end = 16.dp)
                    .weight(0.475f),
                horizontalAlignment = Alignment.End,

                ) {
                Text(
                    text = amount.toString(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = "$toUSD USD",
                    color = Color.Gray
                )

            }

        }

    }
}

@Composable
fun CircleImageView(painter: Painter, size: Dp) {
    Image(
        painter = painter,
        contentDescription = "circle image",
        modifier = Modifier
            .clip(CircleShape)
            .size(size),
        contentScale = ContentScale.FillBounds
    )
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PayeerSampleTheme {
        Greeting("Android")
    }
}