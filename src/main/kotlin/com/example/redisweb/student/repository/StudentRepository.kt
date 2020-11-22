package com.example.redisweb.student.repository

import com.example.redisweb.student.model.Student
import org.springframework.stereotype.Component

@Component
class StudentRepository {

    private val students = mutableMapOf<String, Student>()

    fun findById(id: String): Student? {

        Thread.sleep(2000)

        return students[id]
    }

    fun save(student: Student): Student {

        students[student.id] = student

        return student
    }

    fun delete(id: String): Student? {
        return students.remove(id)
    }

}
