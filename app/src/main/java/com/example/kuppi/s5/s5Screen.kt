package com.example.kuppi.s5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.Polygon
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberUpdatedMarkerState

@Composable
fun s5ScreenFunc(){
    val Induruwa = LatLng(6.3768991, 80.0122689)
    val induruwaMarkerState = rememberUpdatedMarkerState(position = Induruwa)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(Induruwa, 15f)
    }

    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ){
        Marker(
            state = induruwaMarkerState,
            title = "Induruwa",
            snippet = "Marker in Induruwa")
    }
}

//@Composable
//fun s5ScreenFunc(){
//    val Induruwa = LatLng(6.3768991, 80.0122689)
//    val Kelaniya = LatLng(6.9565258, 79.9152937)
//    val Kandy = LatLng(7.2945874, 80.6051819)
//
//    val cameraPositionState = rememberCameraPositionState {
//        position = CameraPosition.fromLatLngZoom(Induruwa, 9f)
//    }
//
//    val points = listOf( Induruwa, Kelaniya, Kandy)
//
//    GoogleMap(
//        modifier = Modifier.fillMaxSize(),
//        cameraPositionState = cameraPositionState
//    ){
//        Polygon(
//            points = points,
//            fillColor = Color.Black.copy(alpha = 0.5f),
//            strokeColor = Color.Red
//        )
//    }
//}

//@Composable
//fun s5ScreenFunc(){
//    val Induruwa = LatLng(6.3768991, 80.0122689)
//    val Kelaniya = LatLng(6.9565258, 79.9152937)
//    val Kandy = LatLng(7.2945874, 80.6051819)
//
//    val induruwaMarkerState = rememberUpdatedMarkerState(position = Induruwa)
//    val kelaniyaMarkerState = rememberUpdatedMarkerState(position = Kelaniya)
//    val kandyMarkerState = rememberUpdatedMarkerState(position = Kandy)
//
//    val cameraPositionState = rememberCameraPositionState {
//        position = CameraPosition.fromLatLngZoom(Induruwa, 9f)
//    }
//
//    val points = listOf( Induruwa, Kelaniya, Kandy)
//
//    val properties by remember {
//        mutableStateOf(MapProperties(mapType = MapType.SATELLITE))
//    }
//
//    GoogleMap(
//        modifier = Modifier.fillMaxSize(),
//        cameraPositionState = cameraPositionState,
//        properties = properties
//    ){
//        Polygon(
//            points = points,
//            fillColor = Color.Black.copy(alpha = 0.5f),
//            strokeColor = Color.Red
//        )
//    }
//}


//@Composable
//fun s5ScreenFunc() {
//    val Induruwa = LatLng(6.3768991, 80.0122689)
//    val Kelaniya = LatLng(6.9565258, 79.9152937)
//    val Kandy = LatLng(7.2945874, 80.6051819)
//
//    val cameraPositionState = rememberCameraPositionState {
//        position = CameraPosition.fromLatLngZoom(Induruwa, 9f)
//    }
//
//    val points = listOf(Induruwa, Kelaniya, Kandy)
//
//    var uiSettings by remember {
//        mutableStateOf(MapUiSettings())
//    }
//
//
//    Box(modifier = Modifier.fillMaxSize()) {
//        GoogleMap(
//            modifier = Modifier.fillMaxSize(),
//            cameraPositionState = cameraPositionState,
//            uiSettings = uiSettings
//        ) {
//            Polygon(
//                points = points,
//                fillColor = Color.Black.copy(alpha = 0.5f),
//                strokeColor = Color.Red
//            )
//        }
//
//        Switch(
//            checked = uiSettings.zoomControlsEnabled,
//            onCheckedChange = {
//                uiSettings = uiSettings.copy(zoomControlsEnabled = it)
//            }
//        )
//    }
//}
