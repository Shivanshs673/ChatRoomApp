package com.example.chatroomapp

sealed class Screen(val route: String) {
    object SignInScreen : Screen("signinscreen")
    object SignUpScreen : Screen("signupscreen")
    object ChatRoomScreen : Screen("chatroomscreen")
    object ChatScreen : Screen("chatscreen")
}
