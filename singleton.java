import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    public String str;
    public static Singleton obj = null;
    private Singleton() {
            str = "Hello I am a singleton! Let me say hello world to you";
        }
    public static Singleton getSingleInstance (){
        if (obj == null)
            obj = new Singleton();
        return obj;
        }
}