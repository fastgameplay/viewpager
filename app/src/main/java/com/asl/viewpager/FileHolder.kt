package com.asl.viewpager

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import org.json.JSONObject
import java.io.*

class FileHolder {
    companion object{
        //aq mainc veravinvergaigebs visifexi sadaris
        //TODO: Json Class
        //TODO: Writer Class
        fun toJson(firstName: String, lastName: String, email: String, mobile: String, birthDate: String):JSONObject{
            return JSONObject().apply {
                put("FirstName", firstName)
                put("LastName", lastName)
                put("Email", email)
                put("Mobile", mobile)
                put("BirthDate", birthDate)
            }
        }
        fun toJson(mutableList: MutableList<Person>):JSONArray{
            return JSONArray(mutableList)
        }

        fun writeJson(context: Context, jsonArray: String, fileName: String){
            val file = File(context.filesDir, fileName)
            val fileWriter = FileWriter(file)
            val bufferedWriter = BufferedWriter(fileWriter)
            bufferedWriter.write(jsonArray)
            bufferedWriter.close()
        }

        fun writeJson(context: Context, jsonObject: JSONObject, fileName: String){
            val jsonString: String = jsonObject.toString()
            val file = File(context.filesDir, fileName)
            val fileWriter = FileWriter(file)
            val bufferedWriter = BufferedWriter(fileWriter)
            bufferedWriter.write(jsonString)
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