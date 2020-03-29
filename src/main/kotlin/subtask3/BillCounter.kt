package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val totalSum = bill.sum()
        val string = "Bon Appetit"

        val annAllergic = bill[k]
        val annSum = (totalSum - annAllergic) / 2

        return if (annSum == b){
            string
        } else {
            (b - annSum).toString()
        }
    }
}
