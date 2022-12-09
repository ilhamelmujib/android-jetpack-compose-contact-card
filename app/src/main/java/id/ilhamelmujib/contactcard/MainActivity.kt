package id.ilhamelmujib.contactcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ilhamelmujib.contactcard.ui.theme.ContactCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        ContactCard()
                        Arrangement()
                    }
                }
            }
        }
    }
}

@Composable
fun ContactCard() {
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.kucheng),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "Online Status",
                tint = Color.Green,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Kucheng Oren",
                fontWeight = FontWeight.Bold
            )
            Text("Online")
        }
    }
}

@Composable
fun Arrangement() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            MyButton("A", Modifier.width(60.dp))
            MyButton("B", Modifier.width(60.dp))
            MyButton("C", Modifier.width(60.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            MyButton("A", Modifier.width(60.dp))
            MyButton("B", Modifier.width(60.dp))
            MyButton("C", Modifier.width(60.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MyButton("A", Modifier.width(60.dp))
            MyButton("B", Modifier.width(60.dp))
            MyButton("C", Modifier.width(60.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            MyButton("A")
            MyButton("B")
            MyButton("C")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            MyButton("A")
            MyButton("B")
            MyButton("C")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            MyButton("A")
            MyButton("B")
            MyButton("C")
        }
    }
}

@Composable
fun AlignmentColumn() {
    Row {
        Column(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.Start
        ) {
            ManyButton()
        }
        Column(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            ManyButton()
        }
        Column(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.End

        ) {
            ManyButton()
        }
    }
}

@Composable
fun AlignmentRow() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            ManyButton()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ManyButton()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            ManyButton()
        }
    }
}

@Composable
fun AlignmentBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopStart) {
        MyButton(text = "Top Start")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        MyButton(text = "Top Center")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
        MyButton(text = "Top End")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
        MyButton(text = "Center Start")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        MyButton(text = "Center")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd) {
        MyButton(text = "Center End")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
        MyButton(text = "Bottom Start")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        MyButton(text = "Bottom Center")
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
        MyButton(text = "Bottom End")
    }
}

@Composable
fun Weight() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row {
            MyButton(text = "1", Modifier.weight(1f))
            MyButton(text = "1", Modifier.weight(1f))
            MyButton(text = "1", Modifier.weight(1f))
        }
        Row {
            MyButton(text = "1", Modifier.weight(1f))
            MyButton(text = "2", Modifier.weight(2f))
            MyButton(text = "1", Modifier.weight(1f))
        }
        Row {
            MyButton(text = "1", Modifier.weight(1f))
            MyButton(text = "2", Modifier.weight(2f))
            MyButton(text = "3", Modifier.weight(3f))
        }
        Row {
            MyButton(text = "1", Modifier.weight(1f))
            MyButton(text = "2", Modifier.weight(2f))
            MyButton(text = "3 fill false", Modifier.weight(3f, fill = false))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardPreview() {
    ContactCardTheme {
        ContactCard()
    }
}

@Preview(showBackground = true)
@Composable
fun ArrangementPreview() {
    ContactCardTheme {
        Arrangement()
    }
}

@Preview
@Composable
fun AlignmentColumnPreview() {
    ContactCardTheme {
        AlignmentColumn()
    }
}

@Preview
@Composable
fun AlignmentRowPreview() {
    ContactCardTheme {
        AlignmentRow()
    }
}

@Preview
@Composable
fun AlignmentBoxPreview() {
    ContactCardTheme {
        AlignmentBox()
    }
}

@Preview
@Composable
fun WeightPreview() {
    ContactCardTheme {
        Weight()
    }
}

@Composable
fun MyButton(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier.padding(8.dp)
    ) {
        Text(text)
    }
}

@Composable
fun ManyButton() {
    MyButton(
        text = "A", modifier = Modifier
            .width(100.dp)
            .height(100.dp)
    )
    MyButton(
        text = "B", modifier = Modifier
            .width(80.dp)
            .height(80.dp)
    )
    MyButton(
        text = "C", modifier = Modifier
            .width(60.dp)
            .height(60.dp)
    )
}