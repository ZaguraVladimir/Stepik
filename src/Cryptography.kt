// шифры замены
//шифр Цезаря
//шифр Атбаш

// шифры перестановки
//шифр Скитала.
//      Представлял собой длинную ленту с буквами, ключом этого шифра являлся твердый цилиндр определенного диаметра: ленту наматывали на цилиндр и получали исходный текст.
//Aнаграммы(не совсем шифр, потому как для дешифрации не используется ключ)
//шифр перестановки

//шифр Бэкона
//Диск Энея
//Квадрат Полибия
//Решетка Кардано

interface ICryptography {
    fun encode(message: String, key: String): String
    fun decode(message: String, key: String): String
}

val AlphabetEN = " ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
val AlphabetRU = " АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".toCharArray()

fun CharArray.getNum(c: Char): Int {
    val num = indexOf(c.toUpperCase());
    if (num !in 1 until count()) {
        throw IllegalArgumentException("'$c' isn't alphabetical symbol")
    }
    return num
}

fun String.clean() = filter { it.isLetter() }

class PermutationVertical : ICryptography {
    override fun encode(message: String, key: String): String {
        val filterMessage = message.filter { it.isLetter() }
        val table = Array(Math.ceil((filterMessage.length/key.length).toDouble()).toInt(), {Array(key.length, {' '})})
        for (i in 0 until table.count()){
             //table[i] = ;
        }
        var messageEncrypted = ""



        return messageEncrypted
    }

    override fun decode(message: String, key: String): String {
        var messageDecrypted = ""



        return messageDecrypted
    }

    private fun test() = 0
}

fun main(args: Array<String>) {

    val message = "Cегодня очень теплая погода!!!"
    val key = "кактус"

    val algPV = PermutationVertical()
    println("Исходное сообщение: '$message', ключ: '$key'. Зашифрованное сообщение: '${algPV.encode(message, key)}', расшифрованное сообщение: '${algPV.decode(message, key)}'")
println(message.filter { it.isLetter() })
}