package com.example.redisweb.student.service

import com.example.redisweb.student.model.Student
import com.example.redisweb.student.repository.StudentRepository
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.CachePut
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

    @Cacheable("student-id")
    fun getById(id: String): Student? {
        return studentRepository.findById(id)
    }

    @CachePut("student-id", key = "#student.id")
    fun save(student: Student): Student {
        return studentRepository.save(student)
    }

    @CacheEvict("student-id")
    fun delete(id: String): Student? {
        return studentRepository.delete(id)
    }

}