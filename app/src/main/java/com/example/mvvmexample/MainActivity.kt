package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.mvvmexample.model.User
import com.example.mvvmexample.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// Create the model with initial data
        val user = User()
        user.age = 20
        user.female = false
        user.firstName = "Johnny"
        user.lastName = "Depp"
        user.imageUrl = "https://media.giphy.com/media/zv8PVZLXBj81a/giphy.gif"
        user.tagline = "When Johnny Depp is young"

        /// Create the view model
        val userViewModel = UserViewModel(user)

        /// Data-Binding
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)
        binding.setVariable(BR.user, userViewModel)
    }
}

//https://medium.com/@zhangqichuan/android-development-with-mvvm-and-kotlin-9598c3623ce1