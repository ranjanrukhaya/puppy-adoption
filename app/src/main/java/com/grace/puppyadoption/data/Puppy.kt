package com.grace.puppyadoption.data

import androidx.compose.runtime.Immutable
import com.grace.puppyadoption.R

@Immutable
data class Puppy(
    val id: Long,
    val name: String,
    val age: Int,
    val gender: String,
    val image: Int,
    val desc: String
)

/**
 * A fake repo returning list of puppies
 */
object PuppyRepo {
    fun getPuppiesData(): List<Puppy> = puppies
}

private val puppy1 = Puppy(
    id = 0L,
    name = "Leela",
    age = 2,
    gender = "Female",
    image = R.drawable.puppy1,
    desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"
)

private val puppies = listOf(
    puppy1,
    puppy1.copy(name = "Lucy", id = 1L, age = 2, gender = "Male", image = R.drawable.puppy2),
    puppy1.copy(name = "Sandy", id = 2L, age = 3, gender = "Female", image = R.drawable.puppy6),
    puppy1.copy(name = "Max", id = 3L, age = 4, gender = "Male", image = R.drawable.puppy5),
    puppy1.copy(name = "Joe", id = 4L, age = 5, gender = "Male", image = R.drawable.puppy3),
    puppy1.copy(name = "Boby", id = 5L, age = 2, gender = "Male", image = R.drawable.puppy4),
    puppy1.copy(name = "Bella", id = 6L, age = 3, gender = "Female", image = R.drawable.puppy7),
    puppy1.copy(name = "Cila", id = 7L, age = 2, gender = "Female", image = R.drawable.puppy8),
)
