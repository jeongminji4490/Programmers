class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var users = mutableMapOf<String, String>()
        db.forEach { user ->
            users.put(user[0], user[1])
        }
        return if (!users.containsKey(id_pw[0])) {
            "fail"
        } else {
            if (id_pw[1]==users.get(id_pw[0])) {
                "login"
            } else {
                "wrong pw"
            }
        }
    }
}