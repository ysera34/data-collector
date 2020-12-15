package org.inframincer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataCollectorServerApplication

fun main(args: Array<String>) {
    runApplication<DataCollectorServerApplication>(*args)
}
