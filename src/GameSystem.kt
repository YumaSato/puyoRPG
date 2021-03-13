fun main() {

    val p1 = Player()
    p1.name = "1P(先攻)"
    println("${p1.name}は何をしますか?\n1:先折GTRを組む。\n2:後折GTRを組む。\n3:メリ土台式速攻土台を組む。\n0:パス")
    val sentaku1 : Int = choice(4)
    when(sentaku1) {
        1 -> {p1.mainChain[0] = 3
            p1.mainChain[1] = 1000
            p1.defence = 1
            println("先折GTRの折り返しを組みました。")
        }
        2 -> {p1.max[0] = 14
            p1.max[1] = 100000
            p1.mainChain[0] = 3
            p1.mainChain[1] = 1000
            p1.defence = 1
            println("後折GTRの連鎖尾部分を組みました。")
        }
        3 -> {p1.max[0] = 13
            p1.max[1] = 80000
            p1.mainChain[0] = 1
            p1.mainChain[1] = 40
            p1.subChain[0] = 2
            p1.subChain[1] = 1000
            p1.defence = 2
            println("メリ土台式の速攻土台を組みました。2ダブを持ちました。")
        }

    }
    p1.exhibit()
    println("")



    val p2 = Player()
    p2.name = "2P(後攻)"
    println("${p2.name}は何をしますか?\n1:先折GTRを組む。\n2:後折GTRを組む。\n3:メリ土台式速攻土台を組む。\n0:パス")
    val sentaku2 : Int = choice(4)
    when(sentaku2) {
        1 -> {p2.mainChain[0] = 3
            p2.mainChain[1] = 1000
            p2.defence = 1
            println("先折GTRの折り返しを組みました。")
        }
        2 -> {p2.max[0] = 14
            p2.max[1] = 100000
            p2.mainChain[0] = 3
            p2.mainChain[1] = 1000
            p2.defence = 1
            println("後折GTRの連鎖尾部分を組みました。")
        }
        3 -> {p2.max[0] = 13
            p2.max[1] = 80000
            p2.mainChain[0] = 1
            p2.mainChain[1] = 40
            p2.subChain[0] = 2
            p2.subChain[1] = 1000
            p2.defence = 2
            println("メリ土台式の速攻土台を組みました。2ダブを持ちました。")
        }

    }
    p2.exhibit()




}







fun choice(numOfChoice : Int): Int {
    println("行動を選択してください")
    var taku = 10000
    do {var input : String = readLine()?: "0"
        try {
            taku = input.toInt()
        } catch (e: NumberFormatException){}
        if(taku>=numOfChoice){
            println("有効な数字を入力してください。")
        }
    }while(taku>=numOfChoice)

    println("${taku}を選択しました。afafafafafafafafafafafafa")
    return taku
}