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

interface ICryptography {
    fun encode(message: String, key: String): String
    fun decode(message: String, key: String): String
}

val AlphabetEN = " ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
val AlphabetRU = " АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".toCharArray()

fun CharArray.getNum(c: Char, ignoreSpace: Boolean = false): Int {
    val num = indexOf(c.toUpperCase());
    if (num == -1 || (num == 0 && ignoreSpace)) {
        throw IllegalArgumentException("'$c' isn't alphabetical symbol${if (!ignoreSpace) " оr space" else ""}")
    }
    return num
}

class PermutationVertical : ICryptography {
    override fun encode(message: String, key: String): String {
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

    val message = "Cегодня очень теплая погода"
    val key = "кактус"

    val algorithmPV = PermutationVertical()
    println("Исходное сообщение: '$message', ключ: '$key'. Зашифрованное сообщение: '${algorithmPV.encode(message, key)}', расшифрованное сообщение: '${algorithmPV.decode(message, key)}'")


}