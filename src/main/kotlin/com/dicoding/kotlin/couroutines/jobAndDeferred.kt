package com.dicoding.kotlin.couroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start a new job")
    }
    job.start()
//    job.join()
    println("Other task")

//    canceled job
    val jobCancel = launch {
        delay(5000)
        println("Start a new job2")
    }

    delay(2000)
    jobCancel.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job")
    if (job.isCancelled) {
        println("Job is cancelled")
    }
}