package oop_124423_LysiaCallysta.week07

enum class SystemStates {
    STARTING, RUNNING, STOPPED;

    sealed class ApiResponse{
        data class Success(val data: String) : ApiResponse()
        data class Error(val error: String) : ApiResponse()

        object Loading : ApiResponse()
    }
}