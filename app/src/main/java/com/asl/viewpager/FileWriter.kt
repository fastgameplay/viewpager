package com.asl.viewpager

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*

class FileWriter {
    companion object{

        fun writeJson(context: Context, jsonArray: String, fileName: String){
            val file = File(context.filesDir, fileName)
            val fileWriter = FileWriter(file)
            val bufferedWriter = BufferedWriter(fileWriter)
            bufferedWriter.write(jsonArray)
            bufferedWriter.close()
        }

        fun readJson(context: Context, fileName: String): List<Person>{
            val typeToken = object : TypeToken<List<Person>>() {}.type

            val file = File(context.filesDir,fileName)
            val fileReader = FileReader(file)
            val bufferedReader = BufferedReader(fileReader)
            val stringBuilder = StringBuilder()
            var line = bufferedReader.readLine()
            while(line != null){
                stringBuilder.append(line)
                line = bufferedReader.readLine()
            }
            bufferedReader.close()

            return Gson().fromJson(stringBuilder.toString(), typeToken)
        }
    }
}