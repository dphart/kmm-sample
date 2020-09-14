package com.jetbrains.kmm.shared

actual class Platform actual constructor() {
    actual val platform = "JAvascriopt"
}

@ExperimentalJsExport
@JsExport
class HelloTest(val hello:String)
fun hello()=HelloTest("hello")