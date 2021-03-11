import java.util.*

fun main(args: Array<String>) {
    print("생성할 로또 횟수를 입력 하세요(1~5): ")
    val input = Scanner(System.`in`).nextInt()
    val lotto = Lotto()

    if(input in 1..5){ //생성할 횟수 범위 확인
        for (i in 1..input) { //입력한 횟수 함수 실행
            lotto.makeNum()
        }
    }
    else{
        println("횟수범위는 1~5입니다.")
    }
}

class Lotto {
    fun makeNum() {
        val set = HashSet<Int>() //중복을 허락하지 않는 set
        val random = Random()

        while (set.size < 7) { //7개 숫자가 나올때 까지 반복
            val randomNumber = random.nextInt(45)+1
            set.add(randomNumber)
        }
        val list = ArrayList<Int>(set)
        list.sort() //오름차순 정렬
        println(list)
    }
}