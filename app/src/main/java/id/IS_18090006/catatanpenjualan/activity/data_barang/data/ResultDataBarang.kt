package id.IS_18090006.catatanpenjualan.activity.data_barang.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import id.IS_18090006.catatanpenjualan.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultDataBarang(

    @field:SerializedName("barang")
	val barang: List<Barang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)