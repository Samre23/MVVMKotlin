package com.example.mvvmexample.model

import java.util.*

class User : Observable() {

    //First name of the user
    var firstName: String = ""
        set(value) {
            field = value
            setChangedAndNotify("firstName")
        }

    //Last name of the user
    var lastName: String = ""
        set(value) {
            field = value
            setChangedAndNotify("lastName")
        }

    //age of the user
    var age: Int = 0
        set(value) {
            field = value
            setChangedAndNotify("age")
        }

    //image url of the user
    var imageUrl: String = ""
        set(value) {
            field = value
            setChangedAndNotify("imageUrl")
        }

    // The tagline of the user
    var tagline: String = ""
        set(value) {
            field = value
            setChangedAndNotify("tagline")
        }

    // The gender of the user
    var female: Boolean = false
        set(value) {
            field = value
            setChangedAndNotify("female")
        }

    private fun setChangedAndNotify(field: Any) {
        setChanged()
        notifyObservers(field)
    }
}