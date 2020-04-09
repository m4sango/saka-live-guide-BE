package com.m4sango.sakaliveguidebe.infrastructure.repository.utils

import org.springframework.core.io.ClassPathResource
import org.springframework.util.FileCopyUtils
import java.nio.charset.StandardCharsets

class FileUtils {
    companion object {
        fun getResourceFileAsString(filePath: String): String {
            val res = ClassPathResource(filePath)
            return String(FileCopyUtils.copyToByteArray(res.inputStream), StandardCharsets.UTF_8)
        }
    }
}