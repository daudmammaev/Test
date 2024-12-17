def countElements(array) {
    def resultMap = [:]

    array.each {
        resultMap[it] = resultMap.containsKey(it) ? resultMap[it] + 1 : 1
    }

    return resultMap
}

def array = [1, 3, 4, 5, 1, 5, 4]
def resultMap = countElements(array)

println resultMap
