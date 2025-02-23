def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item $index: $item"
        if (item == "stop") {
            return //This will exit only the closure, not the loop 
        }
    }
    println "This line will always execute"
}

myMethod(['a', 'b', 'stop', 'c'])


def myMethodCorrected(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
        String item = list[i]
        println "Item $i: $item"
        if (item == "stop") {
            continue // Skip the rest of the loop for this iteration
        }
    }
    println "This line will always execute"
}

myMethodCorrected(['a', 'b', 'stop', 'c'])