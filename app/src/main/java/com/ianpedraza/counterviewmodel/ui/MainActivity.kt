package com.ianpedraza.counterviewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ianpedraza.counterviewmodel.R
import com.ianpedraza.counterviewmodel.databinding.ActivityMainBinding
import com.ianpedraza.counterviewmodel.utils.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabIncrement.setOnClickListener {
            viewModel.onIncrementPressed()
        }

        viewModel.counter.observe(this) { count ->
            count?.let {
                binding.tvCount.text = count.toString()
            }
        }
    }
}