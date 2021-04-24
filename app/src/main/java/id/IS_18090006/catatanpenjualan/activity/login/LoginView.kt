package id.IS_18090006.catatanpenjualan.activity.login

import id.IS_18090006.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}