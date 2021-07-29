package com.example.androidmodule2lesson6task1multiplicationtable

//class MTablePage (val title:String,val table:String) {}

class MTablePage (val number:Int) {

    var table: String
    var title: String


    init {
        title = "Multiplication table for " + number
        table = generateTable(number)
    }

    fun generateTable(num: Int): String {
        var result = ""
        var temp = ""
        for (i in 1..10) {
            if (i == 1) temp = num.toString() + "*" + i.toString() + "=" + num * i
            else temp = '\n' + num.toString() + "*" + i.toString() + "=" + num * i
            result = result + temp
        }

        return result


    }
}



