package com.asl.viewpager.abstracts

import android.content.Context
import com.asl.viewpager.data.Person
import com.google.gson.reflect.TypeToken
import java.io.*

class FileWriter {
    companion object{

        fun writeFile(context: Context, string: String, fileName: String){
            val file = File(context.filesDir, fileName)
            val fileWriter = FileWriter(file)
            val bufferedWriter = BufferedWriter(fileWriter)
            bufferedWriter.write(string)
            bufferedWriter.close()
        }

        fun readFile(context: Context, fileName: String): String{
                val typeToken = object : TypeToken<List<Person>>() {}.type

            val file = File(context.filesDir,fileName)
            val bufferedReader = BufferedReader(FileReader(file))
            val stringBuilder = StringBuilder()
            var line = bufferedReader.readLine()
            while(line != null){
                stringBuilder.append(line)
                line = bufferedReader.readLine()
            }
            bufferedReader.close()
            return  stringBuilder.toString()
        }
    }
}