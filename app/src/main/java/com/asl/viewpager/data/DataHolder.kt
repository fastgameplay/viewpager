package com.asl.viewpager.data

object DataHolder {
    private var persons : List<Person> = listOf()
    var Persons: List<Person> = persons
        get() = persons
    //todo check version according to server last version
    private var version:String = "0"

    fun setData(_persons:List<Person>){
        persons = _persons
    }

    fun checkVersion(_version: String):Boolean = version == _version

    fun updateData(_persons: List<Person>, _version: String){
        persons = _persons
        version = _version
    }
}