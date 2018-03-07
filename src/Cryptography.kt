package cryptography

// шифры замены
//шифр Цезаря
//шифр Атбаш

// шифры перестановки
//шифр Сцитала.
//      Представлял собой длинную ленту с буквами, ключом этого шифра являлся твердый цилиндр определенного диаметра: ленту наматывали на цилиндр и получали исходный текст.
//Aнаграммы(не совсем шифр, потому как для дешифрации не используется ключ)
//шифр перестановки

//шифр Бэкона
//Диск Энея
//Квадрат Полибия
//Решетка Кардано

val AlphabetEN = " ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
val AlphabetRU = " АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".toCharArray()

fun CharArray.getNum(c: Char): Int {
    val num = indexOf(c.toUpperCase());
    if (num !in 1 until count()) {
        throw IllegalArgumentException("'$c' isn't alphabetical symbol!!!")
    }
    return num
}

class PermutationVertical {
    fun encode(message: String, key: String): String {
        var messageEncrypted = ""
        return messageEncrypted
    }

    fun decode(message: String, key: String): String {
        var messageDecrypted = ""
        return messageDecrypted
    }
}

fun main(args: Array<String>) {

    val message = "Cегодня очень теплая погода"
    val key = "кактус"

    val algorithm = PermutationVertical()
    println("Исходное сообщение: '$message', ключ: '$key'. Зашифрованное сообщение: , расшифрованное сообщение: ")

}