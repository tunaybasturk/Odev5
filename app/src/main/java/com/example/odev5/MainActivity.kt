package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.odev5.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val hesapEkraniList = ArrayList<String>()
    var tiklandimiEsit = false
    var virgulSayac = 0

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            hesapEkraniList.add("0")

            binding.button0.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = "0"
                }else{
                    if (tiklandimiEsit == true) {
                        tiklandimiEsit = false
                        hesapEkraniList.clear()
                        binding.TextViewHesapEkrani.text = ""
                        binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "0"
                        hesapEkraniList.add("0")
                    } else {
                        binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "0"
                        hesapEkraniList.add("0")
                    }
                }
            }

            binding.button1.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "1"
                    hesapEkraniList.add("1")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "1"
                    hesapEkraniList.add("1")
                }
            }

            binding.button2.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "2"
                    hesapEkraniList.add("2")
                }
                binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "2"
                hesapEkraniList.add("2")
            }

            binding.button3.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "3"
                    hesapEkraniList.add("3")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "3"
                    hesapEkraniList.add("3")
                }
            }

            binding.button4.setOnClickListener {
                Log.e("Saturn", "Tıklanyıor")
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "4"
                    hesapEkraniList.add("4")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "4"
                    hesapEkraniList.add("4")
                }
            }

            binding.button5.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "5"
                    hesapEkraniList.add("5")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "5"
                    hesapEkraniList.add("5")
                }
            }

            binding.button6.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "6"
                    hesapEkraniList.add("6")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "6"
                    hesapEkraniList.add("6")
                }
            }

            binding.button7.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "7"
                    hesapEkraniList.add("7")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "7"
                    hesapEkraniList.add("7")
                }
            }

            binding.button8.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "8"
                    hesapEkraniList.add("8")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "8"
                    hesapEkraniList.add("8")
                }
            }

            binding.button9.setOnClickListener {
                if (binding.TextViewHesapEkrani.text == "0") {
                    binding.TextViewHesapEkrani.text = ""
                    hesapEkraniList.clear()
                }
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    binding.TextViewHesapEkrani.text = ""
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "9"
                    hesapEkraniList.add("9")
                } else {
                    binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "9"
                    hesapEkraniList.add("9")
                }
            }

            binding.buttonVirgul.setOnClickListener {
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                    hesapEkraniList.clear()
                    hesapEkraniList.add("0")
                    binding.TextViewHesapEkrani.text = "0"
                }
                if (hesapEkraniList.last() == "," || hesapEkraniList.last() == "+" || virgulSayac == 1) {
                    Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                }else{
                    if (hesapEkraniList.isEmpty()) {
                        Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                    } else {
                        if (hesapEkraniList.last() == "+" || hesapEkraniList.last() == ",") {
                            Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                        } else {
                            binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + ","
                            virgulSayac++
                            hesapEkraniList.add(",")
                        }
                    }
                }

            }

            binding.buttonDelete.setOnClickListener(){
                if(hesapEkraniList.isEmpty()){
                }else{
                    var silmeOncesi = binding.TextViewHesapEkrani.text.toString()
                    var silmeSonrasi = ""
                    for (i in 0..silmeOncesi.length-1){
                        if(i != silmeOncesi.length-1){
                            silmeSonrasi += silmeOncesi[i]
                        }
                    }
                    binding.TextViewHesapEkrani.text = silmeSonrasi
                    hesapEkraniList.removeAt(hesapEkraniList.lastIndex)
                }
            }


            binding.buttonAC.setOnClickListener {
                binding.TextViewHesapEkrani.text = ""
                binding.TextViewGecmis.text = ""
                hesapEkraniList.clear()
            }

            binding.buttonArti.setOnClickListener {
                if (tiklandimiEsit == true) {
                    tiklandimiEsit = false
                }
                if (hesapEkraniList.isEmpty()) {
                    Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                } else {
                    if (hesapEkraniList.last() == "+" || hesapEkraniList.last() == ",") {
                        Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                    } else {
                        binding.TextViewHesapEkrani.text = binding.TextViewHesapEkrani.text.toString() + "+"
                        hesapEkraniList.add("+")
                        virgulSayac = 0
                    }
                }
            }

            binding.buttonSonuc.setOnClickListener {
                var sayilar = binding.TextViewHesapEkrani.text.toString()
                var sayi = ""
                var toplamFloat = 0.0
                var toplamInt = 0
                var gecmis = ""
                var floatSayiVarmi = false

                if(hesapEkraniList.size == 0){
                }else{
                    if (hesapEkraniList.last() == "+" || hesapEkraniList.last() == ",") {
                        Snackbar.make(it, "Geçersiz Biçim Kullanıldı", Snackbar.LENGTH_SHORT).show()
                    } else {
                        tiklandimiEsit = true
                        virgulSayac = 0

                        if (sayilar.contains(",")) {//Virgüllü sayıları virgüllerini noktaya çevirerek float yapma
                            sayilar = sayilar.replace(",", ".")
                            floatSayiVarmi = true
                        }

                        for (i in sayilar) {
                            if (i.toString() != "+") {
                                sayi += i.toString()
                            }
                            if (i.toString() == "+") {
                                if (floatSayiVarmi == true) {
                                    toplamFloat += sayi.toFloat()
                                    sayi = ""
                                } else {
                                    toplamInt += sayi.toInt()
                                    sayi = ""
                                }
                            }
                        }

                        if (floatSayiVarmi == true) {
                            toplamFloat += sayi.toFloat()
                            val formatliToplam = String.format("%.3f", toplamFloat)
                            binding.TextViewHesapEkrani.text = formatliToplam

                            for (i in hesapEkraniList) {
                                gecmis += i
                            }

                            binding.TextViewGecmis.text = binding.TextViewGecmis.text.toString() + " " + gecmis + " =" + "\n" + formatliToplam + "\n"
                            hesapEkraniList.clear()

                            for(i in formatliToplam){
                                hesapEkraniList.add(i.toString())
                            }

                        } else {
                            toplamInt += sayi.toInt()
                            binding.TextViewHesapEkrani.text = toplamInt.toString()

                            for (i in hesapEkraniList) {
                                gecmis += i
                            }

                            binding.TextViewGecmis.text = binding.TextViewGecmis.text.toString() + " " + gecmis + " =" + "\n" + toplamInt.toString() + "\n"
                            hesapEkraniList.clear()

                            var toplamIntString = toplamInt.toString()

                            for(i in toplamIntString){
                                hesapEkraniList.add(i.toString())
                            }
                        }
                    }
                }

            }
        }
    }


