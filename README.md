# Practical 5 — Login and Registration Screens

### AIM
Create an Android application that includes Login and Registration screens using **Jetpack Compose**.

## Overview
This practical demonstrates how to build login and registration user interfaces in an Android application with Kotlin and Jetpack Compose. Users can move between the two screens, enter details in form fields, and receive Toast feedback when they tap the action buttons.

## Features
- Login screen with Email and Password fields.
- Registration screen with Name, Phone Number, City, Email, Password, and Confirm Password fields.
- Navigation from **SIGN UP** on the Login screen to the Registration screen.
- Navigation from **LOGIN** on the Registration screen back to the Login screen.
- Password fields display masked characters.
- Light and dark theme color styling.
- Toast messages when the Login and Register buttons are tapped.
- Reusable `FormField` composable for form inputs.

## Technologies Used
- **Language:** Kotlin
- **UI Toolkit:** Jetpack Compose
- **UI Components:** Material 3
- **Navigation:** Navigation Compose
- **IDE:** Android Studio

## Screens
### Login Screen
Contains the GUNI logo, Email and Password fields, a Forgot Password text, a Login button, and a **SIGN UP** link.

<img width="388" height="862" alt="Screenshot 2026-10-13 143710" src="https://github.com/user-attachments/assets/7f4ac26b-5f03-47ba-a44c-c27b1130000c" />

### Registration Screen
Contains the GUNI logo, Name, Phone Number, City, Email, Password, and Confirm Password fields, a Register button, and a **LOGIN** link.

<img width="385" height="858" alt="Screenshot 2026-10-13 143722" src="https://github.com/user-attachments/assets/9ed8e968-bcdf-4e33-90fd-5b4c347d6cbb" />


## Project Structure
```text
app/src/main/java/com/example/a24012011009_mad_practical_5/
├── MainActivity.kt          # App entry point
├── AppNavigation.kt         # Navigation between screens
├── LoginScreen.kt           # Login UI and button feedback
├── RegisterScreen.kt       # Registration UI and button feedback
├── FormField.kt             # Reusable form input composable
└── ui/theme/                # App theme files
```
