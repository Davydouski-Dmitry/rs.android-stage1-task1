package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        val array: ArrayList<Int> = ArrayList(sadArray.toList())
        var a = 0

        while (a < array.size) {
            for (i in array.indices) {
                if (array.size<3){
                    break
                }
                if (i == 0) {
                    continue
                } else if (i == array.lastIndex) {
                    break
                } else if (array[i] > array[i + 1] + array[i - 1]) {
                    array.removeAt(i)
                }
            }
            a++
        }
        return array.toIntArray()
    }
}
