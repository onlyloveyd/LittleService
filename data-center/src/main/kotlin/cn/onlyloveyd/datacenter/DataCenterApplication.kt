package cn.onlyloveyd.datacenter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class DataCenterApplication

fun main(args: Array<String>) {
    SpringApplication.run(DataCenterApplication::class.java, *args)
}
