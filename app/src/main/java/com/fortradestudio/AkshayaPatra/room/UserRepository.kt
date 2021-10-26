package com.fortradestudio.AkshayaPatra.room

class UserRepository(
    private val dao: UserDao
) {

    fun getUser()=dao.getUserFromDatabase()


    fun insertUser(user:User){
        if(dao.getSize() == 0) {
            dao.insertToDatabase(user)
        }
    }

    fun deleteFromDb() =dao.deleteFromDb()

}