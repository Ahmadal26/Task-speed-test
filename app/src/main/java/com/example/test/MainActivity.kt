package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.CardRepo.CardRepo
import com.example.test.DataClass.CreditCard
import com.example.test.ui.theme.TESTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cards = CardRepo.dummyDataCard
        setContent {
            TESTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreditCardView(CreditCard("Ahmad","1323213112"," 01/25",45643),1323213112," 01/25","123",213,)
                }
            }
        }
    }
}





@Composable
fun CreditCardView(
    cards: CreditCard,
    cardNumber: Int,
    expiryDate: String,
    cardType:String,
    oasisID: Int,
    modifier: Modifier = Modifier

) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(200.dp)
    ) {
       // Box(){
         //   Image(painter = , contentDescription = )
        Column() {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                , horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "$cardNumber")

            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween){

                Text(text = "Expiry Date: $expiryDate ")
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = " $cardType")
                Text(text = "OasisID: $ $oasisID ")
            }



        }
    }
//}
}



@Composable
fun Greeting(card: CreditCard,name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TESTTheme {
//        CreditCardView(cardNumber = 5234234,"01/25","نادي الواحه",45643)
    }
}