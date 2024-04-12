//package com.example.finalproject;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//public class RegistrationActivity extends AppCompatActivity {
// private Button signup;
//
// @Override
// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_registration);
// clickListenHandler();
// init();
// }
// public void init(){
// signup = findViewById(R.id.signUp);
// }
// private void clickListenHandler() {
// signup = findViewById(R.id.signUp);
// //login Listener
// signup.setOnClickListener(new View.OnClickListener() {
// @Override
// public void onClick(View v) {
// // Start the UserViewActivity
// Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
// startActivity(intent);
// }
// });
// }
//}
package com.example.finalproject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class RegistrationActivity extends AppCompatActivity {
private EditText emailRegister;
private EditText passwordRegister;
private EditText confirmPassword;
private Button signUp;
private SharedPreferences sharedPreferences;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_registration);
// Initialize SharedPreferences
sharedPreferences = getSharedPreferences("user_credentials", Context.MODE_PRIVATE);
// Initialize views
emailRegister = findViewById(R.id.emailRegister);
passwordRegister = findViewById(R.id.passwordRegister);
confirmPassword = findViewById(R.id.confirmPassword);
signUp = findViewById(R.id.signUp);
// Set onClickListener for signUp button
signUp.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String email = emailRegister.getText().toString().trim();
String password = passwordRegister.getText().toString();
String confirm = confirmPassword.getText().toString();
// Check if password and confirm password match
if (!password.equals(confirm)) {
Toast.makeText(RegistrationActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
return;
}
// Store the email and password in SharedPreferences
SharedPreferences.Editor editor = sharedPreferences.edit();
editor.putString("email", email);
editor.putString("password", password);
editor.apply();
// Show a toast message to indicate successful registration
Toast.makeText(RegistrationActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
// Redirect user to login page
Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
startActivity(intent);
finish(); // Finish current activity to prevent going back to registration page
}
});
}
}
