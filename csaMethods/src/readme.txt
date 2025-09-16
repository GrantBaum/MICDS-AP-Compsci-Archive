safeInt: safe integer input. Catches invalid data type exceptions.
x = safeInt(scanner name, "prompt for user")

safeDouble: safe double input. Catches invalid data type exceptions.
x = safeDouble(scanner name, "prompt for user")

safeString: safe integer input. Removes bad spacing and catches empty inputs.
x = safeString(scanner name, "prompt for user")

intInRangeN: makes sure the int is within a preset range before returning the value to the rest of code (NONINCLUSIVE)
x = intInRangeN(scanner name, "prompt for user", min value, max value)

intInRangeI: makes sure the int is within a preset range before returning the value to the rest of code (INCLUSIVE)
x = intInRangeI(scanner name, "prompt for user", min value, max value)

doubleInRangeN: makes sure the double is within a preset range before returning the value to the rest of code (NONINCLUSIVE)
x = doubleInRangeN(scanner name, "prompt for user", min value, max value)

doubleInRangeI: makes sure the double is within a preset range before returning the value to the rest of code (INCLUSIVE)
x = doubleInRangeI(scanner name, "prompt for user", min value, max value)

safeIntN:combines safeInt and intInRangeN
x = safeIntN(scanner name, "prompt for user", min value, max value)

safeIntI: combines safeInt and intInRangeI
x = safeIntI(scanner name, "prompt for user", min value, max value)

safeDoubleN: combines safeDouble and doubleInRangeN
x = safeDoubleN(scanner name, "prompt for user", min value, max value)

safeDoubleI: combines safeDouble and doubleInRangeI
x = safeDoubleI(scanner name, "prompt for user", min value, max value)

QUICK PRINT: makes it so you dont have to type System.out. every time

print("content")
println("content")

arrayAvg (int, double): finds the mean of an array
arrayAvg(array name)

arrayMode (int, double, string): finds most frequent value within an array
arrayMode(array name)

arrayMedian (int, double): finds the median value of an array
arrayMedian(array name)

sort: sorts an array. arrayMedian auto sorts the array.
sort(array name)