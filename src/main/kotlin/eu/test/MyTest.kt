package eu.test

class MyTest {

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            val l = listOf(1, 2, 5)

            val resIndexOf = l.indexOf(5)   // method indexOf will show sources from collections.kotlin_builtins
            println("resIndexOf == $resIndexOf")

            val resJoin = l.joinToString(", ") // method joinToString will show Decompiled class of CollectionsKt.class
            println("resJoin == $resJoin")
        }
    }
}