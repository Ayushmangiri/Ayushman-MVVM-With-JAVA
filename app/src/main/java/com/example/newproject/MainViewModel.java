package com.example.newproject;

import com.google.gson.JsonObject;

import javax.swing.JOptionPane;

public class MainViewModel {
    private MainRepository repository;

    public MainViewModel() {
        this.repository = new MainRepository();
    }

    // Method to handle login button click event
    public void onLogin(String email, String password) {
        boolean isValid = repository.isValidCredentials(email, password);
        if (isValid) {
            JOpt.showMessageDialog(null, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid email or password. Please try again.");
        }
    }

    public static void main(String[] args) {
        // Instantiate and show the login UI
        loginApp = new LoginApp(new MainViewModel());
        loginApp.setVisible(true);
    }
}
