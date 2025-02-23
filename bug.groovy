def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item $index: $item"
        if (item == "stop") {
            return // This will exit the eachWithIndex loop prematurely
        }
    }
    println "This line may not execute if 'stop' is encountered"
}

myMethod(['a', 'b', 'stop', 'c'])