package com.example.redisweb.student.model

import com.example.redisweb.student.enumeration.Gender
import java.io.Serializable

data class Student(

        val id: String = "",

        val name: String? = null,

        val gender: Gender? = null,

        val grade: Int = 0

) : Serializable
