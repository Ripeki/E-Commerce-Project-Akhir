package com.example.e_commerceprojectakhir.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.e_commerceprojectakhir.R
import com.example.e_commerceprojectakhir.adapter.AdapterProduk
import com.example.e_commerceprojectakhir.adapter.AdapterSlider
import com.example.e_commerceprojectakhir.model.Produk

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var vpSlider: ViewPager
    lateinit var rvProduk: RecyclerView
    lateinit var rvProdukTerlasir: RecyclerView
    lateinit var rvElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvProdukTerlasir = view.findViewById(R.id.rv_produkTerlasir)
        rvElektronik = view.findViewById(R.id.rv_elektronik)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvProdukTerlasir.adapter = AdapterProduk(arrProdukTerlasir)
        rvProdukTerlasir.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduk(arrElektronik)
        rvElektronik.layoutManager = layoutManager3

        return view
    }

    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "hp vivo T1"
        p1.harga = "Rp. 4.500.000"
        p1.gambar = R.drawable.vivo_t1

        val p2 = Produk()
        p2.nama = "hp vivo T1"
        p2.harga = "Rp. 4.500.000"
        p2.gambar = R.drawable.vivo_t1

        val p3 = Produk()
        p3.nama = "hp vivo T1"
        p3.harga = "Rp. 4.500.000"
        p3.gambar = R.drawable.vivo_t1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr


    }
    val arrProdukTerlasir: ArrayList<Produk>get() {
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "hp vivo T1"
        p1.harga = "Rp. 4.500.000"
        p1.gambar = R.drawable.vivo_t1

        val p2 = Produk()
        p2.nama = "hp vivo T1"
        p2.harga = "Rp. 4.500.000"
        p2.gambar = R.drawable.vivo_t1

        val p3 = Produk()
        p3.nama = "hp vivo T1"
        p3.harga = "Rp. 4.500.000"
        p3.gambar = R.drawable.vivo_t1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
    val arrElektronik: ArrayList<Produk>get() {
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "hp vivo T1"
        p1.harga = "Rp. 4.500.000"
        p1.gambar = R.drawable.vivo_t1

        val p2 = Produk()
        p2.nama = "hp vivo T1"
        p2.harga = "Rp. 4.500.000"
        p2.gambar = R.drawable.vivo_t1

        val p3 = Produk()
        p3.nama = "hp vivo T1"
        p3.harga = "Rp. 4.500.000"
        p3.gambar = R.drawable.vivo_t1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}