package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = !name.isEmpty() && !Character.isDigit(name.charAt(0))
                && !Character.isUpperCase(name.charAt(0));
        if (rsl) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code) && isUpperLatinLetter(code)
                        && isLowerLatinLetter(i) && Character.isDigit(name.charAt(i))) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * метод должен вернуть true,
     * если символ является символом доллара
     * и нижнее подчеркивание;
     * @param code
     * @return
     */
    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    /**
     * метод должен вернуть true,
     * если символ является прописным
     * латинским символом;
     * @param code
     * @return
     */
    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase(code);
    }

    /**
     * метод должен вернуть true,
     * если символ является строчным
     * латинским символом.
     * @param code
     * @return
     */
    public static boolean isLowerLatinLetter(int code) {
        return Character.isLowerCase(code);
    }
}