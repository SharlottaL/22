//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 //22.1
    println("Сколько коробок приехало:")
    val n = readln()
    val result = parseCountOrNull(n);
    println(result)
    //22.2
    println("Введите возраст:")
    val input = readln();
    val ageTrim = input.trim()
    val age = ageTrim.toIntOrNull()
    if (age == null) {
        println("Возраст не распознан")
        return
    }
    if(age < 0) {
        println("Возраст не может быть отрицательным")
        return
    }
    else if (age <= 12) {
        println("Цена билета 500р")
    }
    else if (age < 65) {
        println("Цена билета 1000р")
    }
    else {
        println("Цена билета 600р")
    }
    //22.3
    println(formatText("  Pain  "))
    println(formatText("  yestarday  ", separator = '*'))
    println(formatText("  very  ", repeatCount = 4))
    println(formatText("  much  ", uppercase = true, separator = '%'))
}
fun parseCountOrNull(text: String): Int? {
    val textTrim = text.trim()
    if (textTrim.isEmpty())
    {
        return null
    }
    return textTrim.toIntOrNull()
}
fun formatText(text: String, trimSpaces: Boolean = true, uppercase: Boolean = false, repeatCount: Int = 1, separator: Char = ' '): String {
    var result = text
    if(trimSpaces) {
       result = result.trim()
    }
    if(uppercase) {
       result = result.uppercase()
    }
    return List(repeatCount) {result}.joinToString (separator.toString())
}
