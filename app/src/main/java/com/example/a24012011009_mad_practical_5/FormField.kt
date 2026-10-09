package com.example.a24012011009_mad_practical_5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormField(
    label: String,
    textState: String,
    onTextChange: (String) -> Unit,
    isPasswordField: Boolean = false,
    isNumber: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            modifier = Modifier.weight(0.9f)
        )

        OutlinedTextField(
            value = textState,
            onValueChange = { newValue ->
                if (!isNumber || newValue.all { it.isDigit() }) {
                    onTextChange(newValue)
                }
            },
            modifier = Modifier
                .weight(1.6f)
                .height(60.dp),
            textStyle = LocalTextStyle.current.copy(
                fontSize = 14.sp
            ),
            visualTransformation = if (isPasswordField) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            label = {
                Text(
                    text = "Enter $label",
                    fontSize = 12.sp
                )
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = when {
                    isPasswordField -> KeyboardType.Password
                    isNumber -> KeyboardType.Number
                    label == "Email" -> KeyboardType.Email
                    else -> KeyboardType.Text
                }
            )
        )
    }
}

@Composable
fun NumericOutlinedTextField(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = { newValue ->
            if (newValue.all { it.isDigit() }) {
                onValueChange(newValue)
            }
        },
        modifier = modifier,
        textStyle = LocalTextStyle.current.copy(
            fontSize = 14.sp
        ),
        label = {
            Text(
                text = "Enter $label",
                fontSize = 12.sp
            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        )
    )
}

@Preview(showBackground = true)
@Composable
fun FormFieldPreview() {
    FormField(
        label = "Name",
        textState = "",
        onTextChange = {}
    )
}









//package com.example.a24012011009_mad_practical_5
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.LocalTextStyle
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.text.input.VisualTransformation
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//@Composable
//fun FormField(
//    label: String,
//    textState: String,
//    onTextChange: (String) -> Unit,
//    isPasswordField: Boolean = false,
//    isNumber: Boolean = false
//){
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(
//            text = label,
//            fontSize = 18.sp,
//            modifier = Modifier.weight(1f) // try with 2f
//        )
//
//        if (!isNumber)
//            OutlinedTextField(
//                value = textState,
//                onValueChange = onTextChange,
//                modifier = Modifier.padding(start = 16.dp).weight(2f),
//                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
//                visualTransformation =
//                    (if (isPasswordField)
//                        PasswordVisualTransformation()
//                    else
//                            VisualTransformation.None),
//                label = {Text("Enter $label")},
//                placeholder = {Text("Enter $label")}
//            )
//    }
//}
//
//@Composable
//fun NumericOutlinedTextField(
//    label: String,
//    value: String,
//    modifier: Modifier = Modifier,
//    onValueChange: (String) -> Unit
//){
//    OutlinedTextField(
//        value = value,
//        onValueChange = { newValue ->
//            if (newValue.all { it.isDigit() }) {
//                onValueChange(newValue)
//            }
//        },
//        modifier = modifier,
//        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
//        label = {Text("Enter $label")},
//        placeholder = {Text("Enter $label")},
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//        visualTransformation = VisualTransformation.None
//    )
//}
//
//@Composable
//@Preview
//fun FormFieldPreview(){
//    FormField("Name", "", {})
//}
