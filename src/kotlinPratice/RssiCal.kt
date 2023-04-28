package kotlinPratice

fun main(){

    println("Signal Level "+calculateSignalLevel(56,5))

}
class RssiCal {

}

fun calculateSignalLevel(rssi: Int, numLevels: Int): Int {

    val MIN_RSSI = -100
    val MAX_RSSI = -55

    return if (rssi <= MIN_RSSI) {
        0
    } else if (rssi >= MAX_RSSI) {
        numLevels - 1
    } else {
        val inputRange: Float = (MAX_RSSI - MIN_RSSI).toFloat()
        val outputRange = (numLevels - 1).toFloat()
        ((rssi - MIN_RSSI).toFloat() * outputRange / inputRange).toInt()
    }
}