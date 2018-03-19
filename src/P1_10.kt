package P2_10

import java.util.*


val scan = Scanner(System.`in`)

fun main(args: Array<String>) {


    var balance = 10000
    var opers = listOf(-11000, +1000, -1000)

    for (oper in opers) {
        if(balance + oper < 0){
            print("Ошибка, недостаточно средств для списания. Баланс - $balance руб, нужно - ${Math.abs(oper)} руб")
            return
        }
        balance += oper
    }
    print("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - $balance руб")


/*
    var balance = scan.nextInt()
    while (scan.hasNext()){
        val oper = scan.nextInt()
        if(balance + oper < 0){
            print("Ошибка, недостаточно средств для списания. Баланс - $balance руб, нужно - $oper руб")
            return
        }
        balance += oper
    }
    print("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - $balance руб")
*/





//    var bal = scan.nextInt()
//    while(scan.hasNext()){
//        val op = scan.nextInt()
//        if(bal - op < 0) {
//            print("Ошибка, недостаточно средств для списания. Баланс - ${bal} руб, нужно - ${op} руб")
//            return
//        } else bal -= op
//    }
//    print("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - ${bal} руб")





//    var currSale = 0
//    for (o in opers) {
//        currSale = s
//        if (s > balance){
//            stop = true
//            break
//        }
//        balance -= currSale
//    }
//    if (!stop) print("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - $balance руб")
//    else print("Ошибка, недостаточно средств для списания. Баланс - ${balance} руб, нужно - $currSale руб")


//    var l = listOf<Int>()
//    while (scan.hasNext()) l += scan.nextInt()
//    val max = l.max()
//    for((i,v) in l.withIndex())
//        if (v == max){
//            print("$v $i")
//            break
//        }

//    var max = scan.nextInt()
//    while(scan.hasNext()) {
//        var n = scan.nextInt()
//        if(max < n) max = n
//    }
//    print(max)

//    var max = 0
//    while(scan.hasNext()) {
//        var n = scan.nextInt()
//        if(max < n) max = n
//    }
//    print(max)

//    val arr = IntArray(scan.nextInt(), { scan.nextInt() })
//    val t = scan.nextInt()
//    print(arr.filter { it == t }.sum())

//    var sum = 0
//    val r = 1..scan.nextInt()
//    r.forEach { sum += scan.nextInt() }
//    print(sum)

//    val r = 1..scan.nextInt()
//    val n = scan.nextInt()
//    print(r.map { it * n }.joinToString(separator = " "))

//    val n = scan.nextInt()
//    val arr = Array(n, {""})
//    val r = n - 1 downTo 0
//    for(i in r){ arr[i] = scan.next().reversed()}
//    println(arr.joinToString(" "))


//    var arr = Array(10) { 0 }
//    repeat(10){arr[it] = scan.nextInt()}
//    println(arr.reversed().joinToString(" "))

//    print(calc(5,6))
//
//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    val c = scan.nextInt()
//    val s = (a + b + c).toString()
//    var s1 = "${s[s.length - 1]}${s.substring(1, s.length - 1)}${s[0]}".toInt()
//    println(s1)

//    var l = scan.nextLong()
//    ++l
//    val s = l.toString()
//    println("${s.substring(0, s.length - 2)}Σ${s.takeLast(1)}")

//    var r = "incorrect"
//    var c = scan.next()[0]
//    if(c.isLetter()){
//        r = if(c.isUpperCase()) c.toLowerCase().toString() else c.toUpperCase().toString()
//    }
//    println("$r")

//    var a = "Hello"
//    a.toUpperCase()
//    a.replace('e', 'l')
//    a.substring(3)
//    a.replaceAfter("l", "OOOO")
//    a.capitalize()
//    a.toLowerCase()
//    a.decapitalize()
//    a.trim().first()
//    a.replace(Regex("[A-z]"), "LOLOLOLOLO")

//    val a = scan.next()
//    val b = scan.next()
//    val r = when{
//        a.startsWith(b) -> 1
//        a.endsWith(b) -> 3
//        a.contains(b) -> 2
//        else -> 4
//    }
//    println(r)

//    val a = scan.next()
//    val b = scan.next()
//    println("${a.replace(b, "_")} ${a.length - a.replace(b, "").length}")

//    val n = scan.nextInt()
//    val d = scan.nextDouble()
//    val r = when(n){
//        1 -> Math.pow(d, d)
//        2 -> Math.floor(d)
//        3 -> Math.ceil(d)
//        4 -> Math.round(d)
//        5 -> Math.abs(d)
//        6 -> Math.sqrt(d)
//        else -> 2 * Math.pow(d, 2.0)
//    }
//    println(r)

//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    val c = scan.nextInt()
//    val sum = a + b
//    val cost = 100000
//    val sumDiscount = when (sum / c) {
//        in 0..9999 -> cost * 50 / 100
//        in 10000..11999 -> cost * 40 / 100
//        in 12000..15999 -> cost * 30 / 100
//        in 16000..17999 -> cost * 20 / 100
//        in 18000..19999 -> cost * 10 / 100
//        else -> 0
//    }
//    println(cost - sumDiscount)

//    val countEatAtDay = scan.nextInt()
//    val costLunch = scan.nextInt()
//    val costDay = scan.nextInt()
//    val costRoute = scan.nextInt() * 2
//    val countDay = scan.nextInt()
//    val discount = scan.nextInt()
//
//    val sumDay = (costLunch * countEatAtDay) + costDay
//    val sumTrip = sumDay * countDay + costRoute - discount
//
//    println(sumTrip)

//    val n1 = scan.nextInt()
//    val n2 = scan.nextInt()
//    println(n1 - n2)

//    var ls = scan.nextLine().toCharArray()
//    ls = ls.reversedArray()
//    println(String(ls))

//    var s = scan.nextLine()
//    println(s.take(s.length / 2))

//    var ls = scan.nextLine().toLowerCase().toCharArray()
//    for(i in 0..ls.count() - 1 step 2){
//        ls[i] = ls[i].toUpperCase()
//    }
//    println(String(ls))

//    val n1 = scan.nextInt()
//    val n2 = scan.nextInt()
//    println(n1 * n1 - n2 * n2)

//    var s = scan.nextLine()
//    val r = when(s.length){
//        in 1..10 -> "A"
//        20 -> "B"
//        15 -> "C"
//        else -> "D"
//    }
//    println(r)

//    val a = scan.nextInt()
//
//    when(a){
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
//        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> println("T")
//        10, 100, 1000, 10000, 100000, 1000000 -> println("P")
//        else -> println("N")
//    }

//    val n = scan.nextDouble()
//    println(n)

//    val n1 = scan.nextInt()
//    val n2 = scan.nextInt()
//    val n3 = scan.nextInt()
//    val n4 = scan.nextInt()
//    val E = scan.nextBoolean()
//    val r = when{
//        E -> Math.min(n1, Math.min(n2, Math.min(n3, n4)))
//        else -> Math.max(n1, Math.max(n2, Math.max(n3, n4)))
//    }
//
//    println(r)

}