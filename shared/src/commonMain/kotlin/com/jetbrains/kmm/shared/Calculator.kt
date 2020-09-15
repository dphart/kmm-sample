package com.jetbrains.kmm.shared

import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@JsExport
@ExperimentalJsExport
class Calculator {
   fun helloWorld() = "Hello"
}

@ExperimentalJsExport
@JsExport
class TestClass(val hello:String)