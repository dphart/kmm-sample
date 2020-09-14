package com.jetbrains.kmm.shared

import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@JsExport
@ExperimentalJsExport
class Calculator {
    companion object {
        fun sum(a: Int, b: Int): Int = a + b
    }
}

@ExperimentalJsExport
@JsExport
class TestClass(val hello:String)