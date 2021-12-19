package com.asl.viewpager

import android.content.Context
import org.json.JSONObject
import java.io.*

class FileHolder {
    companion object{
        fun toJson(firstName: String, lastName: String, email: String, mobile: String, birthDate: String):JSONObject{
            return JSONObject().apply {
                put("FirstName", firstName)
                put("LastName", lastName)
                put("Email", email)
                put("Mobile", mobile)
                put("BirthDate", birthDate)
            }
        }

        fun writeJson(context: Context, jsonObject: JSONObject, fileName: String){
            val jsonString: String = jsonObject.toString()
            val file = File(context.filesDir, fileName)
            val fileWriter = FileWriter(file)
            val bufferedWriter = BufferedWriter(fileWriter)
            bufferedWriter.write(jsonString)
            bufferedWriter.close()
        }

        fun readJson(context: Context, fileName: String): String{
            val file = File(context.filesDir,fileName)
            val fileReader = FileReader(file)
            val bufferedReader = BufferedReader(fileReader)
            val stringBuilder = StringBuilder()
            var line = bufferedReader.readLine()
            while(line != null){
                stringBuilder.append(line).append("\n")
                line = bufferedReader.readLine()
            }
            bufferedReader.close()
            return stringBuilder.toString();
        }
    }
}