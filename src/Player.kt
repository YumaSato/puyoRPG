
class Player {
    var name: String = ""
    var max: IntArray = intArrayOf(15, 110000)   //連鎖数,火力
    var mainChain: IntArray = intArrayOf(0, 0)
    var tajuChain: IntArray = intArrayOf(0, 0)
    var rensabiChain: IntArray = intArrayOf(0, 0)
    var subChain: IntArray = intArrayOf(0, 0)
    var defence: Int = 0                        //受けられる段数

    fun exhibit() {
        println("${name}の状態は、飽和連鎖量:${max[0]}連鎖、飽和連鎖火力:${max[1]}、現在の本線:${mainChain[0]}連鎖です。")
        if (tajuChain[0] > 0) {
            println("多重折り返しを使った${tajuChain[0]}連鎖の副砲を持っています。")
        }
        if (rensabiChain[0] > 0) {
            println("連鎖尾を使った${rensabiChain[0]}連鎖の副砲を持っています。")
        }
        if (subChain[0] > 0) {
            println("本線と接続していない${subChain[0]}連鎖の副砲を持っています。")
        }
    }
}


