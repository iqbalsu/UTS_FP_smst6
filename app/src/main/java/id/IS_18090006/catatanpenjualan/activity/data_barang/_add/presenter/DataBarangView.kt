package id.IS_18090006.catatanpenjualan.activity.data_barang.presenter

import id.IS_18090006.catatanpenjualan.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}