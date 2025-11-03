package com.example.kuppi.s3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun s3ScreenFunc(){
    var number1 by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 7)))
    }
    var number2 by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 7)))
    }
    var total by remember { mutableStateOf(0) }
    val calculator = Calculate()

    Column {
        OutlinedTextField(
            value = number1,
            onValueChange = { number1 = it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Number 1")},
        )
        OutlinedTextField(
            value = number2,
            onValueChange = { number2 = it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Number 2")},
        )

        Text("Total is $total")

        Button(
            onClick = {
                total = calculator.add(number1.text.toInt(), number2.text.toInt())
            }
        ) {
            Text(text = "Add")
        }
    }
}

//Test