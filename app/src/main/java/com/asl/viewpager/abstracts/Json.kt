package com.asl.viewpager.abstracts

import com.asl.viewpager.data.Person
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson

class Json {
    companion object{
        fun toObject(string: String) : List<Person>{
            val typeToken = object : TypeToken<List<Person>>() {}.type
            return Gson().fromJson(string,typeToken)
        }
        fun toJson(persons : List<Person>) : String{
            return Gson().toJson(persons)
        }

    }
}


