package kr.uni.retrofittest.conn

import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun checkSMS(param1: String, param2: String) =
        apiService.onCheckSMS(param1, param2)

}