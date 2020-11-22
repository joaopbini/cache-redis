package com.example.redisweb.student.api

import com.example.redisweb.student.model.Student
import com.example.redisweb.student.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/student")
class StudentApi(private val studentService: StudentService) {

    @PostMapping
    fun save(@RequestBody student: Student): Student {
        return studentService.save(student)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String): Student? {
        return studentService.getById(id)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String): Student? {
        return studentService.delete(id)
    }

}
