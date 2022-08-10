# KCDC 2022 Hands on Lab

If using IntelliJ, open folder and associate your JDK 17+ (ok to trust folder)
If using Eclipse, import project and setup your JDK 17+
If using VS Code, open folder and associate your JDK 17+. (ok to trust folder)
If using JDoodle, copy/paste and be sure to choose Java 17

## Module 1: Strings and Text Blocks

1. Edit lab/module1/Reading.java so embedded() uses a text block.
2. Edit sampleXml() uses a text block instead of reading from a file.
3. Edit the text block so there is no longer trailing whitespace and the output ends with </project>*
4. Add a single line to Reading.java to print the XML with every line indented 10 positions.
5. Create another text block with the same contents except no line breaks.
6. Create another text block with the same contents except with extra line breaks.
7. Harder: Create a method that takes a Function<CharSequence, CharSequence> and adds a '+' to the beginning and end of the value. Call it with a String, StringBuilder and text block. What do you observe?
8. Fun: Use a text block to create your own ASCII art. For example, this cat comes from https://en.wikipedia.org/wiki/ASCII_art

```
   System.out.println("""
                  |\\_/|    
                 / @ @ \\   
                ( > º < )   
                 `>>x<<´    
                 /  O  \\""");
```

## Module 2: Instanceof and Switch Expressions

1. Open and run lab/module2/WeatherEmergency.java
2. Create a method handle2() that is like handle() but use pattern matching for instanceof instead of casting.
3. Create a method handle3() that is like handle() but uses switch instead of if. Be sure to include a default case to accommodate the else condition.
4. Add a new emergency class and update handle(), handle2() and handle3() to accommodate it.
5. Harder: Write a method getEmergencyName() that returns a String. The value should be unique for each emergency.

## Module 3: Records and Sealed Classes

A developer on your team just wrote the module3 package in the lab folder. Since nobody is calling it yet, we have the opportunity to refactor. (Ignore the duplication. This is just for the sake of example.)

1. Rename the methods in Session so they will be forward compatible with us making it a record in the future. Change the subclasses so they compile.
2. Session would be better as an interface. We hadn't made it one because we don't want arbitrary subclasses. Change it to be a sealed interface with two known implementers.
3. The future is here. Turn HourSession and HalfDaySession into records (refactoring didn't work when we tried). Remove all unnecessary code.
4. Harder: Add a compact constructor that validates that the start time is before the end time.
5. If you have time: Add a third implementing class called Lunch!

## Module 4: APIs

1. In lab/module4/UsingApis.java, refactor collecting() to use toList() instead of collect().
2. Implement teeing() so it returns a list of the odd numbers and the number of odd numbers (Hint: use Collectors.toList() and Collectors.count())
3. In learnings(), create a text block to say:
```
1. I learned about "%s".
2. I learned about "%s".
3. I learned about "%s"!
```
4. Call formatted() and pass in three things you learned.
5. Implement formatted() to return "1 billion"
6. No code required: Congratulate yourself on a successful conference. (I"ll be here until 5pm so feel free to experiment more and ask if you have questions)
